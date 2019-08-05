package sort;

import java.util.Arrays;;

/**
 * QuickSort
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 95, 85, 12, 52, 64, 74, 105, 502, 4, 7, 6, 1, 74, 60, 141, 19, 34, 45, 59 };
        long start = System.nanoTime();
        System.out.println(Arrays.toString(arr));
        QuickSort.quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        long end = System.nanoTime();
        System.out.println("花费了" + (end - start) + "纳秒");
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (arr.length <= 0) {
            throw new RuntimeException("This arr is null");
        }
        if (arr.length == 1 || low >= high) {
            return;
        }
        int l = low;
        int h = high;

        int standard = arr[low];

        while (l < h) {

            while (l < h && standard < arr[h]) {
                h--;
            }
            if (l < h) {
                arr[l] = arr[h];
                l++;
            }
            while (l < h && standard > arr[l]) {
                l++;
            }
            if (l < h) {
                arr[h] = arr[l];
                h--;
            }
        }
        arr[l] = standard;
        if (l > low) {
            quickSort(arr, low, l - 1);
        }
        if (h < high) {
            quickSort(arr, h + 1, high);
        }
    }

}