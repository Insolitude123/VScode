package leetcode.sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Task349Test
 */
public class Task976Test {
    @Test
    public void name() {
        Task976 t1= new Task976();
        int[] nums1=new int[]{3,2,3,4};
        int expected = 10;

        assertEquals(expected, t1.largestPerimeter(nums1));
    }
}