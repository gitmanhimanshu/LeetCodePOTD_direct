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
    void in(TreeNode root){
        if(root==null){
            return;
        }
        in(root.left);
        him.add(root.val);
        in(root.right);
    }
    Set<Integer> him=new HashSet<>();
    public int findSecondMinimumValue(TreeNode root) {
        in(root);
        int min=Integer.MAX_VALUE;
        if(him.size()<2){
            return -1;
        }
        for(Integer i:him){
            if(i<min){
                min=i;
            }
        }
        
        int min2=Integer.MAX_VALUE;
        for(Integer i:him){
            if(i<min2&&i!=min){
                min2=i;
            }
        }
        return min2;
        
    }
}