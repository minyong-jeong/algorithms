/*
    https://leetcode.com/problems/palindrome-linked-list/
    234. Palindrome Linked List (Easy)
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
    public boolean isPalindrome(ListNode head) {
        ListNode tmp = head;
        int listSize = 0;
        while (tmp != null) {
            tmp = tmp.next;
            listSize++;
        }
        
        tmp = head;
        for (int i = 0; i < listSize / 2; i++) {
            tmp = tmp.next;
        }
        
        ListNode dummy = null;
        ListNode tmp2;
        while (tmp != null) {
            tmp2 = tmp;
            tmp = tmp.next;
            tmp2.next = dummy;
            dummy = tmp2;
        }
        
        for (int i = 0; i < listSize / 2; i++) {
            if (head.val != dummy.val) {
                return false;
            }
            head = head.next;
            dummy = dummy.next;
        }
        
        return true;
    }
}
