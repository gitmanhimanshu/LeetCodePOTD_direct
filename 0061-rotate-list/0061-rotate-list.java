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
    int size(ListNode head){
     if(head==null){
         return 0;
     }
     ListNode temp=head;
     int i=0;
     while(temp!=null){
         temp=temp.next;
         i++;
     }
     return i;
 }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        int l=k%size(head);
        int i=0;
        while(i<l){
            ListNode temp=head;
            ListNode prev=null;
            while(temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            head=addf(head,temp);
            i++;
        }
        return head;
    }
    ListNode addf(ListNode head,ListNode temp){
        if(head==null){
            return head;
        }
        temp.next=head;
        head=temp;
        return head;
    }
}