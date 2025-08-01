
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

 
class CircularLinkedList {
    Node tail;

    public CircularLinkedList() {
        this.tail = null;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
    }

    public void deleteAtFront() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (tail.next == tail) {
            tail = null;
        } else {
            tail.next = tail.next.next;
        }
    }

    public void deleteAtEnd() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (tail.next == tail) {
            tail = null;
        } else {
            Node current = tail.next;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = tail.next;
            tail = current;
        }
    }

    public boolean search(int data) {
        if (isEmpty()) return false;

        Node current = tail.next;
        do {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        } while (current != tail.next);

        return false;
    }

    public int getSize() {
        if (isEmpty()) return 0;

        int count = 0;
        Node current = tail.next;
        do {
            count++;
            current = current.next;
        } while (current != tail.next);

        return count;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node current = tail.next;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != tail.next);
        System.out.println();
    }
}


public class CircularLinkedListAnyType {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtFront(5);
        list.display(); 

        list.deleteAtFront();
        list.display(); 

        list.deleteAtEnd();
        list.display(); 

        System.out.println( list.search(10)); 
        System.out.println(list.search(99)); 

        System.out.println("Size: " + list.getSize());
    }
}
