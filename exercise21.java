import javax.crypto.spec.RC2ParameterSpec;

public class exercise21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode resultHead = new ListNode();
        ListNode tempNode = new ListNode();
        resultHead.next = tempNode;

        if (list1.val > list2.val) {
            resultHead.val = list2.val;
            list2 = list2.next;
        } else {
            resultHead.val = list1.val;
            list1 = list1.next;
        }

        while (list1 != null || list2 != null) {

            if (list1 == null) {
                tempNode.val = list2.val;
                list2 = list2.next;
            } else if (list2 == null) {
                tempNode.val = list1.val;
                list1 = list1.next;
            } else {
                if (list1.val >= list2.val) {
                    tempNode.val = list2.val;
                    list2 = list2.next;
                } else {
                    tempNode.val = list1.val;
                    list1 = list1.next;
                }
            }

            if (list1 == null && list2 == null) {
                break;
            }
            ListNode temp = new ListNode();
            tempNode.next = temp;
            tempNode = tempNode.next;
        }

        return resultHead;

    }
}
