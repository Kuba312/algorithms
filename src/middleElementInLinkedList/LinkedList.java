package middleElementInLinkedList;

import org.w3c.dom.Node;

public class LinkedList {
    private final Node head;
    private Node tail;

    public LinkedList() {
        this.head = new Node("head");
        tail = head;
    }

    public Node getHead() {
        return head;
    }

    public void addNode(Node node) {
        tail.next = node;
        tail = node;
    }

    public static class Node {
        private Node next;
        private String data;

        public Node(String data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return this.data;
        }
    }
}
