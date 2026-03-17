# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow=head
        fast=head
        while fast and fast.next:
            slow=slow.next
            fast=fast.next.next
            if slow is fast:
                return slow
        return None
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        temp=self.hasCycle(head)
        if not temp:
            return None
        c=head
        while(c is not temp):
            c=c.next
            temp=temp.next
        return c
        