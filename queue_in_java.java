import java.util.LinkedList;
import java.util.Queue;  // This is example of polymorphism because Queue is behaving like linked list
                       // Note that ,Queue (interface)->Deque (interface)-> Linked list (Class)
public class queue_in_java {
    public static void main(String[] args) {   // queue is interface and linked list is its child So queue behave like linked list
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

       System.out.println(queue.remove());

       System.out.println(queue.size());

       System.out.println(queue.peek());
    }
}
