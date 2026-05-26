package Set;

import java.util.ArrayList;
import java.util.List;

public class DesignHashSet {
    public static void main(String[] args) {
        //create a bucket size;
        int bucketSize = 10000;
        //create a bucket array that contains node
        List<Integer>[] bucket = new ArrayList[bucketSize];

        //add(int key);
        //1. create an index code
        int key = 10;
        int index = key%bucketSize;
        if(!bucket[index].contains(key)){
            bucket[index].add(key);
        }

        //2. check if key has inside the hashset 
        boolean check = bucket[index].contains(key);

        //3. remove key from the hashset
        bucket[index].remove(Integer.valueOf(key));

        //here we are implemented this for int type
        //but in case if we have object type like String or custom object
        //then first we need to get their hashCode using hashCode() method
        //then get the absolute value of hashCode / bucketSize;
        
    }
}
