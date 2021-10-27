
public class Question2 {
    public static void main(String[] args) {
        ListNode input1 = new ListNode(3);
        input1.next = new ListNode(4);
        input1.next = new ListNode(5);

        ListNode input2 = new ListNode(5);
        input2.next = new ListNode(7);
        input2.next = new ListNode(6);

        System.out.print(addTwoNumbers(input1, input2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        int sum = 0;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            sum = 0;
            // l1 = l1.next;
            // l2 = l2.next;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;

            result.next = new ListNode(sum % 10);

            result = result.next;
            // System.out.println(result.val);

        }

        return head.next;

    }
}
