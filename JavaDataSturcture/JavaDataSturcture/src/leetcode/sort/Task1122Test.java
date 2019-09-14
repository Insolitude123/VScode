package leetcode.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Task349Test
 */
public class Task1122Test {
    @Test
    public void name() {
        Task1122 t1= new Task1122();
        int[] nums1=new int[]{2,3,1,3,2,4,6,7,9,2,19};
        int[] nums2=new int[]{2,1,4,3,9,6};

        assertArrayEquals(new int[]{2,2,2,1,4,3,3,9,6,7,19}, t1.relativeSortArray(nums1,nums2));
    }
}