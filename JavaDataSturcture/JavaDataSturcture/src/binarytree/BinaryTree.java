package binarytree;

/**
 * BinaryTree
 */
public class BinaryTree {
    TreeNode root ;

    public BinaryTree(TreeNode root){
        this.root=root;
    }

    public void showDLR(){
        if (this==null||this.root==null) {
            throw new RuntimeException();
        }
        root.showDLR();
    }

    public void showLDR(){
        if (this==null||this.root==null) {
            throw new RuntimeException();
        }
        root.showLDR();
    }
    
    public void showLRD(){
        if (this==null||this.root==null) {
            throw new RuntimeException();
        }
        root.showLRD();
    }
}