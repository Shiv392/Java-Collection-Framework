package Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeClass {
    public static void main(String[] args) {
        //Define Deque
        Deque<Integer>deque = new ArrayDeque<>();

        //1. addFirst(element) : add element into start of the dequee
        deque.addFirst(10);
        deque.addFirst(20);
        

        //2. addLast(element) : add element into last of the deque
        deque.addLast(30);

        PrintDeque(deque);

        //we can alos use offerLast() & offerFront().
        //the main differcne between offer & add is that if queue is full add() will return IndexOutOfSpace error 
        //while offer method only return false;

        //3. deque.size() : return int type size of the deque
        int size = deque.size();
        System.out.println("Size of the deque: "+size);

        //4. isEmpty() : return true if deque is empty else return false;
        boolean isEmpty = deque.isEmpty();
        System.out.println("Is Deque empty: "+isEmpty);

        //5. pollLast() : removes and return the last element of the deque
        int last = deque.pollLast();
        System.out.println("Last element: "+last);

        //6. pollFirst() : removes and return the first element of the deque
        int first = deque.pollFirst();
        System.out.println("First element: "+first);


        PrintDeque(deque);

    }

    private static void PrintDeque(Deque<Integer>deque){
        System.out.println("Using Iterator class");
        Iterator<Integer>itr = deque.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        System.out.println("Using forEach method");
        deque.forEach(num-> System.out.print(num+" "));
    }
}
