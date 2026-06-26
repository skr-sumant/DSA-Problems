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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;

        ListNode l1 = head;
        ListNode l2 = head;
        ListNode prev = null;

        while (l2 != null && l2.next != null) {
            prev = l1;
            l1 = l1.next;
            l2 = l2.next.next;
        }
         prev.next = l1.next;
        return head;

        
    }
}