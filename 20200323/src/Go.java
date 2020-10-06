import java.util.*;

public class Go {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] buy = sc.nextLine().toCharArray();
            char[] want = sc.nextLine().toCharArray();
            ArrayList<Character> list1 = new ArrayList<Character>();
            for(char w : want) {
                list1.add(w);
            }
            ArrayList<Character> list2 = new ArrayList<Character>();
            for(char b : buy) {
                list2.add(b);
            }
            int num = buy.length - want.length;
            for(int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++ ) {
                    if(list2.get(j) == list1.get(i)) {
                        list1.remove(i);
                        list2.remove(j);
                        i--;
                        break;
                    }
                }
            }
            if(list1.isEmpty()) {
                System.out.println("Yes" + " " + num);
            }else {
                System.out.println("No" + " " + list1.size());
            }
        }
    }*/
    public ListNode plusAB(ListNode a, ListNode b) {
        ListNode retHead = new ListNode( -1);
        ListNode ret = retHead;
        int count = 0;
        while (a != null || b != null || count != 0) {
            int valA = a != null ? a.val : 0;
            int valB = b != null ? b.val : 0;
            int sum = valA + valB + count;
            count = sum / 10;
            int node = sum % 10;
            ret.next = new ListNode(node);
            ret = ret.next;
            a = a != null ? a.next : null;
            b = b != null ? b.next : null;
        }
        return retHead.next;
    }
}
