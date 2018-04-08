package LinkedList.Merge_Two_Sorted_Lists_21;

/**
 * @author dbh on 2018/4/8.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode mergeHead = null;
        ListNode current = null;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                if (mergeHead == null) {
                    mergeHead = l1;
                    current = mergeHead;
                } else {
                    current.next = l1;
                    current = current.next;
                }
                l1 = l1.next;
            } else {
                if (mergeHead == null) {
                    mergeHead = l2;
                    current = mergeHead;
                } else {
                    current.next = l2;
                    current = current.next;
                }
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }
        return mergeHead;
    }
}
