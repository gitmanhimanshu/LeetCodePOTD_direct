class Solution {
    public int pivotIndex(int[] nums) {
        int l[]=new int[nums.length];
        int r[]=new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length;i++){
            l[i]=s;
            s+=nums[i];
        }
        s=0;
          for(int i=nums.length-1;i>=0;i--){
            r[i]=s;
            s+=nums[i];
        }
//         System.out.println(Arrays.toString(l));
// System.out.println(Arrays.toString(r));
for(int i=0;i<nums.length;i++){
    if(l[i]==r[i]){
        return i;
    }
}
        return -1;
    }
}