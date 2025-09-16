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
    int p=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> him=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            him.put(inorder[i],i);
        }
        return solve(0,inorder.length-1,preorder,inorder,him);
    }
    TreeNode solve(int st,int en,int []pre,int []in,Map<Integer,Integer> him){
        if(st>en){
            return null;
        }
        TreeNode root=new TreeNode(pre[p]);
        p++;
        int ind=him.get(root.val);
        root.left=solve(st,ind-1,pre,in,him);
        root.right=solve(ind+1,en,pre,in,him);
        return root;
    }
}