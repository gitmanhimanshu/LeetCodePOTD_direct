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
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> him1=new PriorityQueue<>();
        Queue<TreeNode> him=new LinkedList<>();
        him.add(root);
       
        while(!him.isEmpty()){
            int l=him.size();
            long s=0;
            for(int i=1;i<=l;i++){
             TreeNode p=him.poll();
                s+=p.val;
                if(p.left!=null){
                    him.add(p.left);

                }
                if(p.right!=null){
                    him.add(p.right);
                }
            }
            if(him1.size()<k){
                him1.add(s);
            }else{
                if(s>him1.peek()){
                    him1.poll();
                    him1.add(s);
                }
            }
        }
        if(him1.size()<k){
            return -1;
        }
        return him1.peek();

    }
}