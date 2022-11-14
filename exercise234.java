import java.util.ArrayList;

public class exercise234 {
    public boolean isPalindrome(ListNode head) {

        ListNode node = head;
        ArrayList<Integer> list = new ArrayList<>();

        while (node != null) {
            list.add(node.val);
            node = node.next;
        }

        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i) != list.get(list.size() - i - 1)) {
                return false;
            }
        }

        return true;

    }
}
