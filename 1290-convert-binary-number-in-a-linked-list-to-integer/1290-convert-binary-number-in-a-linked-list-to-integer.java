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

    public int getDecimalValue(ListNode head) {
    ListNode prev=null;
    ListNode temp=head;
    while(temp!=null){
        ListNode next=temp.next;
        temp.next=prev;
        prev=temp;
        temp=next;
    }
  
    int ans=0;
    int i=0;
while(prev!=null){
    ans+= (prev.val*(int)Math.pow(2,i));
    prev=prev.next;
    i++;
}
return ans;

    }
}