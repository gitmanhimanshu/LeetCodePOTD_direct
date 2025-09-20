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
    int solve(TreeNode root, long  targetSum) {
        if (root == null) {
            return 0;
        }

        int c = 0;
        if (targetSum - root.val == 0) {
            c++;

        }

        c += solve(root.left, targetSum - root.val);
        c += solve(root.right, targetSum - root.val);
        return c;
    }

    public int pathSum(TreeNode root, int targetSum) {

        int ans = helper(root, targetSum);
        return ans;
    }

    int helper(TreeNode root, long  targetSum) {
        if (root == null) {
            return 0;
        }
        int c = 0;
        c += solve(root, targetSum);
        c += helper(root.left, targetSum);
        c += helper(root.right, targetSum);
        return c;
    }
}