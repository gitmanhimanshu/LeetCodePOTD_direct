class Solution {
    long max = 0;
    int mod = 1000000007;

    public int maxProduct(TreeNode root) {
        long totalSum = solve(root);  
        solve2(root, totalSum);       
        return (int)(max % mod);       
    }


    long solve(TreeNode root) {
        if (root == null) return 0;
        return root.val + solve(root.left) + solve(root.right);
    }

   
    long solve2(TreeNode root, long totalSum) {
        if (root == null) return 0;

        long left = solve2(root.left, totalSum);
        long right = solve2(root.right, totalSum);

        long currSum = left + right + root.val;
        long product = currSum * (totalSum - currSum);

        max = Math.max(max, product);  

        return currSum;
    }
}
