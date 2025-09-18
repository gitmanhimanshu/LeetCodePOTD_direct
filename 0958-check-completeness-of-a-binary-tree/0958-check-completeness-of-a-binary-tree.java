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


// class Solution {
//     public boolean isCompleteTree(TreeNode root) {
//      Queue<TreeNode> him=new LinkedList<>();
//  boolean isGot=false;

//      him.add(root);
//      while(!him.isEmpty()){
//         int n=him.size();
        
//         while(n>0){
//             n--;
//             TreeNode p=him.poll();
//             if(p==null){
//                 isGot=true;
//             }else{
//                 if(isGot){
//                     return false;
//                 }
//                 him.add(p.left);
//                 him.add(p.right);
//             }


//         }

//      }   
//      return true;
//     }
// }
class Solution {
    int count(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=count(root.left);
        int r=count(root.right);
        return 1+l+r;
    }
    public boolean isCompleteTree(TreeNode root) {
        int total=count(root);
        return isComplete(root,1,total);        
    }
    boolean isComplete(TreeNode root,int ind,int total){
        if(root==null){
            return true;
        }
        if(ind>total){
            return false;
        }
        int l=2*ind;
        int r=2*ind+1;
        return isComplete(root.left,l,total)&&isComplete(root.right,r,total);
    }
}