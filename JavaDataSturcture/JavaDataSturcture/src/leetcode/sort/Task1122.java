package leetcode.sort;

/**
 * Task1122
 * 给你两个数组，arr1 和 arr2，

arr2 中的元素各不相同
arr2 中的每个元素都出现在 arr1 中
对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末尾。

示例：
输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
输出：[2,2,2,1,4,3,3,9,6,7,19]

提示：
arr1.length, arr2.length <= 1000
0 <= arr1[i], arr2[i] <= 1000
arr2 中的元素 arr2[i] 各不相同
arr2 中的每个元素 arr2[i] 都出现在 arr1 中

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/relative-sort-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Task1122 {
    //LeetCode提交执行时间1ms,击败99%,内存消耗35.7MB,击败100%的java提交用户!!!(开心,纪念)
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] hashMap = new int[1001];
        int[] result = new int[arr1.length];
        int j = 0;
        for (int a : arr1) {
            hashMap[a]++;
        }
        for (int i = 0; i < arr2.length; i++) {
            for ( ; j < result.length&&hashMap[arr2[i]]>0; j++) {
                result[j] = arr2[i];
                hashMap[arr2[i]]--;
            }
        }
        for (int i = 0; i < hashMap.length; i++) {
            while (hashMap[i]!=0) {
                result[j]=i;
                hashMap[i]--;
                j++;
            }
        }
        return result;   
    }
}