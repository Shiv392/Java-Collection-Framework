package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String[] args) {

        //defining single linked list
        List<Integer>linkedList = new LinkedList<>();

        //create new list with default value
        Integer[] arr = {1,2,3};
        List<Integer>linkedList2 = List.of(arr);
        //or
        List<Integer>defaultList = List.of(10, 20, 30, 40);

        //2. addLast() : add element into the last of the list
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.addLast(50);

        //3. addFirst() : add element into the start of the list
        linkedList.addFirst(60);

        PrintList(linkedList);

        //4.size() : return the size of the list
        int size = linkedList.size();
        System.out.println("Size of the list: "+ size);

        //get(index) : get and return then element with specified index.
        //if index is greater then size then return index out of size array
        System.out.println(linkedList.get(1));

        //5. remove(int index) : remove the element from the list
        linkedList.remove(2);
        PrintList(linkedList);

        //6. contains(element) : return true if list has element
        System.out.println("is list has 5: "+ linkedList.contains(5));

        //6. clear() : clear all element of the list
        linkedList.clear();
    }

    private static void PrintList(List<Integer>list){
        System.out.println("Using forEach method: ");
        list.forEach(ele-> System.out.print(ele+" "));
        System.out.println();

        System.out.println("Using iterator class: ");
        Iterator<Integer>iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
    }
}
