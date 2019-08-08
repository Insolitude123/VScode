package leetcode.linkedlist;

import org.junit.Test;
import org.junit.Assert;

/**
 * Task160Test
 */
public class Task160Test {
    @Test
    public void Test160() {
        Task160 t160=new Task160();
        ListNode l1=new ListNode(0);
        l1.next=new ListNode(13);
        l1.next.next=new ListNode(4);
        l1.next.next.next=new ListNode(9);
        l1.next.next.next.next=new ListNode(8);
        l1.next.next.next.next.next=new ListNode(5);

        ListNode l2=new ListNode(1);
        l2.next=new ListNode(2);
        l2.next.next=new ListNode(3);
        l2.next.next.next=new ListNode(8);
        l2.next.next.next.next=new ListNode(5);
        ListNode temp=t160.getIntersectionNode(l1, l2);

        String expecteds="[8,5]";
        String actuals=temp.toString();
        Assert.assertEquals("",expecteds, actuals);
    }
    
}