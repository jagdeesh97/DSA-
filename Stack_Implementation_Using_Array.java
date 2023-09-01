public class Stack_Implementation_Using_Array {
    int arr[];  // array
    int top;  // Index of last Element
    int capacity;  //Size of the array

    Stack_Implementation_Using_Array (int size) {   // constructor
        arr = new int[size];
        capacity = size;
        top = -1;  // Stack is empty at beginning
    }
    public void push(int data)     //Pushing/Adding data into stack
    {
        if(top == capacity-1)    // if Stack is full
        {
            System.out.println("Stack Overflow:");
            return;
        }
        System.out.println("Pushing the data into the stack");
        top++;
        arr[top]=data;
    }

    public  int pop()
    {
        if(top == -1)     // If Stack is empty
        {
            System.out.println("Stack UnderFlow");
            return -1;
        }
        System.out.println("Removing the data from the stack");
        int topElement=arr[top];
        top--;
        return  topElement;
    }

    public int size()
    {
        return  top+1;
    }

    public  int peek()
    {
        if(top == -1)     // If Stack is empty
        {
            System.out.println("Stack UnderFlow Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public void print()
    {
        System.out.println("Printing Stack element");
        for(int i=top; i>=0; i--)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
    Stack_Implementation_Using_Array stack= new Stack_Implementation_Using_Array(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
       // System.out.println(stack.peek());
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


        System.out.println(stack.size());

        System.out.println(stack.peek());

        stack.print();
    }
}
