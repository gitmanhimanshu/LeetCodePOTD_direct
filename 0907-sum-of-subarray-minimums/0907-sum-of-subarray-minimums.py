class Solution:
    def cal_ls(self,arr):
        a=[]
        for i in range(len(arr)):
            while(len(a)>0 and arr[a[-1]]>arr[i]):
                a.pop()
            self.ls[i]=a[-1] if len(a)>0 else -1
            a.append(i)
    def cal_rs(self,arr):
        a=[]
        for i in range(len(arr)-1,-1,-1):
            while(len(a)>0 and arr[a[-1]]>=arr[i]):
                a.pop()
            self.rs[i]=a[-1] if len(a)>0 else len(arr)
            a.append(i)
    def sumSubarrayMins(self, arr: List[int]) -> int:
        mod=1000000007
        sum=0
        self.ls=[0]*len(arr)
        self.rs=[0]*len(arr)
        self.cal_ls(arr)
        self.cal_rs(arr)
        for i in range(len(arr)):
            l=i-self.ls[i]
            r=self.rs[i]-i
            sum=(sum+(l*r*arr[i])%mod)%mod
        return sum