package leetcode.editor.cn;//给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
//
// 
//
// 示例： 
//
// 输入："Let's take LeetCode contest"
//输出："s'teL ekat edoCteeL tsetnoc"
// 
//
// 
//
// 提示： 
//
// 
// 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。 
// 
// Related Topics 双指针 字符串 👍 386 👎 0

//Java：反转字符串中的单词 III
public class ReverseWordsInAStringIii{
    public static void main(String[] args) {
        Solution solution = new ReverseWordsInAStringIii().new Solution();
        // TO TEST
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < str.length; i++) {
            buffer.append(new StringBuffer((str[i])).reverse());
            buffer.append(" ");
        }
        return buffer.toString().trim();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}