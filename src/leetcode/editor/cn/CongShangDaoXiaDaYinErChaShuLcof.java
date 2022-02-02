package leetcode.editor.cn;//从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
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
// 返回： 
//
// [3,9,20,15,7]
// 
//
// 
//
// 提示： 
//
// 
// 节点总数 <= 1000 
// 
// Related Topics 树 广度优先搜索 二叉树 👍 157 👎 0

import java.util.*;

//Java：从上到下打印二叉树
public class CongShangDaoXiaDaYinErChaShuLcof {
    public static void main(String[] args) {
        Solution solution = new CongShangDaoXiaDaYinErChaShuLcof().new Solution();
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
        public int[] levelOrder(TreeNode root) {
            if (root == null) return new int[]{};
            Queue<TreeNode> queue = new LinkedList<>();
            List<Integer> list = new ArrayList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            int[] nums = new int[list.size()];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = list.get(i);
            }
            return nums;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}