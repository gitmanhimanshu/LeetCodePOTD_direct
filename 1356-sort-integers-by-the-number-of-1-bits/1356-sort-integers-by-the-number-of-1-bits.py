class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        return sorted(arr,key=lambda x:(x.bit_count(),x))
        







# class pair implements Comparable<pair>{
# int ele;
# int bit;
#  pair(int ele,int bit){
#     this.ele=ele;
#     this.bit=bit;
#  }
#  public int compareTo(pair that){
#     int diff= this.bit-that.bit;
#     if(diff!=0){
#         return diff;
#     }
#     return this.ele-that.ele;
#  }
# }

# class Solution {
#     int find(int n){
#     int c=0;
#     while(n>0){
#         c+=(n&1);
#         n=n>>1;
#     }
#     return c;
# }
#     public int[] sortByBits(int[] arr) {
#      PriorityQueue<pair> him=new PriorityQueue<>();
#      for (int i:arr){
#         him.add(new pair(i,find(i)));
#      }
#    int i=0;
#    while(!him.isEmpty()){
#     arr[i++]=him.poll().ele;
#    }
#        return arr; 
#     }
# }