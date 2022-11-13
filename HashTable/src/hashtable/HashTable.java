package hashtable;

public class HashTable {

    Node array[];

    int size;

    public HashTable(int size) {

        this.size = size;
        array = new Node[size];

        for (int i = 0; i < array.length; i++) {

            array[i] = new Node();
        }
    }

    int findIndex(int key) {

        return key % size;
    }

    void add(int key, String name) {

        int index = findIndex(key);

        Node node = new Node(key, name);

        Node temporary = array[index];

        while (temporary.next != null) {

            temporary = temporary.next;
        }
        temporary.next = node;
        System.out.println(node.name + " succesfully added to Hash Table!");
    }

    void delete(int key) {

        int index = findIndex(key);

        Node temporary = array[index];
        Node temporary2 = array[index];

        if (temporary.next == null) {

            System.out.println(key + " key is not found!");
        }

        while (temporary.next != null) {
            temporary2 = temporary;
            temporary = temporary.next;

            if (temporary.key == key) {
                System.out.println(temporary.name + " is deleted from the Hash Table!");
                temporary2.next = temporary.next;
            }
        }
    }

    void printTable() {

        Node temporary;
        for (int i = 0; i < size; i++) {

            System.out.println("");
            temporary = array[i];

            System.out.print("Index of " + i + ".");
            while (temporary.next != null) {
                temporary = temporary.next;
                System.out.print(" -> " + temporary.key + " " + temporary.name);
            }
        }
        System.out.println(" \n");
    }
}
