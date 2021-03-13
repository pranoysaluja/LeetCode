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
    public ListNode swapNodes(ListNode head, int k) {
     ListNode curr = head; 
     ListNode first;
     ListNode second = head;

        //find first
        int count = k;
        while(--count > 0)
        curr = curr.next;
        first = curr;

        //find second
        while(curr.next != null) {
            curr = curr.next;
            second = second.next;
        }

        //swap values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        return head;
    }
}
