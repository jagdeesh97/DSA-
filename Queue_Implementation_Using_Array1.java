import java.util.*;
public class Queue_Implementation_Using_Array1 {
  int queue[];
  int front;
  int rear;
  int capacity;
    Queue_Implementation_Using_Array1(int size){
        queue =new int[size];
        capacity=size;
        front=0;
        rear=0;

    }

    public void enqueue(int data)   // enqueue in constant time
    {
        if(rear==capacity)
        {
            System.out.println("Queue full");
            return;
        }
        queue[rear]=data;
        rear++;
    }

    public int dequeue()    // dequeue in linear time
    {
        if (front==rear)
        {
            System.out.println("Empty queue");

            return -1;
        }
        int dequeueEle=queue[front];
        for (int i=0; i<rear-1; i++)
        {
            queue[i]=queue[i+1];
        }
        rear --;
        return  dequeueEle;
    }

    public  void  print()
    {
        for(int i=front; i<rear; i++)
        {
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue_Implementation_Using_Array1 queue=new Queue_Implementation_Using_Array1(7);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.print();

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(6);

        queue.print();
    }
}
