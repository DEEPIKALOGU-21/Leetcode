class Solution {
    public ListNode oddEvenList(ListNode head) {

        // If list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        // Odd position pointer
        ListNode odd = head;

        // Even position pointer
        ListNode even = head.next;

        // Save the beginning of even list
        ListNode evenHead = even;

        while (even != null && even.next != null) {

            // Connect odd node to next odd node
            odd.next = even.next;
            odd = odd.next;

            // Connect even node to next even node
            even.next = odd.next;
            even = even.next;
        }

        // Attach even list after odd list
        odd.next = evenHead;

        return head;
    }
}