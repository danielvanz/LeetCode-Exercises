public class exercise2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        String s1 = "";
        String s2 = "";
        String result = "";

        while (l1 != null) {
            s1 = l1.val + s1;
            l1 = l1.next;
        }

        while (l2 != null) {
            s2 = l2.val + s2;
            l2 = l2.next;
        }

        int diff = Math.abs(s1.length() - s2.length());

        if (s1.length() > s2.length()) {
            for (int i = 0; i < diff; i++) {
                s2 = "0" + s2;
            }
        } else if (s1.length() < s2.length()) {
            for (int i = 0; i < diff; i++) {
                s1 = "0" + s1;
            }
        }

        boolean hasCarry = false;

        for (int i = s1.length() - 1; i >= 0; i--) {
            int i1 = Integer.parseInt(s1.substring(i, i + 1));
            int i2 = Integer.parseInt(s2.substring(i, i + 1));

            int r = 0;

            if (hasCarry) {
                r = i1 + i2 + 1;
            } else {
                r = i1 + i2;
            }

            if (r >= 10) {
                r -= 10;
                hasCarry = true;
            } else {
                hasCarry = false;
            }

            result = r + result;
        }

        if (hasCarry) {
            String temp = result.substring(0, result.length());
            int parsing = Integer.parseInt(result.substring(0, 1));

            if (parsing + 1 >= 10) {
                temp = "10" + temp;
            } else {
                temp = (parsing + 1) + temp;
            }

            result = temp;
        }

        ListNode r = new ListNode();
        r.val = Integer.parseInt(result.substring(result.length() - 1, result.length()));
        ListNode tail = new ListNode();
        r.next = tail;

        for (int i = result.length() - 1; i >= 0; i--) {
            tail.val = Integer.parseInt(result.substring(i, i + 1));
            ListNode temp = new ListNode();
            if (i != 0) {
                tail.next = temp;
                tail = tail.next;
            }
        }

        return r.next;

    }
}
