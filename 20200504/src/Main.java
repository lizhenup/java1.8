import java.util.*;

public class Main {
    public static void main1(String[] args) {
        int[] arr = {1,2,4,1,7,8,3};
        //System.out.println(findNum(arr));
        int[] array = {3,34,5,2,4,12,7,2,1,6,5,7,96};
        //System.out.println(findNine(array,array.length - 1,9));
        //System.out.println(findNine(array,array.length - 1,11));
        //System.out.println(findNine(array,array.length - 1,13));
        /*findWant(array,0,9);
        for (ArrayList<Integer> list: lists) {
            for (int l: list) {
                System.out.print(l + "");
            }
            System.out.println();
        }*/
    }

    /*static ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    static ArrayList<Integer> list = new ArrayList<>();
    private static void findWant(int[] array, int start, int sum) {
        if(sum == 0) {
            lists.add(new ArrayList<>(list));
        }else if(sum > 0){
            for (int i = start; i < array.length; i++) {
                list.add(array[i]);
                findWant(array,start+1,sum - array[i]);
                findWant(array,start+1,sum);
                //list.remove(list.size() - 1);
            }
        }else {
            list.remove(list.size() - 1);
        }
    }*/

    private static boolean findNine(int[] array, int len, int s) {
        if(s == 0) {
            return true;
        }else if(len == 0) {
            return array[0] == s;
        }else if(s < 0) {
            return false;
        }
        return (findNine(array,len - 1,s - array[len]) ||
        findNine(array,len - 1,s));
    }

    private static int findNum(int[] arr) {
        if(arr.length == 1) {
            return arr[0];
        }else if(arr.length == 2) {
            return arr[0] > arr[1] ? arr[0] : arr[1];
        }else {
            //用ret来接收每一步的最优解
            int[] ret = new int[arr.length];
            ret[0] = arr[0];
            ret[1] = arr[0] > arr[1] ? arr[0] : arr[1];
            int A,B;
            for(int i = 2; i < arr.length; i++) {
                A = arr[i] + ret[i - 2];
                B = ret[i - 1];
                ret[i] = A > B ? A : B;
            }
            return ret[ret.length - 1];
        }
    }
    public static void main2(String[] args) {
        int[] a = {1,2,3,4};
        int[] p = {2,2,4};
        System.out.println(Arrays.toString(solve(4,3,a,p)));
    }

    public static int[] solve (int n, int q, int[] a, int[] p) {
        // write code here
        Arrays.sort(a);
        int[] ret = new int[q];
        int count = 0;
        for (int P : p) {
            int min, st = 0, sum = 0;
            for(int k = 0; k < P; k++) {
                sum += a[k];
            }
            min = a[P - 1] * P - sum;
            for (int i = 1; i + P <= a.length; i++) {
                sum += a[i + P - 1];
                sum -= a[i - 1];
                if(min > a[i + P - 1] * P - sum) {
                    min = a[i + P - 1] * P - sum;
                    st = i;
                }
            }
            for (int i = st; i < st + P - 1; i++) {
                a[i] = a[st + P - 1];
            }
            ret[count++] = min;
        }
        return ret;
    }
    public int countDislocation (int n, int[] cutIn) {
        // write code here
        HashSet<Integer> set = new HashSet<>();
        LinkedList<Integer> list = new LinkedList<>();
        int maxCut = Integer.MIN_VALUE;
        for(int i = cutIn.length - 1; i >= 0; i--) {
            if(!set.contains(cutIn[i])) {
                maxCut = maxCut > cutIn[i] ? maxCut : cutIn[i];
                set.add(cutIn[i]);
                list.add(cutIn[i]);
            }
        }
        int i = 0,count = 0;
        for (int l : list) {
            if(l - 1 == i) {
                count++;
            }
            i++;
        }
        if(maxCut < n) {
           return 2 * n - count - maxCut;
        }else {
            return n - count;
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{2,3,4},{5,6,7},{7,8,9}};
        System.out.println(selectPresent(a));
    }

    public static int selectPresent (int[][] presentVolumn) {
        // write code here
        int[][] ret = presentVolumn;
        //初始化第一行第一列的最优解
        if(presentVolumn == null) {
            return 0;
        }
        if(ret[0].length > 1) {
            for (int i = 1; i < ret[0].length; i++) {
                ret[0][i] += ret[0][i - 1];
            }
        }
        if(ret.length > 1) {
            for (int i = 1; i < ret.length; i++) {
                ret[i][0] += ret[i - 1][0];
            }
        }
        if(ret.length == 1) {
            return ret[0][ret[0].length - 1];
        }
        if(ret[0].length == 1) {
            return ret[ret.length - 1][0];
        }
        for (int i = 1; i < ret.length; i++) {
            for (int j = 1; j < ret[0].length; j++) {
                ret[i][j] += Integer.min(ret[i - 1][j - 1], Integer.min(ret[i - 1][j], ret[i][j - 1]));
            }
        }
        return ret[ret.length - 1][ret[0].length - 1];
    }
    //两个长度相同的字符串
    // 找出两个字符串中不同的字符，可进行一次替换，使得两个字符串中不同的字符数最少。
    /*public int GetMinDistance (String S1, String S2) {
        // write code here
        HashMap<Character,Integer> map1 = new HashMap<Character, Integer>();
        char[] ch1 = S1.toCharArray();
        for (char c1 : ch1) {
            map1.put(c1,map1.containsKey(c1) ? map1.get(c1) + 1 : 1);
        }
        Set<Character> set = map1.keySet();
        int tmp = 0;
        int max = Integer.MIN_VALUE;
        for (char c : set) {
            tmp += map1.get(c);
        }
        char[] ch2 = S2.toCharArray();
        HashMap<Character,Integer> map2 = new HashMap<Character, Integer>();
        for (char c2 : ch2) {
            if(map1.containsKey(c2) && map1.get(c2) > 0) {
                map2.put(c2,map2.containsKey(c2) ? map2.get(c2) + 1 : 1);
                map1.put(c2,map1.get(c2) - 1);
            }
        }
        return tmp - Integer.min(findMax(map1),findMax(map2));
    }

    private int findMax(HashMap<Character,Integer> map) {
        Set<Character> set = map.keySet();
        int max = Integer.MIN_VALUE;
        for (char c : set) {
            max = max > map.get(c) ? max : map.get(c);
        }
        return max;
    }*/
    public int GetMinDistance (String S1, String S2) {
        // write code here
        HashMap<String ,Integer> map1 = new HashMap<String, Integer>();
        HashMap<Character ,Integer> map2 = new HashMap<Character, Integer>();
        char[] ch1 = S1.toCharArray();
        char[] ch2 = S2.toCharArray();
        int count = 0;
        for (int i = 0; i < ch1.length; i++) {
            if(ch1[i] != ch2[i]) {
                StringBuilder sb = new StringBuilder();
                sb.append(ch1[i]).append(ch2[i]);
                String str = new String(sb);
                map1.put(str,map1.containsKey(str) ? map1.get(str) + 1 : 1);
                count++;
            }else {
                map2.put(ch1[i],map2.containsKey(ch1[i]) ? map2.get(ch1[i]) + 1 : 1);
            }
        }
        return count - findMax(map1,map2);
    }

    private int findMax(HashMap<String,Integer> map1, HashMap<Character,Integer> map2) {
        Set<String> set = map1.keySet();
        int max = Integer.MIN_VALUE;
        for (String s : set) {
            if(map2.containsKey(s.charAt(0))) {
                if(max < map1.get(s) - map2.get(s.charAt(0))) {
                    max = map1.get(s) - map2.get(s.charAt(0));
                }
            }else {
                max = max > map1.get(s) ? max : map1.get(s);
            }
        }
        return max;
    }
    public int maxPresent (int[] presentVec) {
        // write code here
        LinkedList<Integer> coke = new LinkedList<Integer>();
        LinkedList<Integer> nen = new LinkedList<Integer>();
        int sumC = 0, sumN = 0;
        int minC =Integer.MAX_VALUE, minN = Integer.MAX_VALUE;
        for (int p : presentVec) {
            if(sumC > sumN) {
                sumN += p;
                nen.add(p);
                minN = minN > p ? p : minN;
                if(sumC != sumN) {
                    if((sumC - sumN) / 2 > minC) {
                        findPeace(coke,nen,sumC,sumN,minC);
                    }
                }
            }else if (sumC < sumN){
                sumC += p;
                coke.add(p);
                minC = minC > p ? p : minC;

            }else {
                sumC += p;
                coke.add(p);
                minC = minC > p ? p : minC;
            }
        }
    }

    private void findPeace(LinkedList<Integer> list1, LinkedList<Integer> list2, int sumC, int sumN,int min) {

    }
}
