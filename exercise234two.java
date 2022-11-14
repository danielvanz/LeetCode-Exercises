public class exercise234two {
    public boolean isPalindrome(ListNode head) {

        ListNode node = head;
        ListNode middleNode = head;
        ListNode startNode = head;
        int size = 0;

        while (node != null) {
            node = node.next;
            size++;
        }

        int middle;
        if (size % 2 == 0) {
            middle = size / 2;
        } else {
            middle = (size / 2) + 1;
        }

        for (int i = 0; i < middle; i++) {
            middleNode = middleNode.next;
        }

        for (int i = 0; i < middle; i++) {
            if (middleNode.val != startNode.val) {
                return false;
            }
            middleNode = middleNode.next;
            startNode = startNode.next;
        }

        return true;
    }
}
