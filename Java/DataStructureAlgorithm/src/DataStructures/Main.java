import doublylinkedlist.DoublyLinkedList;
import linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(0);
        myDLL.append(11);
        myDLL.printList();
        System.out.println(myDLL.get(1).value);
    }
}