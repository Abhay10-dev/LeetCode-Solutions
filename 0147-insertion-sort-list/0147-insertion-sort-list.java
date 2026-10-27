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
    public ListNode insertionSortList(ListNode head) {

        if(head == null || head.next == null) return head;

        List<Integer> list = new ArrayList<>();

        ListNode left = head;

        while(left != null){
            list.add(left.val);
            left = left.next;
        }

        list.sort(null);

        left = head;

        int i = 0;
        while(left != null){
            left.val = list.get(i);
            left = left.next;
            i++;
        }

        return head;
    }
}