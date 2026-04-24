package List;

import java.util.List;
import java.util.Iterator;

public class LinkedListCollectin {
    public static void main(String[] args){

        //define list
        List<Integer>list = List.of(10,20,30);

        //add() : add element into the list
        list.add(40);
        list.add(50);
        list.add(60);

        PrintList(list);

        //size() : return the size of the list
        int size = list.size();
        System.out.println("Size of the list:"+" "+size);

        //contains() : return true if list has specified element else return false
        boolean has40 = list.contains(40);
        System.out.println("List has 40:"+" "+has40);

        //remove(index) : remove element from the list at given index
        list.remove(0);

    }

    public static void PrintList(List<Integer>list){
        //1. using iterator()
        Iterator<Integer>itr = list.iterator();
        System.out.println("Using Iterator Class");
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        //2. using forEach();
        System.out.println("Using forEach()");
        list.forEach(num-> System.out.print(num+" "));
        System.out.println();
    }
}
