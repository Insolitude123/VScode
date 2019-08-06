package sort;

import java.util.Arrays;

/**
 * InsertSort
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 95, 85, 12, 52, 64, 74, 105, 502, 4, 7, 6, 1, 74, 60, 141, 19, 34, 45, 59 };
        long start = System.nanoTime();
        System.out.println(Arrays.toString(arr));
        InsertSort.insertSort(arr);
        System.out.println(Arrays.toString(arr));
        long end = System.nanoTime();
        System.out.println("花费了" + (end - start) + "纳秒");
    }

    public static void insertSort(int[] arr) {
        if (arr.length == 0) {
            throw new RuntimeException("This arr length is 0");
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                int j ;
                int temp=arr[i];
                for (j = i-1; j >= 0&&temp<arr[j]; j--) {
                    arr[j+1]=arr[j];
                }
                arr[j+1]=temp;
            }


        }
    }

}