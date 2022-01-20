package leetcode.editor.cn;//给定一个二叉树，找出其最大深度。
//
// 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例： 
//给定二叉树 [3,9,20,null,null,15,7]， 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回它的最大深度 3 。 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 1084 👎 0

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Java：二叉树的最大深度
public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        Solution solution = new MaximumDepthOfBinaryTree().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        int result = 0;
        int path = 0;
        public int maxDepth(TreeNode root) {
//            if (root == null) return 0;
//            int left = maxDepth(root.left);
//            int right = maxDepth(root.right);
//            return Math.max(left, right) + 1;
            maxDepthDeal(root);
            return result;
        }

        private void maxDepthDeal(TreeNode root) {
            if (root == null) return;
            path++;
            result = Math.max(result, path);
            maxDepthDeal(root.left);
            maxDepthDeal(root.right);
            path--;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}