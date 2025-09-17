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
    public boolean isCompleteTree(TreeNode root) {
     Queue<TreeNode> him=new LinkedList<>();
 boolean isGot=false;

     him.add(root);
     while(!him.isEmpty()){
        int n=him.size();
        
        while(n>0){
            n--;
            TreeNode p=him.poll();
            if(p==null){
                isGot=true;
            }else{
                if(isGot){
                    return false;
                }
                him.add(p.left);
                him.add(p.right);
            }


        }

     }   
     return true;
    }
}