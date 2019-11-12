package leetcode.contest;

import org.junit.Test;

import java.util.List;
/**
 * task5096Test
 */
public class Task5096Test {

    @Test
    public void name(){
        Task5096 t1 = new Task5096();
        List<Integer> l1 = t1.transformArray(new int[]{1,5,4,7,9,2,5,1,2,5,8,8,3,8,4,4,6,3});
        System.out.println(l1);
    }
}