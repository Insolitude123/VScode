package hashcode;

/**
 * HashTable
 */
public class HashTable {

    private MyNode[] arr = new MyNode[10];

    public HashTable() {

    }

    public void add(int val) {
        MyNode node = new MyNode(val);
        if (arr[node.hashCode()] == null) {
            arr[node.hashCode()] = node;
        } else {
            arr[node.hashCode()].append(val);
        }
    }

    public void delete(int val) {
        MyNode node = new MyNode(val);
        if (arr[node.hashCode()] != null && arr[node.hashCode()].getNext() != null) {
            arr[node.hashCode()].deleteVal(val);
        } else if (arr[node.hashCode()] != null && arr[node.hashCode()].getVal() == val
                && arr[node.hashCode()].getNext() == null) {
            arr[node.hashCode()] = null;
        }
    }

    @Override
    public String toString() {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                s += "null";
            } else {
                s += arr[i].toString() + "";
            }
            if (i + 1 < arr.length) {
                s += ",";
            }
        }
        s += "]";
        return s;
    }

}