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
       ListNode temp=head;
       int length=0;

       while(temp!=null){  //for finding length
        length++;
        temp=temp.next;
       }
       
       ListNode curr=head;
       if(length==n){  //special case
        return head.next;
       }
       for(int i=1;i<length-n;i++){
        curr=curr.next;
       }
       curr.next=curr.next.next;
       return head;

    }
}
