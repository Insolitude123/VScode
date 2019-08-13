package binarytree;

/**
 * ArrayBinaryTree
 */
public class ArrayBinaryTree {

    int[] elements;

    public ArrayBinaryTree(int[] elements){
        this.elements=elements;
    }

    public void showDLR() {
        showDLR(0);
    }

    //前序遍历
    public void showDLR(int index) {
        if (elements==null||index<0||index>=elements.length) {
            throw new RuntimeException();
        }
        if (elements.length==0){
            System.out.println("[]");
            return;
        }
        System.out.print(elements[index]+" ");
        if (2*index+1<elements.length) {
            showDLR(2*index+1);
        }
        if (2*index+2<elements.length) {
            showDLR(2*index+2);
        }
    }

    public void showLDR() {
        showLDR(0);
    }

    //中序遍历
    public void showLDR(int index) {
        if (elements==null||index<0||index>=elements.length) {
            throw new RuntimeException();
        }
        if (elements.length==0){
            System.out.println("[]");
            return;
        }
        if (2*index+1<elements.length) {
            showLDR(2*index+1);
        }
        System.out.print(elements[index]+" ");
        if (2*index+2<elements.length) {
            showLDR(2*index+2);
        }
    }

    public void showLRD() {
        showLRD(0);
    }

    //后序遍历
    public void showLRD(int index) {
        if (elements==null||index<0||index>=elements.length) {
            throw new RuntimeException();
        }
        if (elements.length==0){
            System.out.println("[]");
            return;
        }
        if (2*index+1<elements.length) {
            showLRD(2*index+1);
        }
        if (2*index+2<elements.length) {
            showLRD(2*index+2);
        }
        System.out.print(elements[index]+" ");
    }
}