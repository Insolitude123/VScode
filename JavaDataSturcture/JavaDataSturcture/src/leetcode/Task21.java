package leetcode;

/**
 * Task21
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

示例：
输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Task21 {
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }else if(l2==null){
            return l1;
        }else if(l1.val<l2.val){
            l1.next=mergeTwoLists1(l1.next,l2);
            return l1;
        }else{
            l2.next=mergeTwoLists1(l1,l2.next);
            return l2;
        }
    }
    
}