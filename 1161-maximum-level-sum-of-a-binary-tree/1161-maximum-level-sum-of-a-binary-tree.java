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
       Queue<TreeNode> him=new LinkedList<>();
       if(root==null){
        return 0;
       }
       him.add(root);
       int level=0;
       int ans=0;
       int l=0;
       while(!him.isEmpty()){
        int n=him.size();
        int sum=0;
        l++;
        for(int i=1;i<=n;i++){
            TreeNode p=him.poll();
            sum+=p.val;
            if(p.left!=null){
                him.add(p.left);
            }
            if(p.right!=null){
                him.add(p.right);
            }
        }
        if(sum>ans){
            ans=Math.max(ans,sum);
            level=l;
        }
        
       } 
       return level;
    }
}