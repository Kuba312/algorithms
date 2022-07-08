package repetition.middleElementInLinkedListLearn;


public class LinkedList {
    private Node tail;
    private Node head;

    public LinkedList() {
        this.head = new Node("head");
        tail = head;

    }

    public void addNode(Node node) {
        tail.next = node;
        tail = node;
    }

    public Node getHead() {
        return head;
    }

    public static class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data='" + data + '\'' +
                    ", next=" + next +
                    '}';
        }
    }
}
