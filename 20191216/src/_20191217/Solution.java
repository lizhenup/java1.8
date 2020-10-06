package _20191217;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        int[] i = new int[] {};
        for (int[] index:trust) {
            System.out.print(Arrays.toString(index));
            //findJudge(3,trust);
        }
    }
    public static int findJudge(int N, int[][] trust) {
        int[] cnt = new int[N+1];//统计出入度
        for (int[] index : trust) {
            int ret = cnt[index[0]]--;//出度--
            System.out.println(ret);
            cnt[index[1]]++;//入度++

        }
        for ( int i = 1; i <= N; i++ ) {
            if ( cnt[i] == N-1 ) {
                return i;
            }
        }
        return -1;
    }
}

