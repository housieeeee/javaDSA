package hashtable;

public class Main {
    public static void main(String[] args) {

        HashTable myhashTable = new HashTable();

        myhashTable.set("nails", 100);
        myhashTable.set("tile", 50);
        myhashTable.set("lumber", 80);
        myhashTable.set("bolts", 200);
        myhashTable.set("screws", 140);

        myhashTable.printTable();
    }
}
