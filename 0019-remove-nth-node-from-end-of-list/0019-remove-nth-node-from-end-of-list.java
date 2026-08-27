/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null) return null;

        ListNode dum = new ListNode(0, head);

        ListNode left = dum;
        ListNode right = dum;

        for(int i=0; i<=n; i++){
            right = right.next;
        }

        while(right != null){
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;

        return dum.next;
    }
}