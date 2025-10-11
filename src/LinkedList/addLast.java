package LinkedList;

public class addLast {

    // Node class
    public  class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and Tail
    public static Node head;
    public static Node tail;

    // Add element at last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print list (for testing)
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method for testing
    public static void main(String[] args) {
        addLast list = new addLast();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.printList(); // Output: 10 -> 20 -> 30 -> null
    }
}
