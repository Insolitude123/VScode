package sort;

import java.util.Arrays;;

/**
 * BubbleSort
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 95,85,12,52,64,74,105,502,4,7,6,1,74,60,141,19,34,45,59 };
        long start=System.nanoTime();
        System.out.println(Arrays.toString(arr));
        BubbleSort.bubbleSortOptimization2(arr);
        System.out.println(Arrays.toString(arr));
        long end=System.nanoTime();
        System.out.println("花费了"+(end-start)+"纳秒");

    }

    public static void bubbleSort(int[] arr) {
        //花费2060299纳秒
        if (arr.length == 0) {
            throw new RuntimeException("This param arr is null");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortOptimization1(int[] arr) {
        //花费1232381纳秒
        if (arr.length == 0) {
            throw new RuntimeException("This param arr is null");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwap=false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap=true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
    }

    public static void bubbleSortOptimization2(int[] arr) {
        //花费536376纳秒
        if (arr.length == 0) {
            throw new RuntimeException("This param arr is null");
        }

        int n=arr.length-1;
        for (int i = 0; i < arr.length - 1; i++) {
            int newN=0;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    newN=j+1;
                }
            }
            n=newN;
            if (n==0) {
                break;
            }
        }
    }

}