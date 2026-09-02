class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        him=[[] for i in range (n+1)]
        for u,v,w in times:
            him[u].append((v,w))
        des=[float('inf')]*(n+1)
        des[k]=0
        pq = [(0, k)]
        while pq:
            val, key =heapq.heappop(pq)
            if(des[key]<val):
                continue
            for a,b in him[key]:
                new=val+b
                if(new<des[a]):
                    des[a]=new
                    heapq.heappush(pq, (new, a))
        ans=0
        for i in range(1, n + 1):

            if des[i] == float('inf'):
                return -1

            ans = max(ans, des[i])
        return ans