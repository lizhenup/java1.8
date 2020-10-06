import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/11 13:37
 * @description：
 * @modified By：
 * @version: $
 */
public class Main {
    public static void main(String[] args) {

    }
    //int dp[][];
    HashSet<>
    public List<List<Integer>> func(int[] arr) {
        List<List<Integer>> ret = new ArrayList<>();
        if(arr.length == 0 || arr == null) {
            return ret;
        }
        //dp = new int[arr.length - 1][arr.length - 1];
        LinkedList<Integer> list = new LinkedList<>();
        dfs(arr,list,ret,0,arr.length - 1);
        return ret;
    }

    private void dfs(int[] arr, LinkedList<Integer> list, List<List<Integer>> ret, int st, int ed) {
        if(st == ed) {
            return;
        }
        for (int j = st; j < arr.length; j++) {
            list.add(j);
            if(!isCon(list)) {
                ret.add(new LinkedList<>(list));
                list.removeLast();
            }
            dfs(arr,list,ret,j,arr.length - 1);
            list.removeLast();
        }
    }

    private boolean isCon(LinkedList<Integer> list) {

    }
}
