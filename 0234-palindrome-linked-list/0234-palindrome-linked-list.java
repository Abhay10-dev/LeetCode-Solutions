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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;

        ListNode left = head;
        ListNode right = head;

        // To find the mid of the list
        while(right!=null && right.next!=null){
            left = left.next;
            right = right.next.next;
        } 

        ListNode secHalfHead = reverse(left);

        ListNode p1 = head;
        ListNode p2 = secHalfHead;
        boolean result = true;

        while(p2!=null){
            if(p1.val != p2.val){
                result = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return result;
    }

    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }
}