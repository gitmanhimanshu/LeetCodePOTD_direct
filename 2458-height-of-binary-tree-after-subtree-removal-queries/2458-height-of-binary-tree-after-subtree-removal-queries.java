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
    int level[];
    int height[];
    int levelmax[];
    int levelsecmax[];
    int findhgt(TreeNode root,int l){
        if(root==null){
            return 0;
        }
        level[root.val]=l;
        height[root.val]=Math.max(findhgt(root.left,l+1),findhgt(root.right,l+1))+1;
        if(levelmax[l]<height[root.val]){
            levelsecmax[l]=levelmax[l];
            levelmax[l]=height[root.val];
        }else if(levelsecmax[l]<height[root.val]){
            levelsecmax[l]=height[root.val];
        }
        return height[root.val];

    }
    public int[] treeQueries(TreeNode root, int[] queries) {
        level=new int[100001];
        height=new int[100001];
        levelmax=new int[100001];
        levelsecmax=new int[100001];
        int ans[]=new int [queries.length];
        findhgt(root,0);
        int k=0;
        for(int i:queries){
            int l=level[i];
            int cal=l+(levelmax[l]==height[i]?levelsecmax[l]:levelmax[l])-1;
// agr whi node hi delete krnge to second lrgest lena h
ans[k++]=cal;
        }
        return ans;
    }
}









//brute force simple 35/40 case pass ho gye .......
// class Solution {
//     int[] ans;

   
//     void removeSubtree(TreeNode root, int val, TreeNode originalRoot, int index) {
//         if (root == null)
//             return;

//         if (root.left != null && root.left.val == val) {
//             TreeNode temp = root.left;
//             root.left = null;
//             ans[index] = heightOfTree(originalRoot);
//             root.left = temp;
//             return;
//         }

//         if (root.right != null && root.right.val == val) {
//             TreeNode temp = root.right;
//             root.right = null;
//             ans[index] = heightOfTree(originalRoot);
//             root.right = temp;
//             return;
//         }

//         removeSubtree(root.left, val, originalRoot, index);
//         removeSubtree(root.right, val, originalRoot, index);
//     }

    
//     int heightOfTree(TreeNode root) {
//         if (root == null)
//             return -1;
//         int leftHeight = heightOfTree(root.left);
//         int rightHeight = heightOfTree(root.right);
//         return Math.max(leftHeight, rightHeight) + 1;
//     }

//     public int[] treeQueries(TreeNode root, int[] queries) {
//         ans = new int[queries.length];
//         for (int i = 0; i < ans.length; i++) {
//             removeSubtree(root, queries[i], root, i);
//         }
//         return ans;
//     }
// }
