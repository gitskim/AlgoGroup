/**
 * Created by kimsuh on 4/24/16.
 */
public class LinkedList {

    public static class Node {
        public Node next;
        public int data;

        public Node(Node next, int data) {
            this.next = next;
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }

    //TODO: utilize tail
    public Node head, tail;

    private int size = 0;

    public LinkedList(int data) {
        head = new Node(null, data);
        //TODO: size++ may cause an issue since it's set in two different places.
        size++;
    }

    public void addToHead(int data) {
        Node whatItPointsToCurrently = head;
        head = new Node(whatItPointsToCurrently, data);
        size++;
    }

    public void addToTail(int data) {
        Node whatItPointsToCurrently = head;
        head = new Node(null, data);
    }

    public void removeFromHead() {
        if (size == 0) {
            return;
        }

        head = head.next;
    }

    public void removeFromTail() {
        //needs work
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isNodeEmpty(Node current) {
        if (current == null) {
            System.out.println("null");
            return true;
        } else {
            return false;
        }
    }

    public Node getHead() {
        return head;
    }

    public int getDataFromHead() {
        return head.getData();
    }

    public Node getNextToHead() {
        return head.next;
    }

    public void setHead(Node node) {
        head = node;
    }

    public void printList() {
        Node current = head;
        while (!isNodeEmpty(current)) {
            System.out.println("printed list is: " + current.getData());
            current = current.next;
        }

    }

    public int searchDataWithIndex(int index) {
        Node current = head;
        if (index > (size - 1)) {
            throw new IllegalArgumentException("index does not exist. ");
        }
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.getData();
    }

    public LinkedList reverseList() {
        Node current = head;

        //TODO: room for improvement. how to incorporate this process in the loop
        LinkedList newList = new LinkedList(getDataFromHead());
        current = current.next;
        System.out.println("reverse list is: " + current.getData());

        while (current != null) {
            System.out.println("reverse list is: " + current.getData());
            newList.addToHead(current.getData());
            current = current.next;
        }

        return newList;
    }
}
