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

    private int diame=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diame;
    }
    private int height(TreeNode node) {
        if(node==null)return 0;
     int left=height(node.left);
     int right=height(node.right);

     diame=Math.max(diame,left+right);

return Math.max(left, right)+1;
    }
}
