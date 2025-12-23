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
    ListNode mid(ListNode head){
        ListNode f=head;
        ListNode s=head;
        while(f!=null&&f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
    ListNode rev(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode middle=mid(head);
        ListNode head2=rev(middle);
        ListNode temp=head;
        while(temp!=null&&head2!=null){
            if(temp.val!=head2.val){
                break;
            }
            temp=temp.next;
            head2=head2.next;
        }
        return head2==null||temp==null;
    }
}