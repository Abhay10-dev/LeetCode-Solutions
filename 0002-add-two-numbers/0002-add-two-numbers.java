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
import java.math.BigInteger;
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1 = new StringBuilder();
        while (l1 != null) {
            s1.append(l1.val);
            l1 = l1.next;
        }

        StringBuilder s2 = new StringBuilder();
        while (l2 != null) {
            s2.append(l2.val);
            l2 = l2.next;
        }

        BigInteger num1 = new BigInteger(s1.reverse().toString());
        BigInteger num2 = new BigInteger(s2.reverse().toString());

        BigInteger sum = num1.add(num2);

        String sumStr = new StringBuilder(sum.toString()).reverse().toString();

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (char c : sumStr.toCharArray()) {
            curr.next = new ListNode(c - '0');
            curr = curr.next;
        }

        return dummy.next;
    }
}