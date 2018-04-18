package LinkedList.Palindrome_Linked_List_234;

/**
 * @author dbh on 2018/4/18.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }
        ListNode partitionHead = partition(head);
        ListNode reverseHead = reverse(partitionHead);
        while (reverseHead != null && head != null) {
            if (reverseHead.val != head.val) {
                return false;
            }
            reverseHead = reverseHead.next;
            head = head.next;
        }
        return true;
    }

    public ListNode partition(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode first = head;
        ListNode second = head;
        while (first != null && first.next != null) {
            pre = second;
            first = first.next.next;
            second = second.next;
        }
        pre.next = null;
        return second;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

}
