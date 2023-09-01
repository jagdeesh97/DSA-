import java.util.LinkedList;
import java.util.Queue;

public class Stack_Using_One_Queue {
    Queue<Integer> q=new LinkedList<>();
    public  void  push(int data)
    {
        q.add(data);
        int size=q.size()-1;
        while (size-->0)
         {
           q.add(q.remove());
         }
    }
    public  int pop()
    {
        if(q.isEmpty())
        {
            System.out.println("Empty Stack");
            return -1;
        }
        return  q.remove();
    }
    public  void print()
    {
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
    public static void main(String[] args) {
        Stack_Using_One_Queue stack=new Stack_Using_One_Queue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.print();

        System.out.println(stack.pop());
        stack.push(6);
        System.out.println(stack.pop());
    }
}
