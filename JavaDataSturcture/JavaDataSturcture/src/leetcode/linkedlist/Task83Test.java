package leetcode.linkedlist;

import org.junit.Test;
import org.junit.Assert;

/**
 * Task83Test
 */
public class Task83Test {
    @Test
    public void Test21() {
        Task83 t83=new Task83();
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(5);
        l1.next.next.next.next.next=new ListNode(5);

        ListNode temp=t83.deleteDuplicates(l1);

        String expecteds="[1,2,4,5]";
        String actuals=temp.toString();
        Assert.assertEquals("",expecteds, actuals);
    }
    
}