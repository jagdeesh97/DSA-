import java.util.LinkedList;
import  java.util.*;

public class Queue_implementation {          // Differences b/w ArrayDeque and Linked List is based on Cache
    public static void main(String[] args) {
       // Queue<Integer> q = new LinkedList<>();   // using Linked List Class
        Queue<Integer> q = new ArrayDeque<>();    // Using ArrayDeque Class
                                                 // Queue is interface in java and object can not be created of interfaces
        q.add(1);                               //So to implement queue we use ArrayDeque or Linked List (Class)
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Size = "+q.size());
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
