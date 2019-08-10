package leetcode.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * //import static org.junit.Assert.assertTrue; Task141Test
 */
public class Task141Test {
    @Test
    public void Test141() {
        Task141 t141 = new Task141();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        ListNode l3 = new ListNode(3);
        l2.next = l3;
        ListNode l4 = new ListNode(4);
        l3.next = l4;
        ListNode l5 = new ListNode(5);
        l4.next = l5;
        l5.next = l3;

        // boolean b = t141.hasCycle(l1);

        int expected = 3;
        int actual = t141.whereHaveCycle(l1);

        // assertTrue(b);
        assertEquals(expected, actual);
    }

}