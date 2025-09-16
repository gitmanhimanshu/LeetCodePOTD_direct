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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> him=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            him.put(inorder[i],i);
        }
       return create(preorder,0,preorder.length-1,inorder,0,inorder.length-1,him);
        
    }
    TreeNode create(int pre[],int prestart,int preend,int in[],int instart,int inend,Map<Integer,Integer> him){
        if(prestart>preend||instart>inend){
            return null;
        }
        TreeNode root=new TreeNode(pre[prestart]);
        int pos=him.get(root.val);
        int numleft=pos-instart;
        root.left=create(pre,prestart+1,prestart+numleft,in,instart,pos-1,him);
         root.right=create(pre,prestart+numleft+1,preend,in,pos+1,inend,him);
         return root;
    }

}