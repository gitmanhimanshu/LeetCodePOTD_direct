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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head;
        int m=0;
        while(temp!=null){
            
            if(m>k){
                break;
            }
            m++;
            temp=temp.next;
        }
        if(m<k){
            return head;
        }
        ListNode next=null;
         ListNode prev=null;
          ListNode  curr=head;
          for(int i=0;i<k&&curr!=null;i++){
              next=curr.next;
              curr.next=prev;
              prev=curr;
              curr=next;
          }
          if(next!=null){
              head.next=reverseKGroup(next,k);
          }
          return prev;
    }
}