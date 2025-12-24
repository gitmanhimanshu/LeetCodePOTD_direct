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
    public ListNode oddEvenList(ListNode head) {
        ArrayList<Integer> even=new ArrayList<>();
          ArrayList<Integer> odd=new ArrayList<>();
          ListNode temp=head;
          int i=0;
          while(temp!=null){
              if(i%2==0){
                  even.add(temp.val);
              }else{
                  odd.add(temp.val);
              }
              i++;
              temp=temp.next;
          }
          temp=head;
         //  i=0;
          while(even.size()>0){
              temp.val=(even.remove(0));
              temp=temp.next;
             // i++;
          }
          i=0;
             while(odd.size()>0){
              temp.val=(odd.remove(0));
              temp=temp.next;
              //i++;
          }
          return head;
    }
}