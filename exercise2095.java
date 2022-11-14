public class exercise2095 {
    public ListNode deleteMiddle(ListNode head) {

        if (head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;

        while (fast.next != null && fast.next.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast.next != null) {
            prev = slow;
            slow = slow.next;
        }

        prev.next = slow.next;

        return head;

    }
}
