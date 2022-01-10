package leetcode.editor.cn;//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 注意：给定 n 是一个正整数。 
//
// 示例 1： 
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶 
//
// 示例 2： 
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
// 
// Related Topics 记忆化搜索 数学 动态规划 👍 2108 👎 0

//Java：爬楼梯
public class ClimbingStairs {
    public static void main(String[] args) {
        Solution solution = new ClimbingStairs().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int climbStairs(int n) {
            // n阶到达楼顶，每次怕一个或两个台阶
            // 2：1+1, 2     3:1+1+1， 1+2， 2+1
            // 4：1+1+1+1， 1+1+2， 1+2+1， 2+1+1，2+2
            if (n <= 2) return n;
            int i1 = 1, i2 = 2;
            for (int i = 3; i <= n; i++) {
                int sum = i1 + i2;
                i1 = i2;
                i2 = sum;
            }
            return i2;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}