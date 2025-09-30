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
        if(l1==null&&l2==null){
return null;}
        if(l1==null){
            ListNode head=new ListNode(l2.val);
            return head;
        }
           if(l2==null){
            ListNode head=new ListNode(l1.val);
            return head;
        }
        
     ListNode temp1=l1;int c=0;
          ListNode temp2=l2;
    int n=temp1.val+temp2.val;
        ListNode head=new ListNode(n%10);
        c=n/10;
        temp1=temp1.next;
        ListNode temp=head;
        temp2=temp2.next;
        while(temp1!=null&&temp2!=null){
            n=temp1.val+temp2.val+c;
            ListNode nnode=new ListNode(n%10);
            c=n/10;
            temp.next=nnode;
            temp=nnode;
             temp1=temp1.next;
             temp2=temp2.next;
            
        }
        if(temp1!=null){
            while(temp1!=null){
            n=temp1.val+c;
            ListNode nnode=new ListNode(n%10);
            c=n/10;
            temp.next=nnode;
            temp=nnode;
                temp1=temp1.next;
        }
        }
         if(temp2!=null){
             while(temp2!=null){
            n=temp2.val+c;
            ListNode nnode=new ListNode(n%10);
            c=n/10;
            temp.next=nnode;
            temp=nnode;
                 temp2=temp2.next;
        }
         }
        if(c!=0){
            ListNode nnode=new ListNode(c);
            temp.next=nnode;
            temp=nnode;
        }
        return head;
        
    }
}