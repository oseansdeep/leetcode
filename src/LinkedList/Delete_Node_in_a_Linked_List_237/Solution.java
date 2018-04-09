package LinkedList.Delete_Node_in_a_Linked_List_237;

/**
 * @author dbh on 2018/4/9.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
