class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListADT {
    Node head;

    public LinkedListADT() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        if (isEmpty()) return 0;
        int count = 1;
        Node current = head.next;
        while (current != head) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Insert at front (head)
    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            head.next = head;  // points to itself
        } else {
            Node tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            newNode.next = head;
            tail.next = newNode;
            head = newNode; // new node is new head
        }
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            head.next = head;
        } else {
            Node tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            tail.next = newNode;
            newNode.next = head;
        }
    }

    // Insert at index (1-based)
    public void insertAtIndex(int data, int index) {
        int size = getSize();
        if (index < 1 || index > size + 1) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 1) {
            insertAtFront(data);
            return;
        }
        if (index == size + 1) {
            insertAtEnd(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 1; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete at front
    public void deleteAtFront() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
            return;
        }
        if (head.next == head) {
            head = null; // only one node
        } else {
            Node tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            head = head.next;
            tail.next = head;
        }
    }

    // Delete at end
    public void deleteAtEnd() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
            return;
        }
        if (head.next == head) {
            head = null; // only one node
        } else {
            Node current = head;
            Node prev = null;
            while (current.next != head) {
                prev = current;
                current = current.next;
            }
            prev.next = head;
        }
    }

    // Delete at index (1-based)
    public void deleteAtIndex(int index) {
        int size = getSize();
        if (index < 1 || index > size) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 1) {
            deleteAtFront();
            return;
        }
        if (index == size) {
            deleteAtEnd();
            return;
        }
        Node current = head;
        for (int i = 1; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    public boolean search(int data) {
        if (isEmpty()) return false;
        Node current = head;
        do {
            if (current.data == data) return true;
            current = current.next;
        } while (current != head);
        return false;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class nn {
    public static void main(String[] args) {
        LinkedListADT linkedList = new LinkedListADT();

        linkedList.insertAtFront(3);
        linkedList.insertAtFront(2);
        linkedList.insertAtFront(1);

        linkedList.display();  // 1 2 3

        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(5);

        linkedList.display();  // 1 2 3 4 5

        linkedList.insertAtIndex(10, 2);

        linkedList.display();  // 1 10 2 3 4 5

        linkedList.deleteAtFront();
        linkedList.deleteAtEnd();

        linkedList.display();  // 10 2 3 4

        linkedList.deleteAtIndex(2);

        linkedList.display();  // 10 3 4
    }
}
