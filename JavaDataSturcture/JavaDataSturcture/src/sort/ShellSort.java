package sort;

import java.util.Arrays;

/**
 * ShellSort
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 95, 85, 12, 52, 64, 74, 105, 502, 4, 7, 6, 1, 74, 60, 141, 19, 34, 45, 59 };
        long start = System.nanoTime();
        System.out.println(Arrays.toString(arr));
        ShellSort.shellSort(arr);
        System.out.println(Arrays.toString(arr));
        long end = System.nanoTime();
        System.out.println("花费了" + (end - start) + "纳秒");
    }

    public static void shellSort(int[] arr) {

        for (int d = arr.length / 2; d > 0; d/=2) {
            for (int i = d; i < arr.length; i++) {
                int temp = arr[i];
                int j;
                for (j = i - d; j >= 0 && temp < arr[j]; j -= d) {
                    arr[j+d] = arr[j];
                }
                arr[j + d] = temp;
            }
        }

    }
}