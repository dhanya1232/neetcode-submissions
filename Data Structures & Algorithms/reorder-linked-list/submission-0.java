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
    public void reorderList(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp = head; 
        while(temp!=null){
            
            list.add(temp.val);
            temp=temp.next;
        }

        int i=0;
        int j=list.size()-1;
        ArrayList<Integer> ans=new ArrayList<>();
        while(i<j){
           ans.add(list.get(i));
           ans.add(list.get(j));
           i++;
           j--;
        }

        if (i == j) {
            ans.add(list.get(i));
        }

        // Copy values back into the linked list
        
        temp = head;
        int index = 0;

        while (temp != null) {
            temp.val = ans.get(index++);
            temp = temp.next;
        }
    }
}
