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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode n1 = new ListNode(-1);
        ListNode n2 = n1;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {

                n1.next = new ListNode(list1.val);
                list1 = list1.next;

            } else {

                n1.next = new ListNode(list2.val);
                list2 = list2.next;
            }

            n1 = n1.next;
        }

        if (list1 != null) {
            n1.next = list1;
        }

        if (list2 != null) {
            n1.next = list2;
        }

        return n2.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 || lists == null ) return null;
        ListNode x = null;

        for(int i=0; i<lists.length;i++){
            x = mergeTwoLists(x,lists[i]);
        }
        return x;
        
        
    }
}