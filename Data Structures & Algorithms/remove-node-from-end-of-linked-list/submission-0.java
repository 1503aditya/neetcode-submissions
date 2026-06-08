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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp1=head;
        int len=1,count=0,t=1;
        while(temp1.next!=null){
            len++;
            temp1=temp1.next;
        }
        count=len-n;
        if(len==n)
        return head.next;
        ListNode res=head;
        while(count>t){
            res=res.next;
            t++;
        }
        res.next=res.next.next;
        return head;
    
        
    }
}
