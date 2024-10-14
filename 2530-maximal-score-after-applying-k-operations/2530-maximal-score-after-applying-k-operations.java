class pair implements Comparable<pair>{
    int v;
    int ind;
    pair(int v,int ind){
        this.v=v;
        this.ind=ind;

    }
    public int compareTo(pair that){
        return that.v-this.v;
    }
}
class Solution {
    public long maxKelements(int[] nums, int k) {
        //         PriorityQueue<Integer> him=new PriorityQueue<>(Collections.reverseOrder());
// for(int i:nums){
//     him.add(i);
// }
// long ans=0;
// while(k>0){
//     int v=him.poll();
//     ans+=v;
//     int c=v/3;
//     if(v==c*3){
//         him.add(c);
//     }else{
//         him.add(c+1);
//     }
//     k--;
// }
// return ans;
        PriorityQueue<pair> him=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            him.add(new pair(nums[i],i));
        }
        long ans=0;
        while(k>0){
            pair a=him.poll();
            ans+=a.v;
            int c=a.v/3;
            if(a.v==c*3){
                nums[a.ind]=c;
            }else{
                nums[a.ind]=c+1;
            }
            him.add(new pair(nums[a.ind],a.ind));
            k--;        }
        return ans;

    }
}