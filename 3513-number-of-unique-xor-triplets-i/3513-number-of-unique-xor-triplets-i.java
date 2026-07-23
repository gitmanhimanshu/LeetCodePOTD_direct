// recursion
// class Solution {
//     public int uniqueXorTriplets(int[] nums) {
//         Set<Integer> him = new HashSet<>();
//         solve(0, 0, nums, 0, him);
//         return him.size();
//     }

//     void solve(int cnt, int start, int[] nums, int xor, Set<Integer> set) {
//             if (cnt == 3) {
//             set.add(xor);
//             return;
//         }
// for (int i = start; i < nums.length; i++) {
//             solve(cnt + 1, i, nums, xor ^ nums[i], set);
//         }

            
//     }
// }
//memoization
// class Solution {
//     HashMap<String, HashSet<Integer>> dp = new HashMap<>();

//     public int uniqueXorTriplets(int[] nums) {
//         return solve(0, 0, nums, 0).size();
//     }

//     HashSet<Integer> solve(int cnt, int start, int[] nums, int xor) {
//         if (cnt == 3) {
//             HashSet<Integer> ans = new HashSet<>();
//             ans.add(xor);
//             return ans;
//         }

//         String key = cnt + "#" + start + "#" + xor;
//         if (dp.containsKey(key))
//             return dp.get(key);

//         HashSet<Integer> res = new HashSet<>();

//         for (int i = start; i < nums.length; i++) {
//             res.addAll(solve(cnt + 1, i, nums, xor ^ nums[i]));
//         }

//         dp.put(key, res);
//         return res;
//     }
// }
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if (n < 3) return n;

        int ans = 1;
        while (ans <= n) {
            ans <<= 1;
        }

        return ans;
    }
}