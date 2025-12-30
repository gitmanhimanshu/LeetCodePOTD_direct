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
    int max=Integer.MIN_VALUE;;
    public int maxPathSum(TreeNode root) {
        if(root==null){
            return 0;
        }
   int a= healper(root);
    return max;
    }
    int healper(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=healper(root.left);
        int right=healper(root.right);
        left=Math.max(0,left);
        right=Math.max(0,right);
        int ans=left+right+root.val;
       max =Math.max(max,ans);
     
        return Math.max(left,right)+root.val;
    }
}