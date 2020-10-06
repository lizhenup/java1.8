import java.util.*;

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/17 19:29
 * @description：
 * @modified By：
 * @version: $
 */
public class Main {
    //399ashjha10000iwknksnk100asn125861568451 256
    public static void main(String[] args) {
        String s = "aaaaabbbbbbbbbbbbbbccccccccdassasaasass";//a5b14c8das2asa2sas2c
        char[] c = s.toCharArray();
        int end = compress(c);
        for (int i = 0; i < end; i++) {
            System.out.print(c[i]);
        }
    }

    public static int compress(char[] chars) {
        int n = chars.length;
        int cur = 0;
        for (int i = 0, j = 0; i < n; i = j) {
            while (j < n && chars[j] == chars[i]) {
                j++;
            }
            chars[cur++] = chars[i];
            if(j - i == 1) {
                continue;
            }
            for (char c : String.valueOf(j - i).toCharArray()) {
                chars[cur++] = c;
            }
        }
        return cur;
    }
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            StringBuffer sb = new StringBuffer();
            ArrayList<String> ret = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c >= '0' && c <= '9') {
                    sb.append(c);
                }else {
                    if(sb.length() == 4
                            && sb.charAt(0) >= '1' && sb.charAt(0) <= '3') {
                        ret.add(new String(sb));
                    }
                    sb.delete(0,sb.length());
                }

            }
            if(sb.length() == 4) {
                int year = Integer.valueOf(sb.toString());
                if(year >= 1000 && year <= 3999) {
                    ret.add(sb.toString());
                }
            }
            if(ret.size() > 0) {
                for (int i = 0; i < ret.size() - 1; i++) {
                    System.out.print(ret.get(i) + " ");
                }
                System.out.println(ret.get(ret.size() - 1));
            }else {
                System.out.println();
            }
        }
    }*/
    /*static boolean flg = false;
    static boolean[][] booleans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            while (num-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int stX = 0;
                int stY = 0;
                int edX = 0;
                int edY = 0;
                char[][] ch = new char[n][m];
                booleans = new boolean[n][m];
                for (int i = 0; i < n; i++) {
                    char[] s = sc.next().toCharArray();
                    for (int j = 0; j < m; j++) {
                        ch[i][j] = s[j];
                        if(s[j] == 'S') {
                            stX = i;
                            stY = j;
                        }
                        if(s[j] == 'E') {
                            edX = i;
                            edY = j;
                        }
                    }
                }
                flg = false;
                dfs(stX,stY,edX,edY,ch);
                if(flg) {
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
        }
    }

    private static void dfs(int stX, int stY, int edX, int edY, char[][] ch) {
        if(stX == edX && stY == edY) {
            flg = true;
            return;
        }
        if(!flg) {
            if(stX - 1 >= 0 && (ch[stX - 1][stY] == '.' || ch[stX - 1][stY] == 'E') && !booleans[stX - 1][stY]) {
                booleans[stX - 1][stY] = true;
                dfs(stX - 1,stY,edX,edY,ch);
            }
            if(stX + 1 <= ch.length - 1 && (ch[stX + 1][stY] == '.' || ch[stX + 1][stY] == 'E' && !booleans[stX + 1][stY])) {
                booleans[stX + 1][stY] = true;
                dfs(stX + 1,stY,edX,edY,ch);
            }
            if(stY - 1 >= 0 && (ch[stX][stY - 1] == '.' || ch[stX][stY - 1] == 'E') && !booleans[stX][stY - 1]) {
                booleans[stX][stY - 1] = true;
                dfs(stX,stY - 1,edX,edY,ch);
            }
            if(stY + 1 <= ch[0].length - 1 && (ch[stX][stY + 1] == '.' || ch[stX][stY  + 1] == 'E')) {
                booleans[stX][stY + 1] = true;
                dfs(stX,stY + 1,edX,edY,ch);
            }
        }
    }*/
}
            /*if(c >= '1' && c <= '3' && !flg) {
                    flg = true;
                    sb.append(c);
                }else if(flg) {
                    if(c >= '0' && c <= '9') {
                        if(sb.length() < 4) {
                            sb.append(c);
                        }else {
                            sb.delete(0, sb.length());
                            flg = false;
                        }
                    }else {
                        if(sb.length() == 4) {
                            ret.add(new String(sb));
                        }
                        sb.delete(0,4);
                        flg = false;
                    }
                }*/
