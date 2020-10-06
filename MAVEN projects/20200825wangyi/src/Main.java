/**
 * @author ：lizhen
 * @date ：Created in 2020/8/25 13:26
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.Scanner;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
}

public class Main {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode();
        root1.val = 1;
        root1.left = new TreeNode();
        root1.right = new TreeNode();
        root1.left.val = 2;
        root1.left.left = null;
        root1.left.right = null;
        root1.right.val = 3;
        root1.left.right = null;
        root1.right.right = null;
        System.out.println(isSameSubTree(root1,root1));
        TreeNode root2 = new TreeNode();
        root2.val = 1;
        root2.left = new TreeNode();
        root2.right = new TreeNode();
        root2.left.val = 2;
        root2.left.left = null;
        root2.left.right = null;
        root2.right.val = 2;
        root2.left.right = null;
        root2.right.right = null;
        System.out.println(isSameSubTree(root1,root2));
    }

    public static boolean isSameSubTree(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) {
            return true;
        }else if(root1 == null || root2 == null) {
            return false;
        } else if(root1.val != root2.val) {
            return false;
        }else {
            return isSameSubTree(root1.left,root2.left) && isSameSubTree(root1.right,root2.right);
        }
    }
    boolean ret = false;
    public boolean func(int[][] arr, int num) {
        funSon(arr[0][0],0,0,arr,num);
        return ret;
    }

    private void funSon(int start, int x, int y, int[][] arr, int num) {
        if(start == num) {
            ret = true;
            return;
        }
        if(x + 1 < arr.length && arr[x + 1][y] <= num) {
            funSon(arr[x + 1][y], x + 1, y, arr,num);
        }
        if(y + 1 < arr[0].length && arr[x][y + 1] <= num) {
            funSon(arr[x][y + 1], x, y + 1, arr,num);
        }
    }
}
