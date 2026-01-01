/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    void parent(TreeNode root, Map<TreeNode, TreeNode> him) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            him.put(root.left, root);
        }
        if (root.right != null) {
            him.put(root.right, root);
        }
        parent(root.left, him);
        parent(root.right, him);
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> him = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> st = new HashSet<>();
        q.add(target);
        parent(root, him);
        while (!q.isEmpty() && k > 0) {
            int n = q.size();
            k--;
            for (int i = 1; i <= n; i++) {
                TreeNode p = q.poll();
                st.add(p);
                if (p.left != null && !st.contains(p.left)) {
                    q.add(p.left);
                }
                if (p.right != null && !st.contains(p.right)) {
                    q.add(p.right);
                }
                if (him.containsKey(p) && !st.contains(him.get(p))) {
                    q.add(him.get(p));
                }
                
            }
        }
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode p=q.poll();
            ans.add(p.val);
        }
        return ans;

    }
}