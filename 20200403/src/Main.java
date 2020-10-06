import java.util.*;

public class Main {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            char[] ch = sc.nextLine().toCharArray();
            for(char c : ch) {
                int tmp = (int)c;
                StringBuffer sb = new StringBuffer(java.lang.Integer.toBinaryString(tmp));
                while (sb.length() < 7) {
                    sb.insert(0,"0");
                }
                char[] chars = new String(sb).toCharArray();
                int count = 0;
                for(char cs : chars) {
                    if(cs == '1') {
                        count++;
                    }
                }
                if(count % 2 == 0) {
                    sb.insert(0,"1");
                    System.out.println(sb);
                }else {
                    sb.insert(0,"0");
                    System.out.println(sb);
                }
            }
        }
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] str = new String[n];
            for(int i = 0; i < str.length; i++) {
                str[i] = sc.nextLine();
            }
            quickSort(str,0,str.length-1);
            for(String s : str) {
                System.out.println(s);
            }
        }
    }

    private static void quickSort(String[] str, int left, int right) {
        if(left > right) {
            return;
        }
        int i = left,j = right;
        String tmp = str[left];
        while (i != j) {
            while (i < j && !find(tmp,str[j],0)) {
                j--;
            }
            while (i < j && find(tmp,str[i],1)) {
                i++;
            }
            if(i < j) {
                String tmep = str[i];
                str[i] = str[j];
                str[j] = tmep;
            }
        }
        str[left] = str[i];
        str[i] = tmp;
        quickSort(str,left,i-1);
        quickSort(str,i+1,right);
    }

    private static boolean find(String tmp, String s,int flag) {
        if(tmp.length() > s.length()) {
            return true;
        }else if(tmp.length() == s.length()) {
            if(tmp.equals(s)) {
                if(flag == 0) {
                    return false;
                } else {
                    return true;
                }
            }
            for (int i = 0; i < tmp.length(); i++) {
                if(tmp.charAt(i) > s.charAt(i)) {
                    return true;
                }
                if(tmp.charAt(i) < s.charAt(i)) {
                    return false;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String[] ip = sc.nextLine().split("\\.");
            long Tip = Long.parseLong(sc.nextLine());
            StringBuffer sb = new StringBuffer();
            for(String i : ip) {
                sb.append(func(Long.parseLong(i)));
            }
            System.out.println(Long.parseLong(sb.toString(),2));
            String t = Long.toBinaryString(Tip);
            if(t.length()<32){
                int len=t.length();
                for (int j = 0; j < 32-len; j++) {
                    t="0"+t;
                }
            }
            StringBuffer s = new StringBuffer();
            String[] ips = new String[4];
            ips[0] = t.substring(0,8);
            ips[1] = t.substring(8,16);
            ips[2] = t.substring(16,24);
            ips[3] = t.substring(24);
            for(int i=0;i<4;i++){
                s.append(Integer.parseInt(ips[i],2));
                if(i!=3){
                    s.append(".");
                }
            }
            System.out.println(s);
        }
    }
    public static String func(long ip) {
        if(ip == 0) {
            return "00000000";
        }
        int tmp;
        String ret = "";
        for(long i = ip; i >= 1; i = i / 2) {
            if(i % 2 == 0) {
                tmp = 0;
            }else {
                tmp = 1;
            }
            ret = tmp + ret;
        }
        while (ret.length() % 8 != 0) {
            ret = "0" + ret;
        }
        return ret;
    }
}

