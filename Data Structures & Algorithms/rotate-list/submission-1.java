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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null ||k==0){
            return head;
        }
        int length=1;
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }
        k=k%length;
        tail.next=head;  //circular connecting last node to first 
        int steps=length-k;
        ListNode newTail=head;
        for(int i=1;i<steps;i++){
            newTail=newTail.next; //for finding the new tail which is 3 for example
        }
        ListNode newHead=newTail.next; //the head will be the next place of tail so 4 
        newTail.next=null; //last of the list end with null
        return newHead;
    }
}