package leetcode.linkedlist;

import org.junit.Test;
import org.junit.Assert;

/**
 * Task21Test
 */
public class Task203Test {
    @Test
    public void Test203() {
        Task203 t203=new Task203();
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(4);
        l1.next.next.next.next.next=new ListNode(5);


        ListNode temp=t203.removeElements(l1, 4);

        String expecteds="[1,2,5]";
        String actuals=temp.toString();
        Assert.assertEquals("",expecteds, actuals);
    }
    
}