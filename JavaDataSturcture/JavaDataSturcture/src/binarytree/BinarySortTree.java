package binarytree;

/**
 * BinarySortTree
 */
public class BinarySortTree {
    BinarySortTreeNode node;

    public BinarySortTree() {

    }

    public BinarySortTree(BinarySortTreeNode node) {
        this.node = node;
    }

    public void addNode(BinarySortTreeNode rootNode) {
        if (rootNode == null) {
            throw new RuntimeException();
        }
        if (node == null) {
            node = rootNode;
        } else {
            node.addNode(rootNode);
        }
    }

    public void insert(int val) {
        if (node == null) {
            return;
        } else {
            BinarySortTreeNode newNode = null;
            BinarySortTreeNode temp = node;

            while ((temp.leftNode != null && val <= temp.val)
                    || (temp.rightNode != null && val > temp.val)) {
                while (val <= temp.val && temp.leftNode != null) {
                    temp = temp.leftNode;
                }
                while (val > temp.val && temp.rightNode != null) {
                    temp = temp.rightNode;
                }
            }
            if (val <= temp.val) {
                newNode = temp.leftNode;
                temp.leftNode = new BinarySortTreeNode(val);
                temp.leftNode.leftNode = newNode;
            } else {
                newNode = temp.rightNode;
                temp.rightNode = new BinarySortTreeNode(val);
                temp.rightNode.rightNode = newNode;
            }

        }

    }

    public void deleteNode(int val) {
        if (node == null) {
            return;
        } else {
            // 找到目标节点
            BinarySortTreeNode target = search(val);
            if (target == null) {
                return;
            }
            // 找到父节点
            BinarySortTreeNode parent = searchParent(val);
            if (parent == null) {
                deleteRootNode();
            } else if (target.leftNode != null && target.rightNode != null) {
                deleteHaveRightAndLeftNode(target);
            } else if (target.leftNode != null && target.rightNode == null) {
                deleteHaveLeftNode(target, parent);
            } else if (target.leftNode == null && target.rightNode != null) {
                deleteHaveRightNode(target, parent);
            } else if (target.leftNode == null && target.rightNode == null) {
                deleteNotHaveNode(target, parent);
            }
        }

    }

    private int deleteRightTreeMin(BinarySortTreeNode rightNode) {
        if (rightNode.leftNode != null) {
            rightNode = rightNode.leftNode;
        }
        deleteNode(rightNode.val);
        return rightNode.val;
    }

    public BinarySortTreeNode searchParent(int val) {
        if (node == null) {
            return null;
        } else {
            return node.searchParent(val);
        }
    }

    public void deleteHaveRightAndLeftNode(BinarySortTreeNode target) {
        if (target.leftNode != null && target.rightNode != null) {
            // 要删除的节点含有左右节点
            int deleteVal = deleteRightTreeMin(target.rightNode);
            target.val = deleteVal;
        }
    }

    public void deleteHaveLeftNode(BinarySortTreeNode target, BinarySortTreeNode parent) {
        if (target.leftNode != null && target.rightNode == null) {
            // 要删除的节点含有左节点
            if (parent.leftNode.val == target.val) {
                parent.leftNode = target.leftNode;
            }
            if (parent.rightNode.val == target.val) {
                parent.rightNode = target.leftNode;
            }
        }
    }

    public void deleteHaveRightNode(BinarySortTreeNode target, BinarySortTreeNode parent) {
        if (target.leftNode == null && target.rightNode != null) {
            // 要删除的节点含有右节点
            if (parent.leftNode.val == target.val) {
                parent.leftNode = target.rightNode;
            }
            if (parent.rightNode.val == target.val) {
                parent.rightNode = target.rightNode;
            }
        }
    }

    public void deleteNotHaveNode(BinarySortTreeNode target, BinarySortTreeNode parent) {
        if (target.leftNode == null && target.rightNode == null) {
            // 要删除的节点是叶子节点
            if (parent.leftNode.val == target.val) {
                parent.leftNode = null;
            }
            if (parent.rightNode.val == target.val) {
                parent.rightNode = null;
            }
        }
    }

    public void deleteRootNode() {
        if (node.leftNode == null && node.rightNode == null) {
            node = null;
        } else if (node.leftNode != null && node.rightNode != null) {
            node.val = deleteRightTreeMin(node.rightNode);
        } else {
            if (node.leftNode != null) {
                node = node.leftNode;
            } else {
                node = node.rightNode;
            }
        }
    }

    // 按从小到大的顺序
    public void showLDR(BinarySortTreeNode node) {
        if (node != null) {
            node.showLDR(node);
        }
    }

    public BinarySortTreeNode search(int val) {
        if (node == null) {
            return null;
        } else {
            return node.search(val);
        }
    }
}