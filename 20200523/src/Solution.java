import java.awt.*;
import java.util.*;


public class Solution {
    static boolean tmp = false;
    public  String playchess (String[] chessboard) {
        // write code here
        char[][] ch = new char[chessboard.length][chessboard[0].length()];
        boolean[] flg = new boolean[4];
        int[] x = new int[4];
        int[] y = new int[4];
        for(int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length(); j++) {
                ch[i][j] = chessboard[i].charAt(j);
                if(ch[i][j]=='B') {
                    flg[0] = true;
                    x[0] = i;
                    y[0] = j;
                }else if(ch[i][j] =='J') {
                    flg[1] = true;
                    x[1] = i;
                    y[1] = j;
                }else if(ch[i][j] =='C') {
                    flg[2] = true;
                    x[2] = i;
                    y[2] = j;
                }else if(ch[i][j] =='P') {
                    flg[3] = true;
                    x[3] = i;
                    y[3] = j;
                }
            }
        }
        if(flg[0]) {
            if(doWin(x[0],y[0],ch,chessboard[0].length(),chessboard.length)) {
                return "Happy";
            }
        }
        if(flg[1]) {
            if(doWin(x[1],y[1],ch,chessboard[0].length(),chessboard.length)) {
                return "Happy";
            }
        }
        if(flg[2]) {
            for (int i = x[2] + 1; i < chessboard[0].length(); i++) {
                if(ch[x[2]][i] != '.') {
                    if(ch[x[2]][i] == 'j') {
                        return "Happy";
                    }
                    break;
                }
            }
            for (int i = x[2] - 1; i >= 0; i--) {
                if(ch[x[2]][i] != '.') {
                    if(ch[x[2]][i] == 'j') {
                        return "Happy";
                    }
                    break;
                }
            }
            for (int i = y[2] + 1; i < chessboard.length; i++) {
                if(ch[i][y[2]] != '.') {
                    if(ch[i][y[2]] == 'j') {
                        return "Happy";
                    }
                    break;
                }
            }
            for (int i = y[2] - 1; i >= 0; i--) {
                if(ch[i][y[2]] != '.') {
                    if(ch[i][y[2]] == 'j') {
                        return "Happy";
                    }
                    break;
                }
            }
        }

        if(flg[3]) {
            for (int i = y[3] + 1; i < chessboard[0].length(); i++) {
                if(ch[x[3]][i] != '.') {
                    if(doWin2(x[3],i,ch)) {
                        return "Happy";
                    }
                }
            }
            for (int i = y[3] - 1; i >= 0; i--) {
                if(ch[x[3]][i] != '.') {
                    if(doWin2(x[3],i,ch)) {
                        return "Happy";
                    }
                }
            }
            for (int i = x[3] + 1; i < chessboard.length; i++) {
                if(ch[i][y[3]] != '.') {
                    if(doWin2(i,y[3],ch)) {
                        return "Happy";
                    }
                }
            }
            for (int i = x[3] - 1; i >= 0; i--) {
                if(ch[i][y[3]] != '.') {
                    if(doWin2(i,y[3],ch)) {
                        return "Happy";
                    }
                }
            }
        }
        return "Sad";
    }

    private  boolean doWin2(int x, int y, char[][] ch) {
        if(ch[x][y] == 'j') {
            if(tmp) {
                return true;
            }
        }else {
            if(!tmp) {
                tmp = true;
            }else {
                tmp = false;
            }
        }
        return false;
    }

    private  boolean doWin(int x, int y,char[][] ch,int len1,int len2) {
        if(x - 1 >= 0) {
            if(ch[x - 1][y] == 'j') {
                return true;
            }
        }
        if(y - 1 >= 0) {
            if(ch[x][y - 1] == 'j') {
                return true;
            }
        }
        if(x + 1 < len2) {
            if(ch[x + 1][y] == 'j') {
                return true;
            }
        }
        if(y + 1 < len1) {
            if(ch[x][y + 1] == 'j') {
                return true;
            }
        }
        return false;
    }

    public  int producemask (int n, int m, Point[][] strategy) {
        // write code here
        int[][] dp = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                //当前状态下可能不选取任何策略。
                dp[i][j] = dp[i-1][j];
                //枚举每一种策略，然后选取当前状态的最优解。
                for(Point p :strategy[i-1]){
                    if(j < p.x) continue;
                    dp[i][j] = Math.max(dp[i-1][j-p.x]+p.y,dp[i][j]);
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,5};
        int[] b = {1,3,4,5};
        System.out.println(Throwdice(4,4,a,b));;

    }
    public static String Throwdice (int n, int m, int[] a, int[] b) {
        // write code here
        Arrays.sort(a);
        Arrays.sort(b);
        return Num(a,n) > Num(b,n)? "Happy":"Sad";
    }
    public static long Num (int[] t, int n){
        long num = 0;
        for(int i = 0; i < n; i++){
            if(t[i] > num +1) break;
            num += t[i];
        }
        return num;
    }
}