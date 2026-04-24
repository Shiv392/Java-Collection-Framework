package Queue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {
        //define Queue

        Queue<Integer>queue = new LinkedList<>();

        //add() : add records into the quue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.offer(60);

        //add() and offer() do same the main differene is their return type.
        //add() first add element and return true if successfull insertion else return IllegalException Error.
        //offer() first add element and return true if successfull else return false;

        //print queue
        PrintQueue(queue);

        //peek() : return the first element of the queue
        int top = queue.peek();
        System.out.println("First of the queue:"+" "+top);

        //poll() : remove and rethrns the first element of the queue
        int first = queue.poll();
        System.out.println("first removed of the queue:"+" "+first);
        PrintQueue(queue);

        //size() : return size of the queue in int
        int size = queue.size();
        System.out.println("Size of the queue:"+" "+size);

        //isEmpty() : return boolean (true|false) if queue is empty 
        boolean is_empty = queue.isEmpty();
        System.out.println("Is Queue Empty:"+" "+is_empty);

    }

    public static void PrintQueue(Queue<Integer>queue){
        //1. using iterator function
        Iterator<Integer>itr = queue.iterator();
        System.out.println("Using Iterator class");
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        //2. using forEach method
        System.out.println("Using forEach method");
        queue.forEach(num-> System.out.print(num+" "));
        System.out.println();

    }
}
