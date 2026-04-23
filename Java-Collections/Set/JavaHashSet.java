package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaHashSet{
    public static void main(String[] args){

        //creating Hashset using Set Interface
        Set<Integer>hashset = new HashSet<>();

        //add(element) : adding element into the hashset;
        hashset.add(10);
        hashset.add(20);
        hashset.add(30);
        hashset.add(40);
        hashset.add(50);

        //size() : get the length/element count of the set
        int size = hashset.size();
        System.out.println("size of the hashset:"+" "+size);

        PrintSet(hashset);

        //3. contains(element) : returns true if set has element else return false;
        boolean has_number = hashset.contains(10);
        System.out.println("Hashset has 10:"+" "+has_number);

        //4. remove(element) : remove element from the set and return true else return false;
        boolean removed = hashset.remove(10);
        System.out.println("Is 10 has been removed:"+" "+removed);

        //5. isEmpty() : return true if set is empty else return false;
        boolean is_empty = hashset.isEmpty();
        System.out.println("Is Set Empty:"+" "+is_empty);
    }

    public static void PrintSet(Set<Integer>set){
        //1. using iterator class
        Iterator<Integer>itr = set.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        //2. using forEach method;
        set.forEach((num)-> System.out.print(num+" "));
    }
}