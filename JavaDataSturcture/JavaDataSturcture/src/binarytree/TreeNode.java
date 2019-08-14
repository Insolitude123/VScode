package binarytree;

/**
 * TreeNode
 */
public class TreeNode {
    int val;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(){

    }

    public TreeNode(int val) {
        this.val = val;
    }

    public void arrayToTree(int[] arr, int i) {
        if (arr == null || arr.length == 0) {
            throw new RuntimeException();
        }
        val = arr[i];
        if (2 * i + 1 < arr.length) {
            leftNode = new TreeNode();
            leftNode.arrayToTree(arr, 2 * i + 1);
        }
        if (2 * i + 2 < arr.length) {
            rightNode = new TreeNode();
            rightNode.arrayToTree(arr, 2 * i + 2);
        }
    }

    public int[] treeToArray(TreeNode root) {
        if (root==null) {
            throw new RuntimeException();
        }
        int[] arr=new int[getTreeSize(root, 0)];
        getTreeToArrayValue(arr, root, 0);
        return arr;
    }

    public void getTreeToArrayValue(int[] arr,TreeNode root,int index) {
        if (arr==null||arr.length==0||root==null) {
            throw new RuntimeException();
        }
        arr[index]=root.val;
        if (root.leftNode!=null) {
            root.leftNode.getTreeToArrayValue(arr, root.leftNode,2*index+1);
        }
        if (root.rightNode!=null) {
            root.rightNode.getTreeToArrayValue(arr, root.rightNode,2*index+2);
        }
    }

    public int getTreeSize(TreeNode root,int size){
        if (root==null) {
            throw new RuntimeException();
        }
        if (root.leftNode!=null) {
            size=root.leftNode.getTreeSize(root.leftNode,size);
        }
        if (root.rightNode!=null) {
            size=root.rightNode.getTreeSize(root.rightNode,size);
        }        
        size++;
        return size;
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