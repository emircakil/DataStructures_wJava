package hashtable;

public class Main {

    public static void main(String[] args) {

        HashTable hTable = new HashTable(5);

        hTable.add(0, "Emirhan");
        hTable.add(10, "Seyma");

        hTable.add(22, "Ensar");
        hTable.add(23, "Busra");

        hTable.add(14, "Berat");
        hTable.add(13, "Fatih");

        hTable.add(21, "Emre");
        hTable.add(11, "Drogba");

        hTable.printTable();

        hTable.delete(14);
        hTable.delete(13);
        hTable.delete(0);
        hTable.delete(99);

        hTable.printTable();

        hTable.add(0, "Emirhan");
        hTable.add(14, "Berat");

        hTable.printTable();

    }

}
