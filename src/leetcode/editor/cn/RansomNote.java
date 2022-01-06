package leetcode.editor.cn;//给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
//
// 如果可以，返回 true ；否则返回 false 。 
//
// magazine 中的每个字符只能在 ransomNote 中使用一次。 
//
// 
//
// 示例 1： 
//
// 
//输入：ransomNote = "a", magazine = "b"
//输出：false
// 
//
// 示例 2： 
//
// 
//输入：ransomNote = "aa", magazine = "ab"
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：ransomNote = "aa", magazine = "aab"
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 1 <= ransomNote.length, magazine.length <= 10⁵ 
// ransomNote 和 magazine 由小写英文字母组成 
// 
// Related Topics 哈希表 字符串 计数 👍 260 👎 0

//Java：赎金信
public class RansomNote{
    public static void main(String[] args) {
        Solution solution = new RansomNote().new Solution();
        // TO TEST
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // 判断第一个字符创能否由第二个字符串里的字符构成
//        StringBuilder str = new StringBuilder(magazine);
//        int index;
//        for (char c : ransomNote.toCharArray()) {
//            index = str.indexOf(String.valueOf(c));
//            if (index >= 0) {
//                str.deleteCharAt(index);
//            } else {
//                return false;
//            }
//        }
//        return true;


        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] nums = new int[26];
        for (char c : magazine.toCharArray()) {
            nums[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            nums[c - 'a']--;
            if (nums[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}