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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> him=new HashSet<>();
        for(int i:to_delete){
            him.add(i);
        }

        List<TreeNode> ans=new ArrayList<>();
        solve(ans,root,him);
        if(!him.contains(root.val)){
            ans.add(root);
        }
        return ans;
    }
    TreeNode  solve(List<TreeNode>ans,TreeNode root,Set<Integer> him){
        if(root==null){
            return null;
        }
    root.left=    solve(ans,root.left,him);
        root.right=solve(ans,root.right,him);
        if(him.contains(root.val)){
            if(root.left!=null){
                ans.add(root.left);
            }
            if(root.right!=null){
            ans.add(root.right);
            }
            return null;
        }
        return root;

    }
}