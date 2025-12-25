# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        temp=head
        l=0
        while temp:
            l+=1
            temp=temp.next
        toremove=l-n
        if toremove==0:
            return head.next
        temp=head
        c=0
        while temp:
            c+=1
            if c==toremove:
                temp.next=temp.next.next
                break
            temp=temp.next
        return head


        