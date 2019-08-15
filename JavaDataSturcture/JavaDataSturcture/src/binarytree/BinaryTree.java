package binarytree;

import java.util.Arrays;

/**
 * BinaryTree
 */
public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        
    }

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    @Override
    public String toString() {
        String s=null;
        if (root!=null) {
            s=root.val+" ";
        }
        if (root.leftNode!=null) {
            s=root.leftNode.nextNodeToString(root.leftNode,s);
        }
        if (root.rightNode!=null) {
            s=root.rightNode.nextNodeToString(root.rightNode,s);
        }
        return s;
    }

    //将数组转换成树
    public TreeNode arrayToTree(int[] arr){
        if (arr==null||arr.length==0) {
            throw new RuntimeException();
        }
        int[] newArr=Arrays.copyOf(arr, arr.length);
        root=new TreeNode();
        root.arrayToTree(newArr,0);
        return root;
    }

    //将树转换成数组
    public int[] treeToArray(TreeNode root) {
        if (root==null) {
            throw new RuntimeException();
        }
        int[] arr=null;
        arr = root.treeToArray(root);
        return arr;
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