package leetcode.linkedlist;
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        ListNode currentNode=this;
        String s="[";
        while (currentNode.next!=null) {
            s=s+currentNode.val+",";
            currentNode=currentNode.next;
        }
        s=s+currentNode.val+"]";
        return s;
    }
}