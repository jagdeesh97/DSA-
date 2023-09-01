import java.util.LinkedList;
import java.util.Queue;

public class Stack_using_2_Queue {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    public  void  push(int data)
    {
      q2.add(data);
      while (!q1.isEmpty())
      {
          q2.add(q1.remove());
      }
      Queue<Integer> temp=q1;
      q1 = q2;
      q2 = temp;
    }
    public  int pop()
    {
        if(q1.isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
     return q1.remove();
    }

    public static void main(String[] args) {
     Stack_using_2_Queue stack=new Stack_using_2_Queue();
     stack.push(1);
     stack.push(2);
     stack.push(3);
     stack.push(4);
     stack.push(5);

     System.out.println(stack.pop());
    }
}
