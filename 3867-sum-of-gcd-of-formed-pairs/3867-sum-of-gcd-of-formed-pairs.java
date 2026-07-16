class Solution {
    public long gcdSum(int[] nums) {
        int mxi[]=new int [nums.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            mxi[i]=max;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=gcd(nums[i],mxi[i]);
        }
        Arrays.sort(nums);
        //    int pregcd[]=new int[nums.length];

        //    for(int i=0;i<nums.length;i++){
        //     pregcd[i]=gcd(nums[i],)
        //    }
        long ans = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            ans += gcd(nums[i], nums[j]);
            i++;
            j--;
        }
        return ans;

    }

    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}