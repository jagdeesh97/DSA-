import java.util.LinkedList;
import java.util.Deque;

public class Deque_in_java {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();

        System.out.println(deque.isEmpty());
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);

        deque.addFirst(6);

        System.out.println(deque.removeFirst());

        System.out.println(deque.removeLast());

        System.out.println(deque.isEmpty());

        System.out.println(deque.peekFirst());

        System.out.println(deque.peekLast());


    }
}
