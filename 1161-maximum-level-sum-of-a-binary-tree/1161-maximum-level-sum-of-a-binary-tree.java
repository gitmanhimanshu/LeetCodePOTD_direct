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
       int level=0,flevel=0;;
        if(root==null){
            return 0;
        }
        
        Queue<TreeNode> him1=new LinkedList<>();
        him1.add(root);
        int ans=Integer.MIN_VALUE;
        while(!him1.isEmpty()){
            int l=him1.size();
            level++;
            int sum=0;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<l;i++){
                   TreeNode h=him1.remove();
                sum=sum+h.val;
                if(h.left!=null){
                    him1.add(h.left);
                }
                if(h.right!=null){
                    him1.add(h.right);
                }
            }
           
           if(sum>ans){
                  ans=sum;
               flevel=level;
           }
        
        }
return flevel;
    }
}