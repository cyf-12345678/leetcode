package leetcode.editor.cn;//给你一个整数 n ，请你生成并返回所有由 n 个节点组成且节点值从 1 到 n 互不相同的不同 二叉搜索树 。可以按 任意顺序 返回答案。
//
// 
//
// 
// 
// 示例 1： 
//
// 
//输入：n = 3
//输出：[[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：[[1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 8 
// 
// 
// 
// Related Topics 树 二叉搜索树 动态规划 回溯 二叉树 👍 1099 👎 0


import java.util.LinkedList;
import java.util.List;

//Java：不同的二叉搜索树 II
public class UniqueBinarySearchTreesIi {
    public static void main(String[] args) {
        Solution solution = new UniqueBinarySearchTreesIi().new Solution();
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
        public List<TreeNode> generateTrees(int n) {
            if (n == 0) return new LinkedList<>();
            return generateTreesDeal(1, n);
        }

        private List<TreeNode> generateTreesDeal(int left, int right) {
            List<TreeNode> result = new LinkedList<>();
            if (left > right) {
                result.add(null);
                return result;
            }

            for (int i = left; i <= right; i++) {
                List<TreeNode> leftTree = generateTreesDeal(left, i - 1);
                List<TreeNode> rightTree = generateTreesDeal(i + 1, right);
                for (TreeNode treeNode : leftTree) {
                    for (TreeNode node : rightTree) {
                        TreeNode root = new TreeNode(i);
                        root.left = treeNode;
                        root.right = node;
                        result.add(root);
                    }
                }
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}