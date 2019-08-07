package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * MySort
 * 构建1-n的数组n=200
 * 随机打乱数组
 * 排序
 * 要求使用Junit test通过测试
 */
public class MySort {
    public static void main(String[] args) {
        MySort ms=new MySort();
        //构建长度200的数组
        int[] arr = new int[200];
        //给数组赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        // System.out.println(Arrays.toString(arr));
        //调用测试方法
        int[] newArr = ms.MyQuestion(arr);
        //对比测试前后结束
        // System.out.println(Arrays.toString(newArr));
        // System.out.println(Arrays.equals(arr, newArr));
        boolean b=true;
        for (int i = 0; i < newArr.length; i++) {
            if (b==false) {
                break;
            }
            if (newArr[i]!=i) {
                b=false;
            }
        }
        System.out.println(b);
    }

    
    public int[] MyQuestion(int[] arr) {
        if (arr==null||arr.length==0) {
            throw new RuntimeException("This arr is null");
        }
        
        //随机打乱数组
        int[] newArr=MySort.shuffle(arr);
        System.out.println(Arrays.toString(newArr));
        //排序
        QuickSort.quickSort(newArr, 0, newArr.length-1);
        

        return newArr;

    }

    public static int[] shuffle(int[] arr) {
        if (arr==null||arr.length==0) {
            throw new RuntimeException("This arr is null");
        }

        Integer[] integers=new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            integers[i]=arr[i];
        }

        List<Integer> list=Arrays.asList(integers);
        Collections.shuffle(list);
        int[] a=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
           a[i]=list.get(i);
        }
        return a;

    }
    
}