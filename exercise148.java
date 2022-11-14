import java.util.ArrayList;
import java.util.Collections;

public class exercise148 {
    public ListNode sortList(ListNode head) {

        if (head == null) {
            return null;
        }

        ArrayList<Integer> list = new ArrayList<>();
        ListNode result = head;
        ListNode resultHead = result;

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            result.val = list.get(i);
            result = result.next;
        }

        return resultHead;

    }
}
