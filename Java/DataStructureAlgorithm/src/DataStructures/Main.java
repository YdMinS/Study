import doublylinkedlist.DoublyLinkedList;
import hashtable.HashTable;
import linkedlist.LinkedList;
import tree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        HashTable myHT = new HashTable();

        myHT.set("nails", 100);
        myHT.set("tile", 50);
        myHT.set("lumber", 80);
        myHT.set("paint", 20);
        myHT.set("bolts", 10);
        myHT.printTable();

        System.out.println(myHT.keys());
    }
}