import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/26 19:30
 * @description：
 * @modified By：
 * @version: $
 */
public class Main {
    public int kthSmallest (int[][] matrix, int m) {
        // write code here
        //int[] arr = new int[matrix.length * matrix[0].length];
        //int index = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(m);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                queue.offer(matrix[i][j]);
            }
        }
        Object[] ret = queue.toArray();
        //Arrays.sort(arr);
        return (int) ret[ret.length - 1];
        /*return matrix[m / matrix.length]
                [m / matrix[0].length == 0 ? 0 :m / matrix[0].length- 1];*/
    }
    /*public int uniqueAward (int[] nums) {
        // write code here
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ret = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
                ret.add(nums[i]);
            }else {
                ret.remove(nums[i]);
            }
        }
        int s = 0;
        for (int r : ret) {
            s = r;
            return s;
        }
        return s;
    }*/
}
