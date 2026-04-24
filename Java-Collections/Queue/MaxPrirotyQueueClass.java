package Queue;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MaxPrirotyQueueClass {
    public static void main(String[] args) {
        //define max priority queue
        PriorityQueue<Integer>max_queue = new PriorityQueue<>((a,b)->b-a);

        //add into the priority queue;
        //add() add element into the priority queue but error case it return IlliegalExceptionError
        //offer() add element into the pq and return true, in case of error it returns false;
        max_queue.add(10);
        max_queue.offer(20);
        max_queue.add(30);
        max_queue.add(5);
        max_queue.add(4);

        //size() : return size of the max_queue
        int size = max_queue.size();
        System.out.println("Size of the max heap"+" "+size);

        //peek() : return the top of the max heap
        int max_value = max_queue.peek();
        System.out.println("Top of the max heap:"+" "+max_value);

        //poll() : returns the top of the mn heap also remove from the max
        int top = max_queue.poll();
        System.out.println("Removed top of the max heap:"+" "+top);

        System.out.println("Top of the max heap:"+" "+max_queue.peek());

        //contains(key) : return true if max heap has that value
        System.out.println("max heap has 10:"+" "+max_queue.contains(10));


        //clear the maxqueue
        max_queue.clear();

        int num = max_queue.hashCode();
        System.out.println("hashcode value of the max_queue:"+" "+num);
    }

    // public static void PrintmaxQueue(PriorityQueue maxheap){
    //     //1. using iterator class
    //     Iterator<Integer>itr = maxheap.iterator();
    //     System.out.println("Using Iterator Class");
    //     while(itr.hasNext()){
    //         System.out.print(itr.next()+" ");
    //     }

    //     //2. using forEach
    //     System.out.println("Using forEach method");
    //     maxheap.forEach(num-> System.out.print(num+" "));
    //     System.out.println();
    // }
}
