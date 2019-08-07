package sort;

import org.junit.Test;
import org.junit.Assert;

/**
 * MySortTest
 */
public class MySortTest {
    @Test
    public void TestMySort() {
        MySort ms=new MySort();
        //构建长度200的数组
        int[] arr = new int[200];
        //给数组赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        //调用测试方法
        int[] newArr = ms.MyQuestion(arr);
        //对比测试结果
        Assert.assertArrayEquals(arr, newArr);
    }
}