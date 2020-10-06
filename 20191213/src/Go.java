import java.util.*;

public class Go {
    public static void main(String[] args) {
        int[][] as = {{1,2,3},{4,5,6},{7,8,9}};
        //List<List<Integer>> bs = shiftGrid(as,6);
        //System.out.println(bs.toString());
        int[] ad = new int[3];
        ad[1] = 1;
        ad[2] = 2;
        System.out.println(Arrays.toString(ad));

    }
}

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] nums = new int[grid.length*grid[0].length];
        for(int i = 0;i < grid.length;i++) {
            for(int j = 0;j < grid[0].length;j++) {
                k %= nums.length;
                nums[k++] = grid[i][j];
            }
        }
        k = 0;
        List<List<Integer>> lists = new ArrayList<>(grid.length);
        List<Integer> tmplists = new ArrayList<>(grid[0].length);
        for(int i = 0;i < grid.length;i++) {
            for(int j = 0;j < grid[0].length;j++) {
                tmplists.add(nums[k++]);
            }
            lists.add(tmplists);
        }
        return lists;
    }
}
