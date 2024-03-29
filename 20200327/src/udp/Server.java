package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

// 重构第一步：把收到的请求内容，作为响应直接发送回去 —— 回显服务
// 重构第二步：多加一些调试打印信息，便于观察发生了什么

// Server 必须公开出 port，否则客户端找不到我
// 端口(port) 可以在 0 - 65535 之间随便选
// 但是不能使用已经被其他进程使用的端口 —— 端口只能属于唯一的一个进程
public class Server {
    static final int PORT = 9527;
    static final String CHARSET = "UTF-8";

    public static void main(String[] args) throws IOException {
        // 创建套接字
        // DatagramSocket 是 UDP 协议专用的 套接字
        // PORT 是我选好的准备开饭店的地址
        System.out.println("DEBUG: 准备开一家饭店");
        try (DatagramSocket serverSocket = new DatagramSocket(PORT)) {
            System.out.printf("DEBUG: 在 %d 这个端口上开好一家饭店了%n", PORT);

            // 提前准备好一个字节数组，用来存放接收到的数据（请求）
            // 一次最多可以接收 8192 个字节
            byte[] receiveBuffer = new byte[8192];

            while (true) {
                System.out.println("=======================================================");
                // 一次循环就是 一次 请求-响应 的处理过程

                // 1. 接收对方发送来的请求（数据）
                // 1.1 必须先创建 DatagramPacket 数据报文对象
                DatagramPacket packetFromClient = new DatagramPacket(
                        receiveBuffer, 0, receiveBuffer.length
                );
                System.out.println("DEBUG: 准备好了接收用的 packet");
                // 1.2 接收数据
                serverSocket.receive(packetFromClient); // 这个方法不是立即返回的，和 scanner.nextLine();
                System.out.println("DEBUG: 真正收到了客户端发来的数据");
                // 当走到这里时，数据一定接收到了
                // packetFromClient.getLength(); 一个收到了多少字节的数据

                // 1.3 因为我们收到的是字节格式的数据，所以我们把数据节码成字符格式的
                //     需要字符集编码的知识
                //     利用 String 的一个构造方法，把字节数组的数据解码(decode)成字符格式的数据 String
                String request = new String(
                        receiveBuffer, 0, packetFromClient.getLength(),
                        CHARSET
                );

                System.out.println("DEBUG: 收到的请求是: " + request);

                // 1.4 我们跳过了理解请求的这一步 —— 我们没有设计应用层协议

                // 1.5 业务处理
                String response = request;

                // 1.6 发送响应

                // 如何获取客户端进程的 ip + port
                InetAddress clientAddress = packetFromClient.getAddress();
                int clientPort = packetFromClient.getPort();
                System.out.printf("DEBUG: 客户端的唯一标识是(%s:%d)%n",
                        clientAddress.getHostAddress(), clientPort);

                byte[] responseBytes = response.getBytes(Server.CHARSET);
                DatagramPacket packetToClient = new DatagramPacket(
                        responseBytes, 0, responseBytes.length,     // 要发送的数据
                        clientAddress, clientPort                          // 要发送给客户端进程
                );
                System.out.println("DEBUG: 准备好了发送用的 packet");

                serverSocket.send(packetToClient);
                System.out.println("DEBUG: 成功把响应发送给客户端了");
                System.out.println("=======================================================");
            }
        }
    }
}

