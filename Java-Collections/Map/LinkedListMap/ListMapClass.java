package Map.LinkedListMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ListMapClass {
    public static void main(String[] args) {
        //creating LinkedHashmap
        Map<String, String>listMap = new LinkedHashMap<>();

        //listMap.put(key,value);
        listMap.put("Name", "ShivSoni");
        listMap.put("age", "26");
        listMap.put("Salary", null);
        listMap.put("City", "Raipur");
        listMap.put("Skill","Spring Boot");

        //listMap.get(key);
        String name = listMap.get("Name");
        System.out.println("Name: "+name);

        //listMap.containsKey(key);
        boolean containsName = listMap.containsKey("Name");
        System.out.println("Listmap contains Name key: "+containsName);

        //listMap.containsValue(value);
        boolean containsValue = listMap.containsValue("ShivSoni");
        System.out.println("Listmap contains ShivSoni value: "+containsValue);

        //listMap.size();
        System.out.println("Size of the listHashMap: "+listMap.size());

        //prinnt map
        PrintMap(listMap);
    }

    private static void PrintMap(Map<String, String>map){
        //1. using keySet() and get()
        Set<String>keys = map.keySet();
        System.out.println("using KeySet() && get()");
        for(String key : keys){
            System.out.println("Key: "+key+" "+"Value: "+map.get(key));
        }

        //2. using Map.Entry
        System.out.println("using Map.Entry method");
        for(Map.Entry<String, String>entry : map.entrySet()){
            System.out.println("Key: "+entry.getKey()+" "+"Value: "+entry.getValue());
        }
    }
}
