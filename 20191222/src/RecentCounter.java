import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    Queue<Integer> q = new LinkedList<>();
    public RecentCounter() {

    }

    public int ping(int t) {
        q.add(t);
        while (q.peek() < t-3000) {
            q.poll();
        }
        return q.size();
    }
}


class Joseph {
    public int getResult(int n) {
        return ysf(n, 2);
    }
    public int ysf(int n, int m) {
        int tmp = n%m==0 ? n/m : n/m+1;
        if(tmp <= m+1) {
            return (tmp-1)*m+1; //终止条件
        }
        int path = ysf(tmp, m+1); //m+1次时最后一人编号的位置
        return (path-2)*m + 1;
    }
}

