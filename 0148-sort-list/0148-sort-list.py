# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def sortList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        temp=head
        l=[]
        while temp:
            l.append(temp.val)
            temp=temp.next
        l.sort()
        temp=head
        i=0
        while temp:
            temp.val=l[i]
            temp=temp.next
            i+=1
        return head


        
        