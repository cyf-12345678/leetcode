package leetcode.editor.cn;//给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1]
//输出：[[0,1],[1,0]]
// 
//
// 示例 3： 
//
// 
//输入：nums = [1]
//输出：[[1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 6 
// -10 <= nums[i] <= 10 
// nums 中的所有整数 互不相同 
// 
// Related Topics 数组 回溯 👍 1721 👎 0

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Java：全排列
public class Permutations {
    public static void main(String[] args) {
        Solution solution = new Permutations().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // 存储所有结果
        List<List<Integer>> result = new ArrayList<>();
        // 存储单个结果
        LinkedList<Integer> process = new LinkedList<>();

        public List<List<Integer>> permute(int[] nums) {
            // 所有可能的全排列
            permuteDeal(nums);
            return result;
        }

        private void permuteDeal(int[] nums) {
            // 回溯退出的条件
            if (process.size() == nums.length) {
                result.add(new ArrayList<>(process));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                // 如果单个的结果里面有相同的数字，跳过
                if (process.contains(nums[i])) {
                    continue;
                }
                // 做出选择
                process.add(nums[i]);
                permuteDeal(nums);
                // 取消选择
                process.removeLast();
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}