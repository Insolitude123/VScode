package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;
import org.junit.Assert;

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
        ms.MyQuestion();
    }

    @Test
    public void MyQuestion() {
        //构建长度200的数组
        int[] arr = new int[200];
        //给数组赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));
        //随机打乱数组
        int[] newArr=MySort.shuffle(arr);
        System.out.println(Arrays.toString(newArr));
        //排序
        QuickSort.quickSort(newArr, 0, newArr.length-1);
        
        System.out.println(Arrays.toString(newArr));
        //比较数组是否相同
        System.out.println(Arrays.equals(arr, newArr));
        Assert.assertArrayEquals(arr, newArr);


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