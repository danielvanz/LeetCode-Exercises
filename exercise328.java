public class exercise328 {
    public ListNode oddEvenList(ListNode head) {

        if (head == null) {
            return null;
        } else if (head.next == null || head.next.next == null) {
            return head;
        }

        ListNode oddNode = head;
        ListNode evenNode = head.next;
        ListNode evenNodeHead = evenNode;

        while (oddNode != null && oddNode.next != null && evenNode.next != null) {
            oddNode.next = oddNode.next.next;
            oddNode = oddNode.next;
            evenNode.next = evenNode.next.next;
            evenNode = evenNode.next;
        }

        oddNode.next = evenNodeHead;

        return head;
    }
}
