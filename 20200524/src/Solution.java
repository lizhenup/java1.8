import java.awt.*;
import java.util.*;
import java.util.List;

/*
 * public class Point {
 *   int x;
 *   int y;
 * }
 */

public class Solution {
    /*int max = 0;
    public int Travel (int N, int V, int[] A, Point[] List) {
        // write code here
        dfs(N,V,A,0,new HashSet<>(),0,List);
        return max;
    }
    public void dfs(int N, int V, int[] A,int begin,HashSet<Integer> set, int num,Point[] List) {
        if(begin == N || V <= 0) {
            return;
        }
        for(int i = begin; i < N; i++) {
            if(V >= A[i] && isGo(List,i+1,set)) {
                V -= A[i];
                num++;
                max = Math.max(max, num);
                set.add(i + 1);
                dfs(N,V,A,i + 1,set,num,List);
                V += A[i];
                set.remove(i + 1);
                num--;
            }
        }
    }
    public boolean isGo(Point[] List,int index, HashSet<Integer> set) {
        for (Point list : List) {
            if(list.y == index && !set.contains(list.x)) {
                return false;
            }
        }
        return true;
    }*/
    //旅行I

    public  int Travel (int N, int V, int[] A, Point[] list) {
        // write code here
        int cantTravel[] = new int[N];
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for (Point p : list) {
            map.putIfAbsent(p.x-1,new ArrayList<>());
            map.get(p.x-1).add(p.y-1);
            cantTravel[p.y-1]++;
        }
        PriorityQueue<Integer> travel = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(A[o1] != A[o2]) {
                    return A[o1] - A[o2];
                }
                return o1 - o2;
            }
        });
        for (int i = 0; i < N; i++) {
            if(cantTravel[i] == 0) {
                travel.offer(i);
            }
        }
        int num = 0;
        while (!travel.isEmpty() && V > 0) {
            int cityNum = travel.poll();
            if(V >= A[cityNum]) {
                V -= A[cityNum];
                num++;
                if(map.containsKey(cityNum)) {
                    for (int toCanTravel : map.get(cityNum)) {
                        cantTravel[toCanTravel]--;
                        if(cantTravel[toCanTravel] == 0) {
                            travel.offer(toCanTravel);
                        }
                    }
                }
            }else {
                break;
            }
        }
        return num;
    }
}