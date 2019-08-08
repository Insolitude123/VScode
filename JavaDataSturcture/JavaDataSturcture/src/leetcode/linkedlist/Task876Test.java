package leetcode.linkedlist;

import org.junit.Test;
import org.junit.Assert;

/**
 * Task21Test
 */
public class Task876Test {
    @Test
    public void Test876() {
        Task876 t876=new Task876();
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(5);
        l1.next.next.next.next.next=new ListNode(6);


        ListNode temp=t876.middleNode(l1);

        String expecteds="4";
        String actuals=temp.val+"";
        Assert.assertEquals("",expecteds, actuals);
    }
    
}