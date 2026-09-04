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
    public void reorderList(ListNode head) {

        if(head == null) return;

        Deque<ListNode> deque = new ArrayDeque<>();
        ListNode curr = head.next;

        while(curr != null){
            deque.addLast(curr);
            curr = curr.next;
        }

        curr = head;
        while(!deque.isEmpty()){

            curr.next = deque.pollLast();
            curr = curr.next;

            if(!deque.isEmpty()){
                curr.next = deque.pollFirst();
                curr = curr.next;
            }
        }

        curr.next = null;
    }
}