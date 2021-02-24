/*
    https://leetcode.com/problems/reverse-linked-list/
    206. Reverse Linked List (Easy)
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
    public ListNode reverseList(ListNode head) {
        ListNode dummy = null;
        ListNode tmp;
        while (head != null) {
            tmp = head;
            head = head.next;
            tmp.next = dummy;
            dummy = tmp;
        }
        return dummy;
    }
}
