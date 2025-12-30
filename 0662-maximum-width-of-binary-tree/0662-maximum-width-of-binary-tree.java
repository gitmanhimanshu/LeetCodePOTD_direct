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
    class Pair{
        TreeNode node;
        long ind;
        Pair(TreeNode node,long ind){
            this.node=node;
            this.ind=ind;
        }

    }
    public int widthOfBinaryTree(TreeNode root) {
        long ans=0;
        Deque<Pair> him=new LinkedList<>();
        him.add(new Pair(root,0));
        while(!him.isEmpty()){
            Pair first=him.peekFirst();
            Pair last=him.peekLast();
            ans=Math.max(ans,last.ind-first.ind+1);
            int n=him.size();
            for(int i=1;i<=n;i++){
                Pair node=him.pollFirst();
                if(node.node.left!=null){
                    long ind=2*node.ind+1;
                    him.add(new Pair(node.node.left,ind));
                }
                if(node.node.right!=null){
                    long ind=2*node.ind+2;
                    him.add(new Pair(node.node.right,ind));
                }
            }
        }
       
    return (int)ans;
    }
}