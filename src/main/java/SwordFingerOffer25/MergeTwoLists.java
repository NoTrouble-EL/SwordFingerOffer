package SwordFingerOffer25;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/21 21:49
 */
public class MergeTwoLists {

    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        //corner case
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }

        if (l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode l2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        l1.next = node1;
        node1.next = node2;
        l2.next = node3;
        node3.next = node4;
        ListNode res = mergeTwoLists(l1, l2);
        System.out.println(res);
    }
}
