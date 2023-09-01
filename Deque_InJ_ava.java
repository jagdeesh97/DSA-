import java.util.LinkedList;
import java.util.Deque;

public class Deque_InJ_ava {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();

        System.out.println(deque.isEmpty());
        deque.addLast(5);
        deque.addLast(6);
        deque.addLast(7);
        deque.addLast(8);

        deque.addFirst(1);
        deque.addFirst(2);

        System.out.println(deque.removeLast());

        System.out.println(deque.removeFirst());

        System.out.println(deque.isEmpty());

        System.out.println(deque.peek());  // by default takes first

        System.out.println(deque.peekFirst());

        System.out.println(deque.peekLast());
    }
}
