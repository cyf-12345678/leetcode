package leetcode.editor.cn;//给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
//
// 你可以按 任何顺序 返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 4, k = 2
//输出：
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//] 
//
// 示例 2： 
//
// 
//输入：n = 1, k = 1
//输出：[[1]] 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 20 
// 1 <= k <= n 
// 
// Related Topics 数组 回溯 👍 819 👎 0

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Java：组合
public class Combinations {
    public static void main(String[] args) {
        Solution solution = new Combinations().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> process = new LinkedList<>();

        public List<List<Integer>> combine(int n, int k) {
            // 返回【1，n】中所有可能的k的个数的组合
            combineDeal(n, k, 1);
            return result;
        }

        private void combineDeal(int n, int k, int startIndex) {
            if (process.size() == k) {
                result.add(new ArrayList<>(process));
                return;
            }
            //已经选择的元素个数：path.size();
            //还需要的元素个数为: k - path.size();
            //在集合n中至多要从该起始位置 : n - (k - path.size()) + 1，开始遍历
            for (int i = startIndex; i <= n - (k - process.size()) + 1; i++) {
                process.add(i);
                combineDeal(n, k, i + 1);
                process.removeLast();
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}