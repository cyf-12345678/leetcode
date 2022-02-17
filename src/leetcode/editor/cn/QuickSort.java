package leetcode.editor.cn;

/**
 * @author 楼下小程
 * @date 2022/2/17
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left > right) return;
        int temp = arr[left];
        int low = left;
        int high = right;

        while (low != high) {
            while (arr[high] >= temp && low < high) {
                high--;
            }
            while (arr[low] <= temp && low < high) {
                low++;
            }
            int x = arr[low];
            arr[low] = arr[high];
            arr[high] = x;
        }

            arr[left] = arr[low];
            arr[low] = temp;

            quickSort(arr, left, low - 1);
            quickSort(arr, high + 1, right);
    }
}
