


class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] lis = new int[n];  
        int[] ris = new int[n];  
       
        Arrays.fill(lis, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }

        Arrays.fill(ris, 1);
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (nums[i] > nums[j]) {
                    ris[i] = Math.max(ris[i], ris[j] + 1);
                }
            }
        }

       
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < n - 1; i++) {
            if (lis[i] > 1 && ris[i] > 1) {  
                int removals = n - (lis[i] + ris[i] - 1);
                ans = Math.min(ans, removals);
            }
        }

        return ans;
    }
}
//using longest incresing subsequence memoization 60 passed of 90
// class Solution {
//     Map<String, Integer> him;

//     public int minimumMountainRemovals(int[] nums) {
//         int ans = Integer.MAX_VALUE;
//         him = new HashMap<>();


//  int lis[]=new int[nums.length];
//  int ris[]=new int [nums.length];
//  for(int i=0;i<nums.length;i++){
//     lis[i]=prevdec(nums,i,i-1);
//  }
//   for(int i=1;i<nums.length-1;i++){
//    ris[i]= aageincreasing(nums,i,i+1);
//  }
//  for(int i=0;i<nums.length;i++){
//     if(lis[i]>0&&ris[i]>0){
//         ans=Math.min(ans,nums.length-(lis[i]+ris[i]+1));
//     }
//  }
//         // for (int i = 1; i < nums.length - 1; i++) {
//         //     int piche = prevdec(nums, i, i - 1);
//         //     int aaage = aageincreasing(nums, i, i + 1);
            
//         //     if (piche > 0 && aaage > 0) {
//         //         ans = Math.min(ans, nums.length - (piche + aaage + 1));
//         //     }
//         // }
        
//         return ans;
//     }

//     int prevdec(int[] nums, int p, int i) {
//         if (i < 0) return 0;
        
//         String key = "dec-" + p + "," + i;
//         if (him.containsKey(key)) return him.get(key);

//         int take = 0;
//         if (nums[p] > nums[i]) {
//             take = 1 + prevdec(nums, i, i - 1);
//         }
//         int notTake = prevdec(nums, p, i - 1);
        
//         int result = Math.max(take, notTake);
//         him.put(key, result);
//         return result;
//     }

//     int aageincreasing(int[] nums, int p, int i) {
//         if (i >= nums.length) return 0;

//         String key = "inc-" + p + "," + i;
//         if (him.containsKey(key)) return him.get(key);

//         int take = 0;
//         if (nums[p] > nums[i]) {
//             take = 1 + aageincreasing(nums, i, i + 1);
//         }
//         int notTake = aageincreasing(nums, p, i + 1);
        
//         int result = Math.max(take, notTake);
//         him.put(key, result);
//         return result;
//     }
// }
