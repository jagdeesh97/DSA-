import  java.util.Stack;
public class Queue_implementation_Using_Array11 {
        int queue[];
        int front;
        int rear;
        int capacity;
    Queue_implementation_Using_Array11(int size){
            queue =new int[size];
            capacity=size;
            front=0;
            rear=0;

        }

//        public void enqueue(int data)
//        {
//            if(rear==capacity)
//            {
//                System.out.println("Queue full");
//                return;
//            }
//            queue[rear]=data;
//            rear++;
//        }
    public  void  enqueueFromFront(int data)  // Enqueue from front side     it is linear time
    {
        if(rear==capacity)
        {
            System.out.println("Queue full");
            return;
        }
        for(int i=rear-1; i>=front; i--)
        {
            queue[i+1]=queue[i];
        }
        queue[front]=data;
        rear++;
    }
    public  int dequeueFromRear()   //Dequeue from rear side       it is in constant time
    {
        if (front==rear)
        {
            System.out.println("Empty queue");
            return -1;
        }
        int dequeueEle=queue[rear-1]; // because rear is always one step ahead so queue[rear-1]
        rear--;
        return dequeueEle;
    }
//        public int dequeue()
//        {
//            if (front==rear)
//            {
//                System.out.println("Empty queue");
//
//                return -1;
//            }
//            int dequeueEle=queue[front];
//            for (int i=0; i<rear-1; i++)
//            {
//                queue[i]=queue[i+1];
//            }
//            rear --;
//            return  dequeueEle;
//        }

        public  void  print()
        {
            for(int i=front; i<rear; i++)
            {
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            Queue_implementation_Using_Array11 queue=new Queue_implementation_Using_Array11(7);

//            queue.enqueue(1);
//            queue.enqueue(2);
//            queue.enqueue(3);
//            queue.enqueue(4);
//            queue.enqueue(5);

            queue.print();

//            System.out.println(queue.dequeue());
//            System.out.println(queue.dequeue());
          //  queue.enqueue(6);



            queue.enqueueFromFront(7);
            queue.enqueueFromFront(8);
            queue.enqueueFromFront(9);
            queue.enqueueFromFront(10);
            queue.print();

            System.out.println(queue.dequeueFromRear());
            System.out.println(queue.dequeueFromRear());
        }
    }

