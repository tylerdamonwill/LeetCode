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
    
    int height(TreeNode r){
        if(r==null){return 0;}
        return 1+Math.max(height(r.left),height(r.right));
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root==null){return true;}
        int l=height(root.left);
        int r=height(root.right);
        return (Math.abs(l-r)<=1 && isBalanced(root.left) && isBalanced(root.right));
    }
}