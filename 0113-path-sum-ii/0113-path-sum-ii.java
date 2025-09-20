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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(root, targetSum, ans, temp);
        return ans;
    }

    void solve(TreeNode root, int targetSum, List<List<Integer>> ans, List<Integer> temp) {
        if (root == null) {
            return;
        }
        temp.add(root.val);
        if (root.left == null && root.right == null) {
            if (targetSum - root.val == 0) {
                ans.add(new ArrayList<>(temp));
                
            }
            temp.remove(temp.size()-1);
            return;
        }
        solve(root.left, targetSum-root.val, ans, temp);
        solve(root.right, targetSum-root.val, ans, temp);
        temp.remove(temp.size()-1);
    }
}