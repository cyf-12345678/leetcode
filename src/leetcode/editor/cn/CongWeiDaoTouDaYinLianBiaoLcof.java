package leetcode.editor.cn;//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
// Related Topics 栈 递归 链表 双指针 👍 231 👎 0

import java.util.Stack;

//Java：从尾到头打印链表
public class CongWeiDaoTouDaYinLianBiaoLcof {
    public static void main(String[] args) {
        Solution solution = new CongWeiDaoTouDaYinLianBiaoLcof().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public int[] reversePrint(ListNode head) {
            ListNode node = head;
            int len = 0;
            while (node != null) {
                ++len;
                node = node.next;
            }

            node = head;
            int[] nums = new int[len];
            for (int i = len - 1; i >= 0; --i) {
                nums[i] = node.val;
                node = node.next;
            }
            return nums;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}