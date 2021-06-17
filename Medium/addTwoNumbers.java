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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode initHead = new ListNode(0);
        ListNode a = l1, b = l2, curr = initHead;
        int remainder = 0;
        
        while(a != null || b != null){
            int x = (a != null) ? a.val : 0;
            int y = (b != null) ? b.val : 0;
            int sum = remainder + x + y;
            remainder = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(a != null) {a = a.next;}
            if(b != null) {b = b.next;}
        }
        
        if (remainder > 0) {
            curr.next = new ListNode(remainder);
        }
        
        return initHead.next;
    }
}