package SwordFingerOffer22;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/21 21:25
 */
public class GetKthFromEnd {

    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode getKthFromEnd(ListNode head, int k){
        //
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = head;
        for (int i = 0; i < k && fast != null; i++){
            fast = fast.next;
        }
        while (fast != null){
            fast = fast.next;
            dummy = dummy.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode res = getKthFromEnd(head, 2);
        System.out.println(res);
    }
}
