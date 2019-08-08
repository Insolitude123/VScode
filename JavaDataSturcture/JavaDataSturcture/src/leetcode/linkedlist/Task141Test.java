package leetcode.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Task141Test
 */
public class Task141Test {
    @Test
    public void Test141() {
        Task141 t141=new Task141();
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);
        l1.next.next.next=new ListNode(6);
        l1.next.next.next.next=new ListNode(8);
        l1.next.next.next.next.next=l1.next;

        boolean b = t141.hasCycle(l1);

        assertTrue(b);
    }
    
}