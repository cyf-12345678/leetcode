package leetcode.editor.cn;//统计一个数字在排序数组中出现的次数。
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [5,7,7,8,8,10], target = 8
//输出: 2 
//
// 示例 2: 
//
// 
//输入: nums = [5,7,7,8,8,10], target = 6
//输出: 0 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// nums 是一个非递减数组 
// -10⁹ <= target <= 10⁹ 
// 
//
// 
//
// 注意：本题与主站 34 题相同（仅返回值不同）：https://leetcode-cn.com/problems/find-first-and-last-
//position-of-element-in-sorted-array/ 
// Related Topics 数组 二分查找 👍 254 👎 0

//Java：在排序数组中查找数字 I
public class ZaiPaiXuShuZuZhongChaZhaoShuZiLcof {
    public static void main(String[] args) {
        Solution solution = new ZaiPaiXuShuZuZhongChaZhaoShuZiLcof().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int search(int[] nums, int target) {
//            int count = 0;
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] == target) {
//                    ++count;
//                }
//            }
//            return count;

            return searchDeal(nums, target + 1) - searchDeal(nums, target);

        }

        private int searchDeal(int[] nums, int target) {

            int left = 0, right = nums.length;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (target <= nums[mid]) {
                    right = mid;
                } else if (target > nums[mid]) {
                    left = mid + 1;
                }
            }
            return left;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}