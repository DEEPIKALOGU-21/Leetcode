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
    public int getDecimalValue(ListNode head) {

        int answer = 0;

        ListNode current = head;

        while (current != null) {

            answer = answer * 2 + current.val;

            current = current.next;
        }

        return answer;
    }
}

