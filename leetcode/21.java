/*
    https://leetcode.com/problems/merge-two-sorted-lists/
    21. Merge Two Sorted Lists (Easy)
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tmp = dummy;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                tmp.next = l2;
                l2 = l2.next;
                tmp = tmp.next;
                tmp.next = null;
            } else if (l2 == null) {
                tmp.next = l1;
                l1 = l1.next;
                tmp = tmp.next;
                tmp.next = null;
            } else if (l1.val >= l2.val) {
                tmp.next = l2;
                l2 = l2.next;
                tmp = tmp.next;
                tmp.next = null;
            } else {
                tmp.next = l1;
                l1 = l1.next;
                tmp = tmp.next;
                tmp.next = null;
            }
        }
        
        return dummy.next;
    }
}
