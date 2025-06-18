class Solution {
    public int[][] divideArray(int[] nums, int k) {
       List<int []> him=new ArrayList<>();
       Arrays.sort(nums); 
       for(int i=0;i<nums.length-2;i+=3){
         if((nums[i+2]-nums[i])>k){
            return new int[][]{};
         }
           him.add(new int[]{nums[i],nums[i+1],nums[i+2]});
       }
     return him.toArray(new int[him.size()][]);
    }
}