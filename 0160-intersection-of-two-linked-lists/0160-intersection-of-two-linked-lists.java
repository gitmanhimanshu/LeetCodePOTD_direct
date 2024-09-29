/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    Set<ListNode> h=new HashSet<>();
        ListNode temp=headA;
        while(temp!=null){
            h.add(temp);
            temp=temp.next;
        }
        ListNode temp2=headB;
       
        while(temp2!=null){
            if(h.contains(temp2)){
          
                    return temp2;
                
                                 
                }
           
            temp2=temp2.next;
            }
        return null;          
        }
 
    }
