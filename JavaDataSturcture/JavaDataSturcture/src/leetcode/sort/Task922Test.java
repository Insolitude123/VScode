package leetcode.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Task349Test
 */
public class Task922Test {
    @Test
    public void name() {
        Task922 t1= new Task922();
        int[] nums1=new int[]{4,9,5,2};

        assertArrayEquals(new int[]{4,9,2,5}, t1.sortArrayByParityII(nums1));
    }
}