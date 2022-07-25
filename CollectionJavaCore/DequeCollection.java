package CollectionJavaCore;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeCollection {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        // Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.removeLast();
        dq.removeLast();

        dq.offerFirst(1);
        dq.offerLast(2);

        dq.pollFirst();
        dq.pollLast();

        dq.getFirst();
        dq.getLast();

        dq.peekLast();
        dq.peekFirst();
    }

}