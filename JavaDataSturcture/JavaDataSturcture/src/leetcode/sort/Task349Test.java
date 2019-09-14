package leetcode.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Task349Test
 */
public class Task349Test {
    @Test
    public void name() {
        Task349 t1= new Task349();
        int[] nums1=new int[]{4,9,5};
        int[] nums2=new int[]{9,4,9,8,4};

        assertArrayEquals(new int[]{4,9}, t1.intersection(nums1, nums2));
    }
}