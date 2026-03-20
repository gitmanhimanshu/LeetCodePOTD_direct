# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rev(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        
        while curr:
            nxt = curr.next     
            curr.next = prev    
            prev = curr         
            curr = nxt          
        
        return prev
    def middle(self,head):
        f=head
        s=head
        while f and f.next:
            f=f.next.next
            s=s.next
        return s

    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        if not head or not head.next:
            return True
        middle=self.middle(head)
        h2=self.rev(middle)
        t=head
        while  t and h2:
            if t.val!=h2.val:
                return False
            t=t.next
            h2=h2.next
        return True

        