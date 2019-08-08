package leetcode.linkedlist;

/**
 * Task83 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。

示例 1:
输入: 1->1->2
输出: 1->2

示例 2:
输入: 1->1->2->3->3
输出: 1->2->3

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 
 * Definition for singly-linked list. 
 * public class ListNode {
 *  int val;
 *  ListNode next;
 *  ListNode(int x) { val = x; }
 * }
 */
public class Task83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode=head;
        while (currentNode!=null&&currentNode.next!=null) {
            if (currentNode.val==currentNode.next.val) {
                currentNode.next=currentNode.next.next;
            }else{
                currentNode=currentNode.next;
            }
        }
        return head;
    }
}
