class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
        }
         int size = 1;
        while (size <= max) {
            size <<= 1;
        }

        boolean h1[] = new boolean[size];
        boolean h2[] = new boolean[size];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (!h1[nums[i] ^ nums[j]]) {
                    h1[nums[i] ^ nums[j]] = true;
                }
            }
        }
        for(int i=0;i<h1.length;i++){
            for(int j=0;j<nums.length;j++){
                if(h1[i]){
                    h2[i^nums[j]]=true;
                }
            }
        }
        int c=0;
        for(boolean co:h2){
            if(co){
                    c++;
            }
        }
        return c;
    }

    public int max(int num) {
        if (num <= 2) {
            return num;
        }
        int n = 2;
        while (n <= num) {
            n = n * 2;
        }
        return n;
    }

    //     public int uniqueXorTriplets(int[] nums) {
    //     Set<Integer> h=new HashSet<>();
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i;j<nums.length;j++){
    //             h.add(nums[i]^nums[j]);
    //         }
    //     }
    //     Set<Integer> h1=new HashSet<>();
    //     for(int i:nums){
    //         for(Integer j:h){
    //             h1.add(i^j);
    //         }

    //     }
    //     return h1.size();
    // }
}