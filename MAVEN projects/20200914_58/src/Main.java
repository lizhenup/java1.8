import java.util.Arrays;


/**
 * @author ：lizhen
 * @date ：Created in 2020/9/14 20:28
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.*;

public class Main {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int ret = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(arr[i][j] == 1) {
                        ret++;
                        dfs(arr,i,j);
                    }
                }
            }
            System.out.println(ret);
        }
    }*/

    private static void dfs(int[][] arr, int i, int j) {
        if(i - 1 >= 0 && arr[i - 1][j] == 1) {
            arr[i - 1][j] = 0;
            dfs(arr,i - 1,j);
        }
        if(i + 1 < arr.length && arr[i + 1][j] == 1) {
            arr[i + 1][j] = 0;
            dfs(arr,i + 1,j);
        }
        if(j - 1 >= 0 && arr[i][j - 1] == 1) {
            arr[i][j - 1] = 0;
            dfs(arr,i,j - 1);
        }
        if(j + 1 < arr[0].length && arr[i][j + 1] == 1) {
            arr[i][j + 1] = 0;
            dfs(arr,i,j + 1);
        }
    }

    public int firstMissingPositive (int[] nums) {
        // write code here
        if(nums == null || nums.length == 0) {
            return 1;
        }
        Arrays.sort(nums);
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                if(i != 0 && nums[i] != nums[i - 1]) {
                    if(k == nums[i]) {
                        k++;
                    }else {
                        break;
                    }
                }else if(i == 0) {
                    if(k == nums[i]) {
                        k++;
                    }else {
                        break;
                    }
                }



            }
        }
        return k;
    }
    /*public static ArrayList<ArrayList<Integer>> printNode (TreeNode node) {
        // write code here
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if(node == null) {
            return ret;
        }
        LinkedList<TreeNode> tmp = new LinkedList<>();
        LinkedList<TreeNode> tmpR = new LinkedList<>();
        tmp.add(node);
        while (tmp.size() != 0) {
            TreeNode k = tmp.removeFirst();
            if(k != null) {
                tmp.add(k.left);
                tmp.add(k.right);
            }
            tmpR.add(k);
        }
        int k = 0;
        while (!tmpR.isEmpty()) {
            int num = (int) Math.pow(2,k);
            ArrayList<Integer> list = new ArrayList<>();
            while (num-- > 0 && !tmpR.isEmpty()) {
                TreeNode t = tmpR.removeFirst();
                if(t != null) {
                    list.add(t.val);
                }
            }
            k++;
            ret.add(list);
        }
        ret.remove(ret.size() - 1);
        return ret;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode();
        TreeNode n2 = new TreeNode();
        TreeNode n3 = new TreeNode();
        TreeNode n5 = new TreeNode();
        TreeNode n6 = new TreeNode();
        TreeNode n7 = new TreeNode();
        TreeNode n8 = new TreeNode();
        TreeNode n10 = new TreeNode();
        n1.left = n2;
        n1.right = n3;
        n2.left = null;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n5.left = n8;
        n5.right = n10;
        n6.left = null;
        n6.right = null;
        n7.left = null;
        n7.right = null;
        n1.val = 1;
        n2.val = 2;
        n3.val = 3;
        n5.val = 5;
        n6.val = 6;
        n7.val = 7;
        n8.val = 8;
        n10.val = 10;
        System.out.println(printNode(n1));
    }*/
}

/*class TreeNode {
    int val = 0;
   TreeNode left = null;
    TreeNode right = null;
}*/
class Sour {
    public static void main(String[] args) {
        //int a = 100;
        Integer b = Integer.valueOf(100);
        Integer c = 100;
        System.out.println(b == c);
    }
}
