import java.util.*;

public class Main {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            char[] ch = sc.nextLine().toCharArray();
            HashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
            for(int i = 0; i < 26; i++) {
                char c = (char) ('A'+i);
                map.put(c,0);
            }
            for(char c : ch) {
                if(map.containsKey(c)) {
                    map.put(c,map.get(c)+1);
                }
            }
            Set<Character> set = map.keySet();
            for (char s : set) {
                System.out.println(s+":"+map.get(s));
            }

        }
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            char[] ch = sc.nextLine().toCharArray();
            StringBuffer sb = new StringBuffer();
            for(int i = 2; i < ch.length; i++) {
                sb.append(ch[i]);
            }
            String  ret = new String(sb);
            System.out.println(Integer.parseInt(ret,16));
        }
    }

    private static String Len(String s) {
        if(s.length() < 8) {
            s = '0'+s;
        }
        return s;
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < num; i++) {
            int handle = sc.nextInt();
            int len = sc.nextInt();
            if(handle == 1) {
                list.add(len);
            }else {
                int index = list.indexOf(len);
                list.remove(index);
            }
            isPolygon(list);
        }
    }

    private static void isPolygon(ArrayList<Integer> list) {
        if(list.size() < 3) {
            System.out.println("No");
            return;
        }
        Collections.sort(list,Collections.reverseOrder());
        int max = list.get(0),sum = 0;
        for(int i = 1; i < list.size(); i++) {
            sum+=list.get(i);
        }
        if(sum > max) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
    static int n,m,maxRemainEnergy = 0;
    static int[][] map;
    static String path = "";
    static boolean flg;
    static LinkedList<String> list = new LinkedList<>();
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            n = sc.nextInt();
            m = sc.nextInt();
            int p = sc.nextInt();
            map = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                  map[i][j] = sc.nextInt();
                }
            }
            runMap(0,0,p);
            if(!flg) {
                System.out.println("Can not escape!");
            }else {
                System.out.println(path);
            }
        }
    }

    private static void runMap(int x, int y, int energy) {
        if(energy<0 || x<0 || y<0 || x>=n || y>=m || map[x][y] != 1) {
            return;
        }else {
            list.offer("["+ x + ","+ y + "]");
            map[x][y] = 0;
            if(x == 0 && y == m - 1) {
                if(energy >= maxRemainEnergy) {
                    maxRemainEnergy = energy;
                    updatePatch();
                }
                map[x][y] = 1;
                list.removeLast();
                flg = true;
                return;
            }
            runMap(x,y+1,energy-1);
            runMap(x+1,y,energy);
            runMap(x-1,y,energy-3);
            runMap(x,y-1,energy-1);
            map[x][y] = 1;
            list.removeLast();
        }
    }

    private static void updatePatch() {
        StringBuffer sb = new StringBuffer();
        Iterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next()+",");
        }
        if(sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        path = sb.toString();
    }
    public String replaceSpace(String iniString, int length) {
        // write code here
        String[] ret = iniString.split("");
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < ret.length; i++) {
            sb.append(ret[i].equals(" ") ? "%20" : ret[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean flg = true;
            while (n-- > 0) {
                int tmp = sc.nextInt();
                if(tmp == 0 && flg) {
                    for (int i = 0; i < arr.length; i++) {
                        arr[i]+=1;
                    }
                    flg = false;
                }else if((tmp == arr.length && arr[arr.length-1] == 1) || tmp == 0){
                }else {
                    arr[tmp-1]+=1;
                }
            }
            for(int a : arr) {
                System.out.print(a+" ");
            }
        }
    }

}
