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
        ListNode current=head;
        ListNode previous=null;
        ListNode nxt=null;
        while(current!=null){
            nxt=current.next; // Temporary
            current.next=previous; //Reversed
            previous=current;
            current=nxt;//Current moves to next elemenet
        }
        return previous;
    }
}
