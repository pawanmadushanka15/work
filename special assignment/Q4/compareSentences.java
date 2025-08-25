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

    public boolean compare(StackADT s2){
        Node current1=this.top;
        Node current2=s2.top;

        while(current1!=null && current2!=null){
            if(!current1.data.equalsIgnoreCase(current2.data)){
                return false;
            }
            current1=current1.next;
            current2=current2.next;
        }
        return current1 == null && current2 == null;

    }
}

public class compareSentences {
    public static void main(String[] args) {
        StackADT s1 = new StackADT();
        StackADT s2 = new StackADT();

        StackADT s3 = new StackADT();
        StackADT s4 = new StackADT();

        s1.push("beautiful");
        s1.push("is");
        s1.push("world");
        s1.push("The");
        s1.display();
        
        s2.push("beautiful");
        s2.push("is");
        s2.push("world");
        s2.push("the");
        s2.display();

        s3.push("I");
        s3.push("want");
        s3.push("this");
        s3.push("bag");
        s3.display();
        
        s4.push("He");
        s4.push("want");
        s4.push("this");
        s4.push("bag");
        s4.display();


        if(s1.compare(s2))
            System.out.println("sentences are equal");
        else
            System.out.println("sentences are not equal");
        
        if(s3.compare(s4))
            System.out.println("sentences are equal");
        else
            System.out.println("sentences are not equal");
    }
}
