/**
 * @author ：lizhen
 * @date ：Created in 2020/9/20 20:33
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.*;

public class Main {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String S1= sc.nextLine();
            String S2= sc.nextLine();
            HashMap<Character, Integer> map = new HashMap<>();
            int ret = 0;
            for (int i = 0; i < S1.length(); i++) {
                char c = S1.charAt(i);
                map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
            }
            for (int i = 0; i < S2.length(); i++) {
                char c = S2.charAt(i);
                if(map.containsKey(c) && map.get(c) > 0) {
                    map.put(c, map.get(c) - 1);
                    ret++;
                }
            }
            System.out.println(ret);
        }
    }*/
    //1
    /*

        1
        6  11
        ###########
        #@******..#
        #.....****#
        #****..***#
        #.........#
        ######**###

        1
        6 5
        #####
        #@*.#
        #.**#
        #*.*#
        #...#
        #**##
    *
    *
    * */
    static int ret = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            while (num-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                char[][] ch = new char[n][m];
                char[][] flg = new char[n][m];
                int stX = 0;
                int stY = 0;
                for (int i = 0; i < n; i++) {
                    char[] s = sc.next().toCharArray();
                    for (int j = 0; j < m; j++) {
                        ch[i][j] = s[j];
                        flg[i][j] = s[j];
                        if(ch[i][j] == '@') {
                            stX = i;
                            stY = j;
                        }
                    }
                }
                ret = Integer.MAX_VALUE;
                dfs1(stX,stY,0,flg);
                System.out.println();
                if(ret == Integer.MAX_VALUE) {
                    System.out.println(-1);
                }else {
                    if(ret == 0) {
                        System.out.println(0);
                    }else {
                        dfs2(stX,stY,0,ch);
                        System.out.println(ret);
                    }
                }
            }
        }
    }

    private static void dfs1(int stX, int stY, int k, char[][] flg) {
        if(stX == 0 || stY == 0 || stX == flg.length - 1 || stY == flg[0].length - 1) {
            ret = Math.min(ret,k);
            return;
        }
        if(stX - 1 >= 0) {
            if(flg[stX - 1][stY] == '.') {
                flg[stX][stY] = '#';
                dfs1(stX - 1,stY,k,flg);
            }else if(flg[stX - 1][stY] == '*') {
                flg[stX][stY] = '#';
                dfs1(stX - 1,stY,k + 1,flg);
            }
        }
        if(stY - 1 >= 0) {
            if(flg[stX][stY - 1] == '.') {
                flg[stX][stY] = '#';
                dfs1(stX,stY - 1,k,flg);
            }else if(flg[stX][stY - 1] == '*') {
                flg[stX][stY] = '#';
                dfs1(stX,stY - 1,k + 1,flg);
            }
        }
        if(stX + 1 < flg.length) {
            if(flg[stX + 1][stY] == '.') {
                flg[stX][stY] = '#';
                dfs1(stX + 1,stY,k,flg);
            }else if(flg[stX + 1][stY] == '*') {
                flg[stX][stY] = '#';
                dfs1(stX + 1,stY,k + 1,flg);
            }
        }
        if(stY + 1 < flg[0].length) {
            if(flg[stX][stY + 1] == '.') {
                flg[stX][stY] = '#';
                dfs1(stX,stY + 1,k,flg);
            }else if(flg[stX][stY + 1] == '*') {
                flg[stX][stY] = '#';
                dfs1(stX,stY + 1,k + 1,flg);
            }
        }
    }

    private static void dfs2(int stX, int stY, int k,char[][] ch) {
        if(stX == 0 || stY == 0 || stX == ch.length - 1 || stY == ch[0].length - 1) {
            ret = Math.min(ret,k);
            return;
        }
        if(stX - 1 >= 0) {
            if(ch[stX - 1][stY] == '.' && k <= ret) {
                dfs1(stX - 1,stY,k,ch);
            }else if(ch[stX - 1][stY] == '*' && k + 1 <= ret) {
                dfs1(stX - 1,stY,k + 1,ch);
            }
        }
        if(stY - 1 >= 0) {
            if(ch[stX][stY - 1] == '.' && k <= ret) {
                dfs1(stX,stY - 1,k,ch);
            }else if(ch[stX][stY - 1] == '*' && k + 1 <= ret) {
                dfs1(stX,stY - 1,k + 1,ch);
            }
        }
        if(stX + 1 < ch.length) {
            if(ch[stX + 1][stY] == '.' && k <= ret) {
                dfs1(stX + 1,stY,k,ch);
            }else if(ch[stX + 1][stY] == '*' && k + 1 <= ret) {
                dfs1(stX + 1,stY,k + 1,ch);
            }
        }
        if(stY + 1 < ch[0].length) {
            if(ch[stX][stY + 1] == '.' && k <= ret) {
                dfs1(stX,stY + 1,k,ch);
            }else if(ch[stX][stY + 1] == '*' && k + 1 <= ret) {
                dfs1(stX,stY + 1,k + 1,ch);
            }
        }

    }
}
