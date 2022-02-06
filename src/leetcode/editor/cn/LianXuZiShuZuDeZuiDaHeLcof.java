package leetcode.editor.cn;//输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
//
// 要求时间复杂度为O(n)。 
//
// 
//
// 示例1: 
//
// 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10^5 
// -100 <= arr[i] <= 100 
// 
//
// 注意：本题与主站 53 题相同：https://leetcode-cn.com/problems/maximum-subarray/ 
//
// 
// Related Topics 数组 分治 动态规划 👍 452 👎 0

//Java：连续子数组的最大和
public class LianXuZiShuZuDeZuiDaHeLcof {
    public static void main(String[] args) {
        Solution solution = new LianXuZiShuZuDeZuiDaHeLcof().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxSubArray(int[] nums) {
            // 记录第一个值为最小值，往后遍历，如果遇上比第一个值小的停止
            // 将该值当做最小值

            // 贪心法
            int max = -101;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (sum <= 0) {
                    sum = nums[i];
                } else {
                    sum += nums[i];
                }
                max = Math.max(max, sum);
            }
            return max;

//            int min = nums[0];
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] < nums[0]) {
//                    min = nums[i];
//
//                }
//            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}