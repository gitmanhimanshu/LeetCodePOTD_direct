class Solution:
    def minDays(self, bloomDay: List[int], m: int, k: int) -> int:
        l=1
        r=max(bloomDay)
        ans=-1
        while(l<=r):
            mid=l+(r-l)//2
            if(self.isPos(bloomDay,m,k,mid)):
                r=mid-1
                ans=mid
            else:
                l=mid+1
        return ans
    def isPos(self,bloomDay:List[int],m:int,k:int,mid:int) ->bool:
        c=0
        t=0
        for i in bloomDay:
            if i<=mid:
                c+=1
            else:
                c=0
            if c==k:
                t+=1
                c=0
        return t>=m














# class Solution {
#     public int minDays(int[] bloomDay, int m, int k) {
#         int l=1;
#         int r=0;
#         int ans=-1;

#         for (int i : bloomDay) {
#             r = Math.max(r, i);
#         }
#         while(l<=r){
#             int mid=l+(r-l)/2;
#             if(isPos(bloomDay,m,k,mid)){
#                 r=mid-1;
#                 ans=mid;
#             }else{
#                 l=mid+1;
#             }
#         }
#         return ans;
#     }
#     boolean isPos(int a[],int m,int k,int day){
#         int c=0;
#         int t=0;
#         for(int i:a){
#             if(i<=day){
#                 c++;
#             }else{
#                 c=0;
#             }
#             if(c==k){
#                 t++;
#                 c=0;
#             }
#         }
#         return t>=m;
#     }
# }