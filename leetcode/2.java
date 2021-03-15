/*
    https://leetcode.com/problems/add-two-numbers/
    2. Add Two Numbers (Medium)
*/
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
        ListNode ret = new ListNode();
        ListNode start = ret;
        
        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            start.val = sum % 10;
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            
            if (l1 != null || l2 != null) {
                start.next = new ListNode();
                start = start.next;
            }
        }
        
        while (l1 != null) {
            int sum = l1.val + carry;
            start.val = sum % 10;
            carry = sum / 10;
            l1 = l1.next;
            
            if (l1 != null) {
                start.next = new ListNode();
                start = start.next;
            }
        }
        
        while (l2 != null) {
            int sum = l2.val + carry;
            start.val = sum % 10;
            carry = sum / 10;
            l2 = l2.next;
            
            if (l2 != null) {
                start.next = new ListNode();
                start = start.next;
            }
        }
        
        if (carry == 1) {
            start.next = new ListNode();
            start = start.next;
            start.val = 1;
        }
        
        return ret;
    }
}