public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList mal = new MyArrayList();
        mal.add(6);
        mal.add(4);
        mal.add(9);
        mal.show();
        mal.insert(2, 10);
        mal.insert(0, 3);
        mal.insert(4, 22);
        mal.getLength();
        mal.show();
        mal.delete(5);
        mal.delete(0);
        mal.show();
        mal.update(1, 7);
        System.out.println(mal.get(1));
    }

}