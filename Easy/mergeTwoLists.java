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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode c = new ListNode();
        ListNode front = c;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                c.next = new ListNode(l1.val);
                l1 = l1.next;
                c = c.next;
            } else if(l2.val <= l1.val) {
                c.next = new ListNode(l2.val);
                l2 = l2.next;
                c = c.next;
            } else if(l1 == null){
                c.next = l2;
                return front.next;
            } else if(l2 == null){
                c.next = l1;
                return front.next;
            }
        }
        
        if (l1 == null) {
            c.next = l2;
            return front.next;
        }
        
        if (l2 == null) {
            c.next = l1;
            return front.next;
        }
        return front.next;
    }
}