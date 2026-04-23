package Map;

import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {
        //define Hashmap with Map Interface
        Map<String, String>map = new HashMap<>();

        //put(key,value) : add key value pair into the map
        map.put("name", "Shiv Soni");
        map.put("age","25");
        map.put("city", "Raipur");

        //print map
        PrintMap(map);

        //size() : return the number of keys
        int size = map.size();
        System.out.println("Size of the map:"+" "+size);

        //getOrDefault(key, "default_value"): if map has key value then return its value else it will return default value;
        String default_value = map.getOrDefault("country", "India");
        System.out.println("Default Value:"+" "+default_value); 

        //remove(key): remove key and value from the map
        map.remove("city");
        PrintMap(map);

        //containsKey(key) : returns true if map has key else return true;
        boolean HasName = map.containsKey("name");
        System.out.println("Map has Name key:"+" "+HasName);

        //containsValue(key) : return true if map has value;
        boolean HashShivSoni = map.containsValue("Shiv Soni");
        System.out.println("Map has Shiv Soni"+" "+HashShivSoni);
    }

    public static void PrintMap(Map<String, String>map){
        //1. keySet() : returns set of the keys present in the map
        //get(key) : return value from the map with specified key
        Set<String>keys = map.keySet();
        keys.forEach(key-> System.out.println("Key:"+" "+key+","+"value"+" "+map.get(key)));
        System.out.println();

        //2.values() : return set of the value present in the map
        Collection<String>values = map.values();
        values.forEach(ele-> System.out.print(ele+" "));
        System.out.println();

        //3.entrySet() : returns a set view 
        for(Map.Entry<String, String>entry : map.entrySet()){
            System.out.println("key:"+" "+entry.getKey()+" "+"value"+" "+entry.getValue());
        }
    }
}
