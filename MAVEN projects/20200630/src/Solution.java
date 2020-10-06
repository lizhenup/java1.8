import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    /*public List<String> readBinaryWatch(int num) {
        List<String> ret = new ArrayList<>();
        backTrack(0, num, 0, 0, ret);
        return  ret;
    }

    private void backTrack(int i, int num, int hour, int minute, List<String> ret) {
        if(hour > 11 || minute > 59) {
            return;
        }
        if(num > 10 - i) {
            return;
        }
        if(num == 0) {
            String str = String.valueOf(minute);
            if(minute < 10) {
                str = "0" + str;
            }
            ret.add(String.valueOf(hour) + ":" + str);
            return;
        }
        backTrack(i + 1, num, hour, minute, ret);
        if(i < 4) {
            hour += (1 << i);
        }else {
            minute += (i << (i - 4));
        }
        backTrack(i + 1, num - 1, hour, minute, ret);
    }*/
    /*public static void main(String[] args) {
        int[] can = {2,3,6,7};
        System.out.println("\\\\\\\\");
        System.out.println(combinationSum(can, 7));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length == 0) {
            return null;
        }
        List <List<Integer>> ret = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backTrack(candidates, ret, list, target, 0, 0);
        return ret;
    }

    private static void backTrack(int[] candidates, List<List<Integer>> ret, List<Integer> list, int target, int sum, int prev) {
        if(sum >= target) {
            if(sum == target) {
                List<Integer> tmp = new ArrayList<>();
                for (int l : list) {
                    tmp.add(l);
                }
                ret.add(tmp);
            }
            return;
        }
        for (int i = prev; i < candidates.length; i++) {
            if (candidates[i] > target) {
                continue;
            }
            list.add(candidates[i]);
            backTrack(candidates, ret, list, target, sum + candidates[i], i);
            list.remove(list.size() - 1);
        }
    }*/
    /*public int numTilePossibilities(String tiles) {
        Set<String> ret = new HashSet<>();
        boolean[] used = new boolean[tiles.length()];
        StringBuilder sb = new StringBuilder("");
        DFS(ret, used, sb, tiles);
        return ret.size();
    }

    private void DFS(Set<String> ret, boolean[] used, StringBuilder sb, String tiles) {
        if(sb.length() != 0) {
            ret.add(new String(sb));
        }
        for (int i = 0; i < tiles.length(); i++) {
            if(used[i]) {
               continue;
            }
            used[i] = true;
            DFS(ret, used, sb.append(tiles.charAt(i)), tiles);
            used[i] = false;
            sb.deleteCharAt(sb.length() - 1);
        }
    }*/
    public List<List<String>> solveNQueens(int n) {
        List<List<Point>> ret = new ArrayList<>();
        List<Point> list = new ArrayList<>();
        BackTrack(ret, list, 0, n);
        return result(ret, n);
    }

    private List<List<String>> result(List<List<Point>> ret, int n) {
       List<List<String >> ans = new ArrayList<>();
        for (List<Point> r : ret) {
            List<StringBuilder> StringBuilder = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    sb.append('.');
                }
                StringBuilder.add(sb);
            }
            for (Point p : r) {
                StringBuilder.get(p.x).setCharAt(p.y, 'Q');
            }
            List<String> tmp = new ArrayList<>();
            for (StringBuilder sb : StringBuilder) {
                tmp.add(new String(sb));
            }
            ans.add(tmp);
        }
        return ans;
    }

    private void BackTrack(List<List<Point>> ret, List<Point> list, int row, int n) {
        if(row == n) {
            List<Point> tmp = new ArrayList<>();
            for (Point p : list) {
                tmp.add(p);
            }
            ret.add(tmp);
        }
        for (int col = 0; col < n; col++) {
            if(isValid(list, row, col)) {
                list.add(new Point(row, col));
                BackTrack(ret, list, row + 1, n);
                list.remove(list.size() - 1);
            }
        }
    }

    private boolean isValid(List<Point> list, int row, int col) {
        for (Point p : list) {
            if(p.y == col || p.y + p.x == row + col
                    || p.x - p.y == row - col) {
                return false;
            }
        }
        return true;
    }

}
