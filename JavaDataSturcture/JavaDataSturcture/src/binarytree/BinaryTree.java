package binarytree;

/**
 * BinaryTree
 */
public class BinaryTree {
    TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    // 前序遍历
    public void showDLR() {
        if (root == null) {
            System.out.print("null");
            return;
        }
        root.showDLR();
    }

    // 中序遍历
    public void showLDR() {
        if (root == null) {
            System.out.print("null");
            return;
        }
        root.showLDR();
    }

    // 后序遍历
    public void showLRD() {
        if (root == null) {
            System.out.print("null");
            return;
        }
        root.showLRD();
    }

    // 前序遍历查找
    public TreeNode searchDLR(int i) {
        if (root == null) {
            throw new RuntimeException();
        }
        TreeNode result = root.searchDLR(i);
        return result;
    }

    // 中序遍历查找
    public TreeNode searchLDR(int i) {
        if (root == null) {
            throw new RuntimeException();
        }
        TreeNode result = root.searchLDR(i);
        return result;
    }

    // 后续遍历查找
    public TreeNode searchLRD(int i) {
        if (root == null) {
            throw new RuntimeException();
        }
        TreeNode result = root.searchLRD(i);
        return result;
    }

    //删除
    public void deleteNode(int val) {
        if (root == null) {
            throw new RuntimeException();
        }
        if (root.val==val) {
            root=null;
        }else{
            root.delete(val);
        }
    }
}