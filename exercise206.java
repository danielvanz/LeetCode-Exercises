public class exercise206 {
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        if (head.next.next == null) {
            ListNode temp = head.next;
            head.next = null;
            temp.next = head;
            return temp;
        }

        ListNode temp = head.next;
        ListNode temp1 = head.next.next;
        head.next = null;

        return reverse(temp, temp1);
    }

    private ListNode reverse(ListNode prevNode, ListNode curNode) {

        if (curNode.next == null) {
            curNode.next = prevNode;
            return curNode;
        }

        ListNode temp = curNode.next;
        curNode.next = prevNode;
        prevNode = prevNode.next;

        return reverse(prevNode, temp);

    }
}
