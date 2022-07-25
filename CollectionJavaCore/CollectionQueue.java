package CollectionJavaCore;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue {
    public static void main(String[] args) {
        
        Queue<Integer> qu = new LinkedList<Integer>();
        qu.add(15);
        qu.add(155);
        qu.add(11245);
        qu.add(1235);
        qu.add(1555);
        qu.add(1955);
        System.out.println(qu); // [15, 155, 11245, 1235, 1555, 1955]
        int item = qu.remove();
        System.out.println(qu); //[155, 11245, 1235, 1555, 1955]
        qu.offer(2809);
        item = qu.remove();
        System.out.println(qu); //[11245, 1235, 1555, 1955, 2809]
        item = qu.poll();
        System.out.println(qu); 

        qu.element();
        System.out.print(qu); //[1235, 1555, 1955, 2809]
        qu.peek();
        System.out.println(qu); //[1235, 1555, 1955, 2809]

        qu.remove(2809);
        System.out.print(qu); //[1235, 1555, 1955]


    }
    
}
