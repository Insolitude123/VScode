package binarytree;

/**
 * TreeNode
 */
public class TreeNode {
    int val;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(int val) {
        this.val = val;
    }

    public void showDLR() {
        System.out.print(val + " ");
        if (leftNode != null) {
            leftNode.showDLR();
        }
        if (rightNode != null) {
            rightNode.showDLR();
        }
    }

    public void showLDR() {
        if (leftNode != null) {
            leftNode.showLDR();
        }
        System.out.print(val + " ");
        if (rightNode != null) {
            rightNode.showLDR();
        }
    }

    public void showLRD() {
        if (leftNode != null) {
            leftNode.showLRD();
        }
        if (rightNode != null) {
            rightNode.showLRD();
        }
        System.out.print(val + " ");
    }

    @Override
    public String toString() {
        return this.val + "";
    }

    public TreeNode searchDLR(int i) {
        TreeNode target = null;
        if (this.val == i) {
            return this;
        } else {
            if (leftNode != null) {
                target = leftNode.searchDLR(i);
            }

            if (target != null) {
                return target;
            }

            if (rightNode != null) {
                target = rightNode.searchDLR(i);
            }
        }

        return target;
    }

    public TreeNode searchLDR(int i) {
        TreeNode target = null;

        if (leftNode != null) {
            target = leftNode.searchLDR(i);
        }

        if (target != null) {
            return target;
        }

        if (this.val == i) {
            return this;
        }

        if (rightNode != null) {
            target = rightNode.searchLDR(i);
        }

        return target;
    }

    public TreeNode searchLRD(int i) {
        TreeNode target = null;
        if (leftNode != null) {
            target = leftNode.searchLRD(i);
        }

        if (target != null) {
            return target;
        }

        if (rightNode != null) {
            target = rightNode.searchLRD(i);
        }

        if (target != null) {
            return target;
        }

        if (this.val == i) {
            return this;
        }

        return target;
    }

    public void delete(int val) {
        if (leftNode != null && leftNode.val == val) {
            leftNode = null;
            return;
        }
        if (rightNode != null && rightNode.val == val) {
            rightNode = null;
            return;
        }
        if (leftNode != null) {
            leftNode.delete(val);
        }
        if (rightNode != null) {
            rightNode.delete(val);
        }
    }
}