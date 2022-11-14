public class exercise148L2 {
    public ListNode oddEvenList(ListNode head) {

        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        }

        ListNode l1 = head;
        ListNode l2 = head.next;

        while (l1 != null && l2 != null && l1.next != null && l2.next != null) {
            l1.next = l1.next.next;
            l1 = l1.next;
            l2.next = l2.next.next;
            l2 = l2.next;
        }

    }

}
