package Map.TreeMap;

import java.util.Map;
import java.util.TreeMap;

//All treeMap method is as same is regular hashmap
//only difference is treemap always maintains the sorted structure by keys 

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<Integer, Integer>treeMap = new TreeMap<>();

        treeMap.put(10,20);
        treeMap.put(5,50);
        treeMap.put(0, 10);

        PrintTreeMap(treeMap);

        //map.firstKey() : returns the first key of the sorted tree map
        int firstKey = treeMap.firstKey();
        System.out.println("First key: "+firstKey);

        //map.higherKey(key) : return key whose value is higher then given value
        int higherKey = treeMap.higherKey(9);
        System.out.println("Higher key: "+higherKey);
    }

    private static void PrintTreeMap(Map<Integer, Integer>map){
        for(Map.Entry<Integer, Integer>entry : map.entrySet()){
            System.out.println("key: "+entry.getKey()+" "+"value: "+entry.getValue());
        }
    }
}
