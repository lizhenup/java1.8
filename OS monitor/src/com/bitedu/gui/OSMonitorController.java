package com.bitedu.gui;
import com.bitedu.osm.FileScanner;
import com.bitedu.osm.FileTreeNode;
import com.bitedu.osm.OSResource;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Tab;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.lang.management.PlatformLoggingMXBean;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
public class OSMonitorController {
    @FXML private LineChart cpuChart;
    @FXML private TreeTableView fileStat;
    @FXML private Text osType;
    @FXML private Text cpuCore;
    @FXML private Text cpuArch;
    private TimerTask timerTask = null;
    private Timer timer = new Timer();
    private final Image image = new Image(
        getClass().getClassLoader().getResourceAsStream("Folder.png")
    );

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    private Stage primaryStage = null;
    public void handleCPUSelectionChanged(Event event) {
        Tab tab = (Tab)event.getTarget();
        if(tab.isSelected()) {
            timerTask = new TimerTask() {
                @Override
                public void run() {
                    OSResource.XYPair[] xyPairs = OSResource.getCPUPercentage();
                    XYChart.Series series = new XYChart.Series();
                    for (OSResource.XYPair xyPair: xyPairs) {
                        XYChart.Data data = new XYChart.Data(xyPair.getX(),xyPair.getY());
                        series.getData().add(data);
                    }
                    Platform.runLater(
                            () -> {
                                if (cpuChart.getData().size() > 0) {
                                    cpuChart.getData().remove(0);
                                }
                                cpuChart.getData().add(series);
                                osType.setText(OSResource.getOSName());
                                cpuCore.setText(OSResource.getCPUNumber());
                                cpuArch.setText(OSResource.getCPUArch());
                            }
                    );
                }
            };
            //0表示任务安排好后 立即执行一次
            //表示周期执行时间 单位毫秒（ms）
            timer.schedule(timerTask,0,1000);
        }else{
            if(timerTask != null) {
                timerTask.cancel();
                timerTask = null;
            }
        }
    }
    public void shutdown() {
        if(timer != null) {
            timer.cancel();
        }
    }
    public void handleSelectFile(ActionEvent actionEvent) {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        File file = directoryChooser.showDialog(primaryStage);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                FileTreeNode rootNode = new FileTreeNode();
                rootNode.setFile(file);
                rootNode.setFileName(file.getName());
                FileScanner.scannerDirectory(rootNode);
                TreeItem rootItem = new TreeItem(rootNode,new ImageView(image));
                rootItem.setExpanded(true);
                fillTreeItem(rootNode,rootItem);
                Platform.runLater(
                        () -> {
                            fileStat.setRoot(rootItem);
                        }
                );
            }
        });
        thread.setDaemon(true);
        thread.start();
    }
    private void fillTreeItem(FileTreeNode rootNode, TreeItem rootItem) {
        fileStat.setRoot(null);
        List<FileTreeNode> childs = rootNode.getChildrens();
        for (FileTreeNode node: childs) {
            TreeItem item = new TreeItem(node);
            if(node.getChildrens().size() > 0) {
                item.setGraphic(new ImageView(image));
            }
            rootItem.getChildren().add(item);
            fillTreeItem(node,item);
        }
    }
}

