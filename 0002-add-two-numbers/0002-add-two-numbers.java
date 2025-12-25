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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        int c=0;
        ListNode head=null;
        ListNode temp=null;
        while(l1!=null&&l2!=null){
            int t=l1.val+l2.val+c;
            c=t/10;           
          ListNode  tt=new ListNode(t%10);
            if(head==null){
                head=tt;
                temp=tt;
            }else{
            temp.next=tt; 
            temp=temp.next;
            }
            
            l1=l1.next;
            l2=l2.next;

        }
        while(l1!=null){
            int t=l1.val+c;
            c=t/10;           
           ListNode  tt=new ListNode(t%10);
            if(head==null){
                head=tt;
                temp=tt;
            }else{
            temp.next=tt; 
            temp=temp.next;
            }

              
            l1=l1.next;
        
        }
        while(l2!=null){
            int t=l2.val+c;
            c=t/10;           
           ListNode  tt=new ListNode(t%10);
            if(head==null){
                head=tt;
                temp=tt;
            }else{
            temp.next=tt; 
            temp=temp.next;
            }  
            l2=l2.next;
        
        }
        if(c!=0){
            ListNode  tt=new ListNode(c);
            if(head==null){
                head=tt;
                temp=tt;
            }else{
            temp.next=tt; 
            temp=temp.next;
            } 
        }
        return head;
    }
}