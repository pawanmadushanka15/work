class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedListADT<T> {
	Node<T> head;

	public LinkedListADT() {
		this.head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}

	public void insertAtFront(T data) {
		Node<T> newNode = new Node<>(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void insertAtEnd(T data) {
		Node<T> newNode = new Node<>(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			Node<T> current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public void insertAtIndex(T data, int index) {
		if (index < 1 || index > getSize()+1) {
			System.out.println("Invalid index");
			return;
		}
		if (index == 1) {
			insertAtFront(data);
			return;
		}
		Node<T> newNode = new Node<>(data);
		Node<T> current = head;
		for (int c = 1; c < index - 1; c++){
			current = current.next;				
		}
		newNode.next = current.next;
		current.next = newNode;
	}

	public void deleteAtFront() {
		if (isEmpty()) {
			System.out.println("Linked list is empty");
		} else {
			head = head.next;
		}
	}

	public void deleteAtEnd() {
		if (isEmpty()) {
			System.out.println("Linked list is empty");
		} else if (head.next == null) {
			head = null;
		} else {
			Node<T> current = head;
			Node<T> previous = null;
			while (current.next != null) {
				previous = current;
				current = current.next;
			}
			previous.next = null;
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
		Node<T> current = head;
		for (int c = 1; c < index - 1; c++){
			current = current.next;				
		}
		current.next = current.next.next;
	}

	public boolean search(T data) {
		Node<T> current = head;
		while (current != null) {
			if (current.data == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public int getSize() {
		int count = 0;
		Node<T> current = head;
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
			Node<T> current = head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}
	}
}

public class SinglyLinkedList {
	public static void main(String[] args) {
		LinkedListADT<Integer> linkedList = new LinkedListADT<>();

		linkedList.insertAtFront(3);
		linkedList.insertAtFront(2);
		linkedList.insertAtFront(1);

		linkedList.display(); // Output: 1 2 3

		LinkedListADT<String> stringList=new LinkedListADT<>();
		stringList.insertAtFront("world");
		stringList.insertAtFront("Hello");
		stringList.display();

		LinkedListADT<Object> anyList=new LinkedListADT<>();
		anyList.insertAtFront("N");
		anyList.insertAtFront("R");
		anyList.insertAtFront(10);
		anyList.insertAtFront("Hello");
		anyList.display();

	}
}
