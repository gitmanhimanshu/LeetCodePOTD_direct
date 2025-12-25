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
        int l=0;
    
        ListNode temp=head;
        while(temp!=null){
            l++;
            temp=temp.next;
        }
        int toremove=l-n;
        temp=head;
        int c=0;
     if(toremove==0){
        return head.next;
     }
        while(temp!=null){
            c++;
            if(c==toremove){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
        return head;

    }
}