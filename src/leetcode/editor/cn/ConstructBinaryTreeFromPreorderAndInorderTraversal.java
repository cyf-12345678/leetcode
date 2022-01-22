package leetcode.editor.cn;//给定一棵树的前序遍历 preorder 与中序遍历 inorder。请构造二叉树并返回其根节点。
//
// 
//
// 示例 1: 
//
// 
//Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//Output: [3,9,20,null,null,15,7]
// 
//
// 示例 2: 
//
// 
//Input: preorder = [-1], inorder = [-1]
//Output: [-1]
// 
//
// 
//
// 提示: 
//
// 
// 1 <= preorder.length <= 3000 
// inorder.length == preorder.length 
// -3000 <= preorder[i], inorder[i] <= 3000 
// preorder 和 inorder 均无重复元素 
// inorder 均出现在 preorder 
// preorder 保证为二叉树的前序遍历序列 
// inorder 保证为二叉树的中序遍历序列 
// 
// Related Topics 树 数组 哈希表 分治 二叉树 👍 1385 👎 0

//Java：从前序与中序遍历序列构造二叉树
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public static void main(String[] args) {
        Solution solution = new ConstructBinaryTreeFromPreorderAndInorderTraversal().new Solution();
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
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            // 前序遍历 根左右 第一个值为根   中序遍历 左根右

            // 根据根节点在中序遍历中找出左树和右树

            // 0到index，index到最后

            // 3, 9 , 20, 15, 7      9, 3, 15, 20, 7
            return buildTreeDeal(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        }

        private TreeNode buildTreeDeal(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
            if (preStart > preEnd) return null;

            int rootValue = preorder[preStart];
            int index = 0;
            for (int i = inStart; i <= inEnd; i++) {
                if (rootValue == inorder[i]) {
                    index = i;
                    break;
                }
            }
            int leftLength = index - inStart;
            TreeNode root = new TreeNode(rootValue);

            root.left = buildTreeDeal(preorder, preStart + 1, preStart + leftLength, inorder, inStart, index - 1);
            root.right = buildTreeDeal(preorder, preStart + leftLength + 1, preEnd, inorder, index + 1, inEnd);
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}