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
    public void traversal (TreeNode root, int lvl, List<List<Integer>> tree){
        if (root==null) return;

        if (tree.size()<=lvl) tree.add(new ArrayList<>());
        tree.get(lvl).add(root.val);

        traversal(root.left, lvl+1, tree);
        traversal(root.right, lvl + 1, tree);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> tree = new ArrayList<>();
        traversal(root, 0, tree);
        return tree;
    }
}

// Input: root = [3,9,20,null,null,15,7]
// Output: [[3],[9,20],[15,7]]
