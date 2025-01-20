public class SinglyLinkedList<T> {
    private Node<T> head;

    // Constructor to initialize the linked list
    public SinglyLinkedList() {
        this.head = null;
    }

    // Method to add a new node at the end of the list
    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the elements of the list
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

class Node<T> {
    T value;
    Node<T> next;

    Node(T value) {
        this.value = value;
        this.next = null;
    }
}
