package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CollectionClass {
    public static void main(String[] args) {
        List<Integer>arrList = new ArrayList<>();

        arrList.add(10);
        arrList.add(20);
        arrList.add(5);
        arrList.add(2);

        //sort the arraylist
        Collections.sort(arrList, (a,b)-> b-a);
        PrintList(arrList);

        //Collections.reverse(collectin t)
        Collections.reverse(arrList);
        PrintList(arrList);

        //Collections.max() : return the max element from the collection
        int max = Collections.max(arrList);
        System.out.println("max in Collections: "+max);
        
        //Collections.min() : return the min element from the Collections
        int min = Collections.min(arrList);
        System.out.println("min in Collections: "+min);
    }

    private static void PrintList(List<Integer>list){
        System.out.println();
        list.forEach(num-> System.out.print(num+" "));
        System.out.println();

    }
}
