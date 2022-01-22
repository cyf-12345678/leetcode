package leetcode.editor.cn;//根据一棵树的中序遍历与后序遍历构造二叉树。
//
// 注意: 
//你可以假设树中没有重复的元素。 
//
// 例如，给出 
//
// 中序遍历 inorder = [9,3,15,20,7]
//后序遍历 postorder = [9,15,7,20,3] 
//
// 返回如下的二叉树： 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
// Related Topics 树 数组 哈希表 分治 二叉树 👍 654 👎 0

//Java：从中序与后序遍历序列构造二叉树
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public static void main(String[] args) {
        Solution solution = new ConstructBinaryTreeFromInorderAndPostorderTraversal().new Solution();
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
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            // 中序遍历 左根右   后序遍历 左右根
            return  buildTreeDeal(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
        }

        private TreeNode buildTreeDeal(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
            if (inStart > inEnd) return null;

            int rootValue = postorder[postEnd];
            int index = 0;
            for (int i = inStart; i <= inEnd; i++) {
                if (inorder[i] == rootValue) {
                    index = i;
                    break;
                }
            }
            int leftLength = index - inStart;
            TreeNode root = new TreeNode(rootValue);
            root.left = buildTreeDeal(inorder, inStart, index - 1, postorder, postStart, leftLength + postStart - 1);
            root.right = buildTreeDeal(inorder, index + 1, inEnd, postorder, leftLength + postStart, postEnd - 1);
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}