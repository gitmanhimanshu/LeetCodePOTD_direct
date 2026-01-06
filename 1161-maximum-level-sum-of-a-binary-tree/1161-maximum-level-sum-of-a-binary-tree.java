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
    public int maxLevelSum(TreeNode root) {
        Map<Integer,Integer> him=new HashMap<>();
        solve(root,him,1);
        int ans=Integer.MIN_VALUE;
        int l=0;
        for(int i:him.keySet()){
            int val=him.get(i);
            if(val>ans){
                ans=val;
                l=i;
            }
        }
        return l;
    }
    void solve(TreeNode root,Map<Integer,Integer> him,int l){
        if(root==null){
            return;
        }
        him.put(l,him.getOrDefault(l,0)+root.val);
        solve(root.left,him,l+1);
        solve(root.right,him,l+1);
    }
}