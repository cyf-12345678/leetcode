package leetcode.editor.cn;//给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。
//
// 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。 
//
// 示例: 
//
// 给定的有序链表： [-10, -3, 0, 5, 9],
//
//一个可能的答案是：[0, -3, 9, -10, null, 5], 它可以表示下面这个高度平衡二叉搜索树：
//
//      0
//     / \
//   -3   9
//   /   /
// -10  5
// 
// Related Topics 树 二叉搜索树 链表 分治 二叉树 👍 648 👎 0

//Java：有序链表转换二叉搜索树
public class ConvertSortedListToBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new ConvertSortedListToBinarySearchTree().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
        ListNode cur;

        public TreeNode sortedListToBST(ListNode head) {
            // 单链表，转为高度平衡的二叉搜索树
            cur = head;
            int len = 0;
            while (head != null) {
                ++len;
                head = head.next;
            }

            return sortedListToBSTDeal(0, len - 1);
        }

        private TreeNode sortedListToBSTDeal(int start, int end) {
            if (start > end) return null;

            int mid = (start + end + 1) / 2;
            TreeNode leftNode = sortedListToBSTDeal(start, mid - 1);
            TreeNode root = new TreeNode(cur.val);
            cur = cur.next;
            TreeNode rightNode = sortedListToBSTDeal(mid + 1, end);
            root.left = leftNode;
            root.right = rightNode;
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}