class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedListADT {
    Node head;

    public DoublyLinkedListADT() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

   public void insert(int data)
   {
	   Node newNode = new Node(data);
       if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
   }
    public int getSize() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}

public class DoublyLinkedListReverse {
    public static void main(String[] args) {
        DoublyLinkedListADT linkedList = new DoublyLinkedListADT();

        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);

        linkedList.display();

        
    }
}
