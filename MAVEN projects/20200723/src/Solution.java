
/**
 * @author ：lizhen
 * @date ：Created in 2020/7/23 11:07
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(7);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        ListNode newHead = ReverseList(head);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead
                    .next;
        }


    }
    public static ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode new_head = null;
        while (head != null) {
            //先从原链表中去掉第一个节点
            ListNode p = head;

            head = head.next;
            //再将p标识的节点头查到新链表
            p.next = new_head;
            new_head = p;
        }
        head = new_head;
        return head;
    }

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null) {
            return false;
        }
        boolean ret = false;
        if(root1.val == root2.val) {
            ret = compare(root1,root2);
        }
        if(!ret) {
            HasSubtree(root1.left, root2);
            HasSubtree(root1.right, root2);
        }
        return ret;
    }

    public boolean compare(TreeNode root1,TreeNode son) {
        if(son == null) {
            return true;
        }
        if(root1.val != son.val) {
            return false;
        }
        if(root1 == null) {
            return false;
        }
        return compare(root1.left,son.left) && compare(root1.right,son.right);
    }
}



