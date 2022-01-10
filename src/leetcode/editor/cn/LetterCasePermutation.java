package leetcode.editor.cn;//给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
//
// 
//
// 示例：
//输入：S = "a1b2"
//输出：["a1b2", "a1B2", "A1b2", "A1B2"]
//
//输入：S = "3z4"
//输出：["3z4", "3Z4"]
//
//输入：S = "12345"
//输出：["12345"]
// 
//
// 
//
// 提示： 
//
// 
// S 的长度不超过12。 
// S 仅由数字和字母组成。 
// 
// Related Topics 位运算 字符串 回溯 👍 340 👎 0

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Java：字母大小写全排列
public class LetterCasePermutation {
    public static void main(String[] args) {
        Solution solution = new LetterCasePermutation().new Solution();
        // TO TEST
        solution.letterCasePermutation("a1b2");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<String> result = new LinkedList<>();
        char[] process;

        public List<String> letterCasePermutation(String s) {
            // 将每个字母转变大小写
            process = s.toCharArray();
            letterCasePermutationDeal(process, result, 0);
            return result;
        }

        private void letterCasePermutationDeal(char[] process, List<String> result, int i) {
            if (i == process.length) {
                result.add(new String(process));
                return;
            }
            char ch = process[i];
            if (Character.isLetter(ch)) {
                process[i] = Character.toLowerCase(ch);
                letterCasePermutationDeal(process, result, i + 1);
                process[i] = Character.toUpperCase(ch);
                letterCasePermutationDeal(process, result, i + 1);
            } else {
                letterCasePermutationDeal(process, result, i + 1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}