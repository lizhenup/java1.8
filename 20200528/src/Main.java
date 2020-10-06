import java.util.*;

class person {
    public void func() {
        System.out.println("你行吗");
    }
    private void ff() {
        System.out.println("我行啊");
    }
}
class student extends person {
    public void eat() {
        System.out.println("吃了吗");
    }
    private void ate() {
        System.out.println("吃了");
    }
}
public class Main {
    public static void main(String[] args) {

    }
    /*static int[] best;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int numNodes = sc.nextInt();
            int rootNodes = sc.nextInt();
            int[] val = new int[numNodes];
            for (int i = 0; i < val.length; i++) {
                val[i] = sc.nextInt();
            }

            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
            for (int i = 0; i < numNodes - 1; i++) {
                int k = sc.nextInt(), v = sc.nextInt();
                map.putIfAbsent(k,new ArrayList<>());
                map.get(k).add(v);
            }
            best = new int[numNodes];
            best[rootNodes - 1] = val[rootNodes - 1];
            findMax(rootNodes,map,val);
            System.out.println(max);
        }
    }

    private static void findMax(int num, HashMap<Integer, ArrayList<Integer>> map, int[] val) {
        if(!map.containsKey(num)) {
            max = Math.max(best[num - 1], max);
            return;
        }
        for (int l : map.get(num)) {
            best[l - 1] = best[num - 1] * val[l - 1];
            findMax(l,map,val);
        }
    }*/
}
