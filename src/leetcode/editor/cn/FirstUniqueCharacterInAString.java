package leetcode.editor.cn;//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
//
// 
//
// 示例： 
//
// s = "leetcode"
//返回 0
//
//s = "loveleetcode"
//返回 2
// 
//
// 
//
// 提示：你可以假定该字符串只包含小写字母。 
// Related Topics 队列 哈希表 字符串 计数 👍 485 👎 0

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//Java：字符串中的第一个唯一字符
public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        Solution solution = new FirstUniqueCharacterInAString().new Solution();
        // TO TEST
        System.out.println(solution.firstUniqChar("loveleetcode"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int firstUniqChar(String s) {
            // 找到不重复的字符返回其索引。不存在则返回-1
            // 使用hashmap记录字符出现的次数，如果次数为一直接返回
            char[] chars = s.toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < chars.length; i++) {
                map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
            }
            for (int i = 0; i < chars.length; i++) {
                if (map.get(chars[i]) == 1) {
                    return i;
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}