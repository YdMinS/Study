import doublylinkedlist.DoublyLinkedList;
import graph.Graph;
import hashtable.HashTable;
import heap.Heap;
import linkedlist.LinkedList;
import tree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        Heap myHeap = new Heap();
        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);

        System.out.println(myHeap.getHeap());

        myHeap.insert(100);
        System.out.println(myHeap.getHeap());
    }
}