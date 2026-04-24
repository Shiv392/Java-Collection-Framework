package List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        
        //define array list
        List<Integer>list = new ArrayList<>();
        //we can also create list with given size by passing size into th (size);

        //add() add elements into the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //declare list with default value using Arrays.asList();
        List<Integer>default_list = Arrays.asList(10,20,30,40,50);


        //size() : returns the size of the list
        int size = list.size();
        System.out.println("Size of the list:" + " "+size);

        //remove(key) : remove the given index value from the list;
        list.remove(0);

        //print the list 
        PrintList(list);

        //convert array into the list
        Integer[] arr = new Integer[10];
        for(int i=0;i<10;i++){
            arr[i]=i+1;
        }
        List<Integer>arr_list = Arrays.asList(arr);

        PrintList(arr_list);

        //contains() return true if array list has given value
        boolean has_num10 = list.contains(10);
        System.out.println("Number 10 exists, "+" "+has_num10);

        //get arrya from the list
        Integer[] list_to_arr = ListToArr(arr_list);
        for(int num : list_to_arr){
            System.out.print(num+" ");
        }
    }

    public static void PrintList(List list){
        //we can iterate over the list by 2 method
        //1. using Iterator 
        Iterator<Integer>it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        System.out.println();

        //2. using forEach();
        list.forEach(num-> System.out.print(num+" "));
    }

    public static Integer[] ListToArr(List<Integer> list){
        Integer[] arr = list.toArray(new Integer[0]);
        return arr;
    }
}
