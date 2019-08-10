package binarytree;

/**
 * TreeNode
 */
public class TreeNode {
    int val;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(int val){
        this.val=val;
    }
    
    public void showDLR() {
        System.out.print(val+" ");
        if (leftNode!=null) {
            leftNode.showDLR();
        }
        if (rightNode!=null) {
            rightNode.showDLR();
        }
    }

    public void showLDR() {
        if (leftNode!=null) {
            leftNode.showLDR();
        }
        System.out.print(val+" ");
        if (rightNode!=null) {
            rightNode.showLDR();
        }
    }

    public void showLRD() {
        if (leftNode!=null) {
            leftNode.showLRD();
        }
        if (rightNode!=null) {
            rightNode.showLRD();
        }
        System.out.print(val+" ");
    }
}