import doublylinkedlist.DoublyLinkedList;
import graph.Graph;
import hashtable.HashTable;
import heap.Heap;
import linkedlist.LinkedList;
import tree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.rInsert(2);
        myBST.rInsert(1);
        myBST.rInsert(3);

        System.out.println(myBST.root.value);
        System.out.println(myBST.root.left.value+", "+myBST.root.right.value);
    }
}