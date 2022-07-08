


import middleElementInLinkedList.LinkedList;

import javax.naming.LinkRef;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        middleElementInLinkedList.LinkedList.Node head = linkedList.getHead();
        linkedList.addNode(new LinkedList.Node("1"));
        linkedList.addNode(new LinkedList.Node("2"));
        linkedList.addNode(new LinkedList.Node("3"));
        linkedList.addNode(new LinkedList.Node("4"));

        LinkedList.Node current = head;
        int length = 0;
        LinkedList.Node middle = head;

        while (current.getNext() != null) {
            length++;
            if (length % 2 == 0) {
                middle = middle.getNext();
            }
            current = current.getNext();
        }
        if (length % 2 == 1) {
            middle = middle.getNext();
        }

        System.out.println("length of LinkedList: " + length);
        System.out.println("middle element of LinkedList : " + middle);
    }
}
