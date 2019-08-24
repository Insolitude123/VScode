package leetcode.linkedlist;

import org.junit.Test;
import org.junit.Assert;

/**
 * Task206Test
 */
public class Task206Test {
    @Test
    public void Test206() {
        Task206 t206=new Task206();
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(5);
        l1.next.next.next.next.next=new ListNode(6);


        ListNode temp=t206.reverseList(l1);

        String expecteds="[6,5,4,3,2,1]";
        String actuals=temp.toString();
        Assert.assertEquals(expecteds, actuals);
    }
    
}