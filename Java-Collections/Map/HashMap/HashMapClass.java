package Map.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapClass {
    public static void main(String[] args) {
        //creat an HashMap object with Map interface
        Map<String, String>hashMap = new HashMap<>();

        //put into the hashmap
        //1. map.put(key,value) is used to insert into the hashmap
        //if hashmap already have key then it will update its value. 
        //it also takes null values. 
        hashMap.put("name", "ShivSoni");
        hashMap.put("age","26");
        hashMap.put("city", "Raipur");
        hashMap.put("Skill", "Spring Boot");
        hashMap.put("Salary", null);

        //2. map.get(key) : return the given key value, if key not found then it will return null value;
        String name = hashMap.get("name");
        System.out.println("Name: "+name);

        //3. map.getOrDefault(key, defaultValue) : return the value of the key if map has else return defaultValue;
        String className = hashMap.getOrDefault("class", "HashMap");
        System.out.println("class name: "+className);

        //4. map.size() : size of the keys present in the hashmap
        int size = hashMap.size();
        System.out.println("Size: "+size);

        //5. map.keySet() : returns the Set object of the keys
        Set<String>keySet = hashMap.keySet();
        System.out.println("Keys: ");
        keySet.forEach(key-> System.out.print(key+" "));

        //6. map.containsKey(key) : returns true if map has key else return false;
        boolean hasNameKey = hashMap.containsKey("Name");
        System.out.println("Contains Name Key: "+hasNameKey);

        //7. map.containsValue(value): returns true if map has given value else return false;
        boolean hashValue = hashMap.containsValue("Shiv");
        System.out.println("Map has Shiv Value: "+hashValue);

        //8. map.remove(key) : removes key with their value if present in the map
        hashMap.remove("Skill");

        //9. map.values() : returns collections view of the all values presnet in the map
        Collection<String> values = hashMap.values();
        Iterator<String>itr = values.iterator();
        System.out.println("Value of the hashMap: ");
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }

        //PrintHashMap
        PrintHashMap(hashMap);
    }

    private static void PrintHashMap(Map<String, String>map){
        //1. using keySet()
        System.out.println("Using Set Object: ");
        Set<String>keys = map.keySet();
        for(String key : keys){
            System.out.println("Key: "+key+" "+"Value: "+map.get(key));
        }

        //2. using map.entrySet()
        System.out.println("Using entries method: ");
        for(Map.Entry<String, String>entry : map.entrySet()){
            System.out.println("Key: "+entry.getKey()+" "+"Value: "+entry.getValue());
        }
    }
}
