package leetcode.linkedlist;

/**
 * Task203 删除链表中等于给定值 val 的所有节点。
 *
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-linked-list-elements
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 * 示例: 输入: 1->2->6->3->4->5->6, val = 6 输出: 1->2->3->4->5 Definition for
 * singly-linked list. public class ListNode {
 *  int val;
 *  ListNode next;
 *  ListNode(int x) { val = x; }
 * }
 */
public class Task203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode=new ListNode(-1);
        dummyNode.next=head;
        ListNode newNode=dummyNode;
        while (newNode.next!=null) {
            if (newNode.next.val==val) {
                newNode.next=newNode.next.next;
            }else{
                newNode=newNode.next;
            }    
        }
        return dummyNode.next;
    }
}