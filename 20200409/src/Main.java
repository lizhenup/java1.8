import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int time = sc.nextInt();
            int treeNum = sc.nextInt();
            int hp = sc.nextInt();
            int aoe = sc.nextInt();
            sc.nextLine();
            System.out.println(func(time,treeNum,hp,aoe));
        }
    }

    private static int func(int time, int treeNum, int hp, int aoe) {
        if(time < hp) {
            return 0;
        }
        if(treeNum >= aoe) {
            return aoe*time>=treeNum*hp ? treeNum : aoe*time/hp;
        }else {
            return treeNum;
        }
    }
}