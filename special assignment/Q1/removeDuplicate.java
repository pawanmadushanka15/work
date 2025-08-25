class StackADT {
    int maxSize;
    int[] stackArray;
    int top;

    public StackADT(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1; // Initialize the top of the stack to -1 (empty)
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + data);
        } else {
            stackArray[++top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else { 
			return stackArray[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public boolean check(int value){
        for(int i=0;i<=top;i++){
            if(stackArray[i]==value){
                return true;
            }
        }
        return false;
    }
}

public class removeDuplicate {

    public static void remove(StackADT stack){
        StackADT temp=new StackADT(stack.maxSize);

        while(!stack.isEmpty()){
            int val=stack.pop();
            if(!temp.check(val)){
                temp.push(val);
            }
        }

        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        stack.display();
    }
    public static void main(String[] args) {
        StackADT stack1 = new StackADT(5);
        StackADT stack2 = new StackADT(5);

        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(5);
        stack1.push(5);
        stack1.push(7);

        stack1.display();
        remove(stack1);

        stack2.push(12);
        stack2.push(12);
        stack2.push(12);
        stack2.push(5);

        stack2.display();
        remove(stack2);

        
    }
}
