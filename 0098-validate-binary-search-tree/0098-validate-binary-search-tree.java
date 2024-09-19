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
    List<Integer> him;
    public boolean isValidBST(TreeNode root) {
        him=new ArrayList<>();
        inorder(root);
        for(int i=0;i<him.size()-1;i++){
            if(him.get(i)>=him.get(i+1)){
                return false;
            }
        }
        return true;
    }
    void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        him.add(root.val);
        inorder(root.right);
    }
}