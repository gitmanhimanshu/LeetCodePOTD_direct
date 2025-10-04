class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0;
        int c2 = 0;
        int ans1 = -1;
        int ans2 = 1;
        for (int i : nums) {
            if (ans1 == i) {

                c1++;
            } else if (ans2 == i) {
                c2++;
            } else if (c1 == 0) {
                ans1 = i;
                c1++;
            } else if (c2 == 0) {
                ans2 = i;
                c2++;
            } else {
                c1--;
                c2--;
            }
        }
        
        int ans1count = 0, ans2count = 0;
        for (int i : nums) {
            if (i == ans1) {
                ans1count++;
            } else if (i == ans2) {
                ans2count++;
            }
        }
        int c = nums.length / 3;
        List<Integer> ans = new ArrayList<>();
        if (ans1count >c) {
            ans.add(ans1);
        }
         if (ans2count > c) {
            ans.add(ans2);

        } 
        
        return ans;
    }
}