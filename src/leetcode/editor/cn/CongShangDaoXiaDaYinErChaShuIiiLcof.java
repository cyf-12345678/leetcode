package leetcode.editor.cn;//请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
//
// 
//
// 例如: 
//给定二叉树: [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其层次遍历结果： 
//
// [
//  [3],
//  [20,9],
//  [15,7]
//]
// 
//
// 
//
// 提示： 
//
// 
// 节点总数 <= 1000 
// 
// Related Topics 树 广度优先搜索 二叉树 👍 173 👎 0

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

//Java：从上到下打印二叉树 III
public class CongShangDaoXiaDaYinErChaShuIiiLcof {
    public static void main(String[] args) {
        Solution solution = new CongShangDaoXiaDaYinErChaShuIiiLcof().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        List<List<Integer>> result = new LinkedList<>();

        public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null) return result;

            Deque<TreeNode> queue = new ArrayDeque<>();
            queue.offer(root);
            boolean flag = false;
            while (!queue.isEmpty()) {
                int count = queue.size();
                LinkedList<Integer> list = new LinkedList<>();
                for (int i = 0; i < count; i++) {
                    TreeNode node = queue.poll();
                    if (flag) {
                        list.addFirst(node.val);
                    } else {
                        list.addLast(node.val);
                    }
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
                flag = !flag;
                result.add(list);
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}