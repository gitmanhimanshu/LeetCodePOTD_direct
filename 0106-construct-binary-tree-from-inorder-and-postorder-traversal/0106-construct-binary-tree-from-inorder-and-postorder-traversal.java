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
    int p;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        p=postorder.length-1;
        Map<Integer,Integer> him=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            him.put(inorder[i],i);
        }
        return solve(inorder,postorder,0,p,him);
    }
    TreeNode solve(int []inorder,int []postorder,int st,int en,Map<Integer,Integer> him){
        if(st>en){
            return null;
        }
        TreeNode root=new TreeNode(postorder[p]);
        p--;
        int ind=him.get(root.val);
        root.right=solve(inorder,postorder,ind+1,en,him);
        root.left=solve(inorder,postorder,st,ind-1,him);
        return root;
    }
}