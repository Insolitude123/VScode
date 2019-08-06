package leetcode.linkedlist;

import org.junit.Test;
import org.junit.Assert;

/**
 * Task21Test
 */
public class Task21Test {
    @Test
    public void Test21() {
        Task21 t21=new Task21();
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(5);

        ListNode l2=new ListNode(1);
        l2.next=new ListNode(2);
        l2.next.next=new ListNode(3);
        l2.next.next.next=new ListNode(4);
        l2.next.next.next.next=new ListNode(6);
        ListNode temp=t21.mergeTwoLists1(l1, l2);

        String expecteds="[1,1,2,2,3,4,4,4,5,6]";
        String actuals=temp.toString();
        Assert.assertEquals("",expecteds, actuals);
    }
    
}