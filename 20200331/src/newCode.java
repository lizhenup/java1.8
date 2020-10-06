import java.util.*;

public class newCode {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] nums = sc.nextLine().split(" ");
            int key = sc.nextInt();
            LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
            int i = 0;
            for(String num : nums) {
                map.put(Integer.parseInt(num),i++);
            }
            if(map.containsKey(key)) {
                System.out.println(map.get(key));
            }else {
                System.out.println(-1);
            }
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String[] ip = sc.nextLine().split("\\.");
            long Tip = sc.nextLong();
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
            Queue<Long> queue = new LinkedList<Long>();
            for(int i = 0; i < t.length(); i += 8) {
                queue.offer(Long.parseLong(t.substring(i,i+8),2));
            }
            while (!queue.isEmpty()) {
                if(queue.size() == 1) {
                    System.out.println(queue.poll());
                    return;
                }
                System.out.print(queue.poll() +".");
            }
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

