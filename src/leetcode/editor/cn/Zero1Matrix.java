package leetcode.editor.cn;//给定一个由 0 和 1 组成的矩阵 mat ，请输出一个大小相同的矩阵，其中每一个格子是 mat 中对应位置元素到最近的 0 的距离。
//
// 两个相邻元素间的距离为 1 。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：mat = [[0,0,0],[0,1,0],[0,0,0]]
//输出：[[0,0,0],[0,1,0],[0,0,0]]
// 
//
// 示例 2： 
//
// 
//
// 
//输入：mat = [[0,0,0],[0,1,0],[1,1,1]]
//输出：[[0,0,0],[0,1,0],[1,2,1]]
// 
//
// 
//
// 提示： 
//
// 
// m == mat.length 
// n == mat[i].length 
// 1 <= m, n <= 10⁴ 
// 1 <= m * n <= 10⁴ 
// mat[i][j] is either 0 or 1. 
// mat 中至少有一个 0 
// 
// Related Topics 广度优先搜索 数组 动态规划 矩阵 👍 576 👎 0

import java.util.LinkedList;
import java.util.Queue;

//Java：01 矩阵
public class Zero1Matrix {
    public static void main(String[] args) {
        Solution solution = new Zero1Matrix().new Solution();
        // TO TEST
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        solution.updateMatrix(mat);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int[][] updateMatrix(int[][] mat) {
            int[][] round = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

            int x = mat.length, y = mat[0].length;
            int[][] nums = new int[x][y];
            boolean[][] wea = new boolean[x][y];
            Queue<int[]> queue = new LinkedList<>();
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if (mat[i][j] == 0) {
                        queue.offer(new int[]{i, j});
                        wea[i][j] = true;
                    }
                }
            }

            while (!queue.isEmpty()) {
                int[] cell = queue.poll();
                int i = cell[0], j = cell[1];
                for (int k = 0; k < 4; ++k) {
                    int ni = i + round[k][0];
                    int nj = j + round[k][1];
                    if (ni >= 0 && ni < x && nj >= 0 && nj < y && !wea[ni][nj]) {
                        nums[ni][nj] = nums[i][j] + 1;
                        queue.offer(new int[]{ni, nj});
                        wea[ni][nj] = true;
                    }
                }
            }
            return nums;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}