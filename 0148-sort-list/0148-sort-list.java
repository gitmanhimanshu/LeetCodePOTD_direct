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
    public ListNode sortList(ListNode head) {
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int a[]=new int[n];
        temp=head;
        int i=0;
         while(temp!=null){
            a[i++]=temp.val;
            temp=temp.next;
        }
        Arrays.sort(a);
        temp=head;
        i=0;
        while(temp!=null){
            temp.val=a[i++];
            temp=temp.next;
        }
        return head;
    }
}