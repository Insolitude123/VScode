package leetcode.linkedlist;

import org.junit.Test;
import org.junit.Assert;

/**
 * Task21Test
 */
public class Task237Test {
    @Test
    public void Test237() {
        Task237 t237=new Task237();
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(4);
        l1.next.next.next.next.next=new ListNode(5);


        t237.deleteNode(l1);

        String expecteds="[2,4,4,4,5]";
        String actuals=l1.toString();
        Assert.assertEquals("",expecteds, actuals);
    }
    
}