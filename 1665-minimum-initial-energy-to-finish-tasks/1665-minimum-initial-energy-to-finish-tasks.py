class Solution:
    def minimumEffort(self, tasks: List[List[int]]) -> int:
        l=0
        e=10**9
        tasks.sort(key=lambda x:x[1]-x[0],reverse=True)
        ans=-1
        while(l<=e):
            mid=l+(e-l)//2
            if(self.isPos(tasks,mid)):
                ans=mid
                e=mid-1

            else:
                l=mid+1
        return ans
    def isPos(self,tasks,mid):
        for i in tasks:
            actual=i[0]
            need=i[1]
            if(need>mid):
                return False
            mid-=actual
        return True

        