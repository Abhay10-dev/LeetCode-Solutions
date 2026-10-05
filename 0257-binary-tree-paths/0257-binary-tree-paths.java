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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> ls = new ArrayList<>();

        if(root == null) return ls;

        findPath(root, "", ls);

        return ls;
    }

    private void findPath(TreeNode root, String path, List<String> ls){
        if(root == null) {
            return;
        } 
        
        path = path + root.val;

        if(root.left == null && root.right == null) {
            ls.add(path);
            return;
        }

        path = path + "->";

        findPath(root.left, path, ls);
        findPath(root.right, path, ls);
    }
}