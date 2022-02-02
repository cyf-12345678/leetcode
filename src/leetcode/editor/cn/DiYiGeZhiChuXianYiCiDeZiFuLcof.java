package leetcode.editor.cn;//在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
//
// 示例 1: 
//
// 
//输入：s = "abaccdeff"
//输出：'b'
// 
//
// 示例 2: 
//
// 
//输入：s = "" 
//输出：' '
// 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 50000 
// Related Topics 队列 哈希表 字符串 计数 👍 172 👎 0

import java.util.HashMap;
import java.util.Map;

//Java：第一个只出现一次的字符
public class DiYiGeZhiChuXianYiCiDeZiFuLcof {
    public static void main(String[] args) {
        Solution solution = new DiYiGeZhiChuXianYiCiDeZiFuLcof().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public char firstUniqChar(String s) {
            // 找出字符串中第一个只出现一次的字符
            Map<Character, Integer> map = new HashMap<>();
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
            }
            for (int i = 0; i < chars.length; i++) {
                if (map.get(chars[i]) == 1) {
                    return chars[i];
                }
            }
            return ' ';
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}