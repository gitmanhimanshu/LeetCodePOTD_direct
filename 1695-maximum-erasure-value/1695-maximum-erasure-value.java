class Solution {
    public int maximumUniqueSubarray(int[] nums) {
     int l=0;
     int i=0;
     int j=0;
     int sum=0;
     Map<Integer,Integer> him=new HashMap<>();
     while(j<nums.length){
    sum+=nums[j];
    int e=nums[j];
    while(him.containsKey(e)){
        sum-=nums[i];
        him.remove(nums[i]);
        i++;
    }
    l=Math.max(l,sum);
    him.put(e,j);    j++;

     }   
     return l;
    }
}