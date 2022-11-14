
class exercise876 {
    public ListNode middleNode(ListNode head) {

        ListNode node = head;

        if (node == null) {
            return node;
        }

        int size = 1;

        while (true) {

            if (node.next == null) {
                break;
            }

            node = node.next;
            size++;
        }

        if (size % 2 == 0) {
            size = (size / 2) + 1;
        } else {
            size = (size + 1) / 2;
        }

        ListNode middleNode = head;
        for (int i = 0; i < size - 1; i++) {
            middleNode = middleNode.next;
        }

        return middleNode;

    }
}
