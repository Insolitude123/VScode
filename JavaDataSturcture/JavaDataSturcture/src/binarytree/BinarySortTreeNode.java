package binarytree;

/**
 * BinarySortTreeNode
 */
public class BinarySortTreeNode {
    int val;
    BinarySortTreeNode leftNode;
    BinarySortTreeNode rightNode;

    public BinarySortTreeNode() {

    }

    public BinarySortTreeNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val + "";
    }

    public BinarySortTreeNode search(int val) {
        if (val == this.val) {
            return this;
        } else if (val < this.val) {
            if (leftNode != null) {
                return leftNode.search(val);
            }
        } else {
            if (rightNode != null) {
                return rightNode.search(val);
            }
        }
        return null;
    }

    public void addNode(BinarySortTreeNode node) {
        if (node == null) {
            return;
        }
        if (node.val < val) {
            if (leftNode == null) {
                leftNode = node;
            } else {
                leftNode.addNode(node);
            }
        } else {
            if (rightNode == null) {
                rightNode = node;
            } else {
                rightNode.addNode(node);
            }
        }
    }

    public BinarySortTreeNode searchParent(int val) {
        if ((this.leftNode != null && this.leftNode.val == val)
                || (this.rightNode != null && this.rightNode.val == val)) {
            return this;
        } else if (val < this.val && this.leftNode != null) {
            return this.leftNode.searchParent(val);
        } else if (val > this.val && this.rightNode != null) {
            return this.rightNode.searchParent(val);
        }
        return null;
    }

    public void showLDR(BinarySortTreeNode node) {
        if (node == null) {
            return;
        }
        if (leftNode != null) {
            showLDR(node.leftNode);
        }
        System.out.print(node.val + " ");
        if (rightNode != null) {
            showLDR(node.rightNode);
        }
    }
}