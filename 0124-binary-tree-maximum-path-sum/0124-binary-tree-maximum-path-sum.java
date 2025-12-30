/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
solve(root);
return  maxSum;
    }

    int solve(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left=solve(root.left);
        int right=solve(root.right);
      int lfmax=Math.max(left,0);
      int rmax=Math.max(right,0);
      maxSum = Math.max(maxSum, left + right + root.val);
      return Math.max(lfmax+rmax+root.val,lfmax+rmax);
    }
}