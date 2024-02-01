import doublylinkedlist.DoublyLinkedList;
import graph.Graph;
import hashtable.HashTable;
import heap.Heap;
import linkedlist.LinkedList;
import tree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(1);
        myBST.insert(2);
        myBST.insert(3);
        myBST.insert(4);
        myBST.insert(5);
        myBST.insert(6);

        System.out.println(myBST.DFSPostOrder());
    }
}