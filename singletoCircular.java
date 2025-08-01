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

	public void insertAtFront(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			head.next=newNode;
		} else {
			Node current=head;
			while(current.next!=head)
			{
				current=current.next;
			}
			newNode.next=head;
			current.next=newNode;
			head=newNode;
		}
	}

	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			head.next=newNode;
		} else {
			Node current = head;
			while (current.next != head) {
				current = current.next;
			}
			current.next=newNode;
			newNode.next=head;
		}
	}

	public void insertAtIndex(int data, int index) {
		if (index < 1 || index > getSize()+1) {
			System.out.println("Invalid index");
			return;
		}
		if (index == 1) {
			insertAtFront(data);
			return;
		}
		if (index==getSize()+1){
			insertAtEnd(data);
			return;
		}
		Node newNode = new Node(data);
		Node current = head;
		for (int c = 1; c < index - 1; c++){
			current = current.next;				
		}
		newNode.next = current.next;
		current.next = newNode;
	}

	public void deleteAtFront() {
		if (isEmpty()) {
			System.out.println("Linked list is empty");
			return;
		}
		if (head.next == head) {
            head = null; 
        }
	    else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            head = head.next;
            current.next = head;
        }
	}

	public void deleteAtEnd() {
		if (isEmpty()) {
			System.out.println("Linked list is empty");
			return;
		} else if (head.next == head) {
			head = null;
		} else {
			Node current = head;
			Node previous = null;
			while (current.next != head) {
				previous = current;
				current = current.next;
			}
			previous.next = head;
		}
	}

	public void deleteAtIndex(int index) {
		if (index < 1 || index > getSize()) {
			System.out.println("Invalid index");
			return;
		}
		if (index == 1) {
			deleteAtFront();
			return;
		}
		if (index == getSize()) {
			deleteAtEnd();
			return;
		}
		Node current = head;
		for (int c = 1; c < index - 1; c++){
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

	public int getSize() {
		int count = 0;
		Node current = head;
		while (current != head) {
			count++;
			current = current.next;
		}
		return count;
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
	
	
	


public class singleToCircular {
	public static void main(String[] args) {
		LinkedListADT linkedList = new LinkedListADT();

		linkedList.insertAtFront(3);
		linkedList.insertAtFront(2);
		linkedList.insertAtFront(1);

		linkedList.display(); 
		linkedList.insertAtEnd(4);
		linkedList.insertAtEnd(5);

		linkedList.display(); 

		linkedList.insertAtIndex(10, 2);

		linkedList.display();

		linkedList.deleteAtFront();
		linkedList.deleteAtEnd();

		linkedList.display(); 
		
		linkedList.deleteAtIndex(2);

		linkedList.display(); 
		
		
	}
}
