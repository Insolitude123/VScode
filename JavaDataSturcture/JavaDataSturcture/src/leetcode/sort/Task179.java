package leetcode.sort;

/**
 * Task179
 * 给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。

示例 1:
输入: [10,2]
输出: 210

示例 2:
输入: [3,30,34,5,9]
输出: 9534330
说明: 输出结果可能非常大，所以你需要返回一个字符串而不是整数。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/largest-number
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Task179 {
    public String largestNumber(int[] nums) {
        String s = "";
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {        
                if (Long.parseLong(nums[i]+""+nums[j]+"")<Long.parseLong(nums[j]+""+nums[i]+"")) {
                    nums[i]=nums[i]^nums[j];
                    nums[j]=nums[i]^nums[j];
                    nums[i]=nums[i]^nums[j];
                }
            }
        }

        for (int n : nums) {
            s+=n+"";
        }
        if (s.startsWith("0")) {
            return "0";
        } else {
            return s;
        }
    }
}