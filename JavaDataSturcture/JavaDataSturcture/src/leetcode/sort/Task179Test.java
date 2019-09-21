package leetcode.sort;

import org.junit.Test;

import org.junit.Assert;

/**
 * Task179Test
 */
public class Task179Test {
    @Test
    public void name() {
        Task179 t1= new Task179();
        int[] nums1=new int[]{0,0,0,0,0,0,0,0};

        Assert.assertEquals("0", t1.largestNumber(nums1));
    }
}