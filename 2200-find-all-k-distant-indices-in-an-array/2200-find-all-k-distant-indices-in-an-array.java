class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> him=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                int s=Math.max(i-k,0);
                int e=Math.min(nums.length-1,i+k);
                if(him.size()>0&&s<=him.get(him.size()-1)){
                    s=him.get(him.size()-1)+1;
                }
                for(int j=s;j<=e;j++){
                    him.add(j);
                }
            }
        }return him;
    }
}