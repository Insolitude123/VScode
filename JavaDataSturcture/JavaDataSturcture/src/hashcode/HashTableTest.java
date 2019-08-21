package hashcode;

/**
 * HashTableTest
 */
public class HashTableTest {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        System.out.println(hashTable);
        for (int i = 0; i < 20; i++) {
            hashTable.add(i);
        }
        System.out.println(hashTable);
        for (int i = 0; i < 20; i++) {
            hashTable.delete(i);
        }
        System.out.println(hashTable);
        
    }

}