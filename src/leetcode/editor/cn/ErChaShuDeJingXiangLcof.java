package leetcode.editor.cn;//请完成一个函数，输入一个二叉树，该函数输出它的镜像。
//
// 例如输入： 
//
// 4 
// / \ 
// 2 7 
// / \ / \ 
//1 3 6 9 
//镜像输出： 
//
// 4 
// / \ 
// 7 2 
// / \ / \ 
//9 6 3 1 
//
// 
//
// 示例 1： 
//
// 输入：root = [4,2,7,1,3,6,9]
//输出：[4,7,2,9,6,3,1]
// 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 1000 
//
// 注意：本题与主站 226 题相同：https://leetcode-cn.com/problems/invert-binary-tree/ 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 205 👎 0

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Java：二叉树的镜像
public class ErChaShuDeJingXiangLcof {
    public static void main(String[] args) {
        Solution solution = new ErChaShuDeJingXiangLcof().new Solution();
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
        public TreeNode mirrorTree(TreeNode root) {
            dfs(root);
            return root;
        }

        private void dfs(TreeNode root) {
            if (root == null) return;

            TreeNode node = root.left;
            root.left = root.right;
            root.right = node;

            dfs(root.left);
            dfs(root.right);
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}