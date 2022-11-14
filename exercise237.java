public class exercise237 {
    public void deleteNode(ListNode node) {

        while (node != null) {

            if (node.next.next == null) {
                node.val = node.next.val;
                node.next = null;
                break;
            }

            node.val = node.next.val;
            node = node.next;
        }

    }
}
