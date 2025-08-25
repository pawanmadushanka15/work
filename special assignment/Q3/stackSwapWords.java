class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class StackADT {
    Node top;

    public StackADT() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(String data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            String data = top.data;
            top = top.next;
            return data;
        }
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return top.data;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

     public void swapWords(String word1,String word2){
        if (word1.equals(word2))
            return;
            
        Node node1=null;
        Node node2=null;
        Node current=top;

        while(current!=null){
            if (current.data.equals(word1))
                node1=current;
            if (current.data.equals(word2))
                node2=current;
            current=current.next;

        }
        
        if(node1 != null && node2 !=null){
           String temp=node1.data;
           node1.data=node2.data;
           node2.data=temp;
        }
        display();

    }
}

public class stackSwapWords{
    public static void main(String[] args) {
        StackADT stack1 = new StackADT();
        StackADT stack2 = new StackADT();

        stack1.push("yesterday");
        stack1.push("school");
        stack1.push("went");
        stack1.push("I");

        System.out.print("Stack elements:");
        stack1.display(); 
        stack1.swapWords("I","school");

        stack2.push("Kamal");
        stack2.push("am");
        stack2.push("I");


        System.out.print("Stack elements:");
        stack2.display(); 
        stack2.swapWords("am","I");

       
    }
}
