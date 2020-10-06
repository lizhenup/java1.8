import java.util.*;
class Node {
    int x;
    int y;
    int w;
    public Node(int x, int y, int w) {
        this.x = x;
        this.y = y;
        this.w = w;
    }
}
public class Solution {
    public long MinimumDistance (int n, int[] x, int[] y, int[] w) {
        // write code here
        Node[] nodes = new Node[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(x[i],y[i],w[i]);
            sum += w[i];
        }
        Arrays.sort(nodes, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.x - o2.x;
            }
        });
        sum >>= 1;
        int cnt = 0,a = 0, b = 0;
        for (int i = 0; i < n; i++) {
            cnt += nodes[i].w;
            if(cnt > sum) {
                a = i;
                break;
            }
        }
        long ret = 0;
        for (int i = 0; i < n; i++) {
            ret += Math.abs(nodes[a].x - nodes[i].x) * nodes[i].w;
        }
        Arrays.sort(nodes, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.y - o2.y;
            }
        });
        cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += nodes[i].w;
            if(cnt > sum) {
                b = i;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            ret += Math.abs(nodes[b].y - nodes[i].y) * nodes[i].w;
        }
        return ret;
    }
}
