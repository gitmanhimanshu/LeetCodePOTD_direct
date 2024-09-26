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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> him1=new HashSet<>();
       Set<Integer> him2=new HashSet<>();
     
       ListNode temp=head;
       while(temp!=null){
            if(him1.contains(temp.val)){
him2.add(temp.val);
            }else{
                him1.add(temp.val);
            }
            temp=temp.next;
       }
       while(head!=null&&him2.contains(head.val)){
        head=head.next;
       }
         if(head==null){
        return head;
       }
       temp =head;
       while(temp.next!=null){
        if(him2.contains(temp.next.val)){
            temp.next=temp.next.next;
            continue;
        }
        temp=temp.next;
       }
return head;
    }
}