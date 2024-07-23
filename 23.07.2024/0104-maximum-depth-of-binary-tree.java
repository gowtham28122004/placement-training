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
    int result = 0;
    
    public int maxDepth(TreeNode root) {
        
        calHeight(root,1);
        return result;
        
    }
    public void calHeight(TreeNode root,int length)
    {
        if(root == null) return;
        if(result < length) result++;
        calHeight(root.left,length+1);
        calHeight(root.right,length+1);
    }
}
