import java.util.*;

public class Main {
    /*static int flag = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String[] in = sc.nextLine().split(" ");
            String[] pay = in[0].split("\\.");
            String[] money = in[1].split("\\.");
            int[] ret = new int[3];
            int K = sub(Integer.parseInt(money[2]),Integer.parseInt(pay[2]),29);
            int S = sub(Integer.parseInt(money[1]),Integer.parseInt(pay[1]),17);
            int G = sub(Integer.parseInt(money[0]),Integer.parseInt(pay[0]),0);
            if(G < 0 && (S != 0 || K != 0)) {
                ret[0] = G+1;
                int flg = 0;
                if(K != 0) {
                    ret[2] = 29-K;
                    flg = -1;
                }
                ret[1] = 17-S+flg;
            }
            for (int i = 0; i < 2; i++) {
                System.out.print(ret[i] + ".");
            }
            System.out.println(ret[2]);
        }
    }
    public static int sub(int i, int j, int BIN) {
        if(i-j+flag >= 0) {
            int tmp = flag;
            flag = 0;
            return i-j+tmp;
        }else {
            int tmp = flag;
            flag = -1;
            return i-j+tmp+BIN;
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] in = sc.nextLine().split(" ");
            String[] pay = in[0].split("\\.");
            String[] money = in[1].split("\\.");
            int payAll = Integer.parseInt(pay[0])*29*17+Integer.parseInt(pay[1])*29+Integer.parseInt(pay[2]);
            int moneyAll = Integer.parseInt(money[0])*29*17+Integer.parseInt(money[1])*29+Integer.parseInt(money[2]);
            int ret = moneyAll-payAll;
            if(ret < 0) {
                System.out.print("-");
                ret = -ret;
            }
            System.out.println(ret/(17*29)+"."+(ret%(17*29))/29+"."+

            );
        }
    }
}
