import java.util.*;

public class newCode0406 {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String[] Strs = sc.nextLine().split(" ");
            System.out.println(Arrays.toString(Strs));
            Stack<String> stack = new Stack<String>();
            for(String str : Strs) {
                stack.push(str);
            }
            while(!stack.isEmpty()) {
                if(stack.size() == 1) {
                    System.out.println(stack.pop());
                }else {
                    System.out.print(stack.pop() + " ");
                }
            }
        }
    }*/
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            LinkedHashMap<String,Integer> map = new LinkedHashMap<String, Integer>();
            while (sc.hasNext()) {
                String[] Str = sc.nextLine().split("\\\\");
                String totalName = Str[Str.length-1];
                map.put(totalName,map.containsKey(totalName) ? map.get(totalName)+1 : 1);
            }
            sc.close();
            List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });
            for (int i = 0; i < 8; i++) {
                String[] ret = list.get(i).getKey().split(" ");
                if(ret[0].length() > 16) {
                    String r = ret[0].substring(ret[0].length()-16,ret[0].length());
                    System.out.println(r + " " + ret[1] + " " + list.get(i).getValue());
                }else {
                    System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());
                }
            }
        }
}

