//// EASY ////

//// Merge sorted arrays /////
public class Question21 {
    public static void main(String[] args) {
        ListNode input1 = null;
        // new ListNode();
        // input1.next = new ListNode(4);
        // input1.next = new ListNode(5);

        ListNode input2 = new ListNode(5);
        input2.next = new ListNode(7);
        input2.next = new ListNode(6);

        System.out.print(mergeTwoLists(input1, input2));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode result = head;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                result.next = new ListNode(l2.val);
                l2 = l2.next;
            }

            else if (l2 == null) {
                result.next = new ListNode(l1.val);
                l1 = l1.next;
            } else if (l1.val == l2.val) {
                result.next = new ListNode(l1.val);
                l1 = l1.next;
                result = result.next;
                result.next = new ListNode(l2.val);
                l2 = l2.next;
            } else if (l1.val > l2.val) {
                result.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                result.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            result = result.next;
        }
        return head.next;
    }
}
