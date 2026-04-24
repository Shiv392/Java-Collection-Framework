package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MinPriorityQueueClass {
    public static void main(String[] args) {
        //define min priority queue
        PriorityQueue<Integer>min_queue = new PriorityQueue<>((a,b)->a-b);

        //add into the priority queue;
        //add() add element into the priority queue but error case it return IlliegalExceptionError
        //offer() add element into the pq and return true, in case of error it returns false;
        min_queue.add(10);
        min_queue.offer(20);
        min_queue.add(30);
        min_queue.add(5);
        min_queue.add(4);

        //size() : return size of the min_queue
        int size = min_queue.size();
        System.out.println("Size of the min heap"+" "+size);

        //peek() : return the top of the min heap
        int min_value = min_queue.peek();
        System.out.println("Top of the min heap:"+" "+min_value);

        //poll() : returns the top of the mn heap also remove from the min
        int top = min_queue.poll();
        System.out.println("Removed top of the min heap:"+" "+top);

        System.out.println("Top of the min heap:"+" "+min_queue.peek());

        //contains(key) : return true if min heap has that value
        System.out.println("Min heap has 10:"+" "+min_queue.contains(10));


        //clear the minqueue
        min_queue.clear();

        int num = min_queue.hashCode();
        System.out.println("hashcode value of the min_queue:"+" "+num);
    }

    public static void PrintMinQueue(PriorityQueue minheap){
        //1. using iterator class
        Iterator<Integer>itr = minheap.iterator();
        System.out.println("Using Iterator Class");
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        //2. using forEach
        System.out.println("Using forEach method");
        minheap.forEach(num-> System.out.print(num+" "));
        System.out.println();
    }
}
