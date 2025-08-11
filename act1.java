class StackADT{
    int maxSize;
    int[] stackArray;
    int top;

    public StackADT(int maxSize){
        this.maxSize=maxSize;
        this.stackArray=new int[maxSize];
        this.top=-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==maxSize-1;
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            stackArray[++top]=data;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int data= stackArray[top];
            top--;
            return data;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int data= stackArray[top];
            return data;
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            for (int i=top;i>=0;i--){
                System.out.print(stackArray[i]+" ");
            }
            System.out.println();
        }
    }

}

public class act1{
    public static void main(String[] args){
        StackADT s1=new StackADT(5);
        s1.push(1);
        s1.push(12);
        s1.push(19);

        s1.display();
        System.out.println("peek: "+s1.peek());

        s1.pop();
        s1.display();

    }
}