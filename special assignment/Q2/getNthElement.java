class StackADT {
    int maxSize;
    int[] stackArray;
    int top;

    public StackADT(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
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

    public int getElement(int n){
        if(n<=0 || n>top+1){
            return -1;
        }
        return stackArray[n-1];
    }
}

public class getNthElement {
    public static void main(String[] args) {
        StackADT stack = new StackADT(5);

        stack.push(1);
        stack.push(2);
        stack.push(12);
        stack.push(26);
        stack.push(5);

        stack.display();
        System.out.println("element is "+stack.getElement(3));
        System.out.println("element is "+stack.getElement(12));
        System.out.println("element is "+stack.getElement(1));


        
    }
}
