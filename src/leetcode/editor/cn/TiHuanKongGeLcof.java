package leetcode.editor.cn;//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
// Related Topics 字符串 👍 202 👎 0

//Java：替换空格
public class TiHuanKongGeLcof {
    public static void main(String[] args) {
        Solution solution = new TiHuanKongGeLcof().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String replaceSpace(String s) {
            StringBuilder str = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == ' ') {
                    str.append("%20");
                } else {
                    str.append(c);
                }
            }
            return str.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}