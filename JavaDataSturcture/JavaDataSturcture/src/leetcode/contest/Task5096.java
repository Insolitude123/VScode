package leetcode.contest;

// 5096. 数组变换
// 题目难度Easy
// 首先，给你一个初始数组 arr。然后，每天你都要根据前一天的数组生成一个新的数组。

// 第 i 天所生成的数组，是由你对第 i-1 天的数组进行如下操作所得的：

// 假如一个元素小于它的左右邻居，那么该元素自增 1。
// 假如一个元素大于它的左右邻居，那么该元素自减 1。
// 首、尾元素 永不 改变。
// 过些时日，你会发现数组将会不再发生变化，请返回最终所得到的数组。

// 示例 1：

// 输入：[6,2,3,4]
// 输出：[6,3,3,4]
// 解释：
// 第一天，数组从 [6,2,3,4] 变为 [6,3,3,4]。
// 无法再对该数组进行更多操作。
// 示例 2：

// 输入：[1,6,3,4,3,5]
// 输出：[1,4,4,4,4,5]
// 解释：
// 第一天，数组从 [1,6,3,4,3,5] 变为 [1,5,4,3,4,5]。
// 第二天，数组从 [1,5,4,3,4,5] 变为 [1,4,4,4,4,5]。
// 无法再对该数组进行更多操作。

// 提示：

// 1 <= arr.length <= 100
// 1 <= arr[i] <= 100

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * task5096
 * 输入[1,5,4,7,9,2,5,1,2,5,8,8,3,8,4,4,6,3]
   输出[1,4,5,7,7,4,4,2,2,5,8,8,6,6,4,4,4,3]
   预期[1,4,5,7,7,4,3,2,2,5,8,8,6,5,4,4,4,3]
 */
public class Task5096 {
    public List<Integer> transformArray(int[] arr) {
        int[] oldArr = Arrays.copyOf(arr, arr.length);
        int[] newArr = new int[arr.length]; 
        boolean b=true;
        while (true) {
            b=true;
            for (int i = 0; i < oldArr.length; i++) {
                if (i==0) {
                    newArr[i]=oldArr[i];
                }else if(i == oldArr.length-1){
                    newArr[i]=oldArr[i];
                }else if (oldArr[i]>oldArr[i-1]&&oldArr[i]>oldArr[i+1]) {
                    newArr[i]=oldArr[i]-1;
                    b=false;
                }else if(oldArr[i]<oldArr[i-1]&&oldArr[i]<oldArr[i+1]){
                    newArr[i]=oldArr[i]+1;
                    b=false;
                }else{
                    newArr[i]=oldArr[i];
                }
            }
            if (b) {
                break;
            }
            for (int i = 0; i < oldArr.length; i++) {
                oldArr[i]=newArr[i];
            }   
        }
        Integer[] IntegerArr=new Integer[newArr.length];
        for (int i = 0; i < arr.length; i++) {
            IntegerArr[i]=newArr[i];
        }
        List<Integer> list = new ArrayList<>(Arrays.asList(IntegerArr));
        return list;
    }
}