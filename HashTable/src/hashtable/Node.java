package hashtable;

public class Node {

    int key;
    String name;
    Node next;

    public Node() {

        next = null;
    }

    public Node(int key, String name) {

        this.key = key;
        this.name = name;
        next = null;
    }

}
