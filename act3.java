class Node{
    String data;
    Node next;

    public Node(String data){
        this.data=data;
        this.next=null;
    }
}

class StackADT{
    Node top;

    public StackADT(){
        this.top=null;
    }

    public boolean isEmpty(){
        return top==null;
    }

    public void push(String data){
        Node newNode=new Node(data);
        if(isEmpty()){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
    }

    public String pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return null;
        }else{
            String data=top.data;
            top=top.next;
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

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            Node current=top;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println();
        }
    }

}

public class act3{
    public static void main(String[] args){
        StackADT s1=new StackADT();
        s1.push("java");
        s1.push("python");
        s1.push("C++");

        s1.display();
        System.out.println(s1.peek());
        s1.pop();
        s1.display();
    }
}