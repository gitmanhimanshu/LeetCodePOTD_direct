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
    public ListNode mergeKLists(ListNode[] lists) {
       List<Integer> him=new ArrayList<>();
		for(ListNode head:lists){
			ListNode temp=head;
			while(temp!=null){
				him.add(temp.val);
				temp=temp.next;
			}
		}
		Collections.sort(him);
		ListNode head=null;
		ListNode temp=null;
		for(int i=0;i<him.size();i++){
			if(head==null){
				head=temp=new ListNode(him.get(i));
			}else{
				temp.next=new ListNode(him.get(i));
				temp=temp.next;
			}
		}
		return head; 
    }
}