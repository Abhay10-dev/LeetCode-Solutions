/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;

        Set<ListNode> set = new HashSet<>();

        ListNode c = head;

        while(c!=null){
            if(set.add(c)){
                c = c.next;
            } else {
                return true;
            }
        }
        return false;
    }
}