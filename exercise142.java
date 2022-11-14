import java.util.HashSet;

public class exercise142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return findNode(head);
            }

        }
        return null;
    }

    private ListNode findNode(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode node = head;

        while (!set.contains(node)) {
            set.add(node);
            node = node.next;
        }

        return node;
    }
}
