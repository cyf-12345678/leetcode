package leetcode.editor.cn;//给你一个整数 n ，求恰由 n 个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树 有多少种？返回满足题意的二叉搜索树的种数。
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：5
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 19 
// 
// Related Topics 树 二叉搜索树 数学 动态规划 二叉树 👍 1491 👎 0

//Java：不同的二叉搜索树
public class UniqueBinarySearchTrees {
    public static void main(String[] args) {
        Solution solution = new UniqueBinarySearchTrees().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int[][] nums;

        public int numTrees(int n) {
            nums = new int[n + 1][n + 1];
            return count(1, n);
        }

        private int count(int left, int right) {
            if (left > right) return 1;
            if (nums[left][right] != 0) return nums[left][right];
            int result = 0;
            for (int i = left; i <= right; i++) {
                int leftCount = count(left, i - 1);
                int rightCount = count(i + 1, right);
                result += leftCount * rightCount;
            }
            nums[left][right] = result;
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}