## 📌 What is HashSet?

`HashSet` is a collection that stores:
- ✅ Unique elements
- ❌ No duplicates
- ❌ No indexing
- ❌ No insertion order guarantee

Internally uses:
```text id="t9x2bl"
HashMap
[5]

🧠 Internal Working

When you add data:
Object ka hashCode() generate hota hai
Hash calculate hota hai
Element bucket me store hota hai
HashSet<Integer> set = new HashSet<>();

⚡ Time Complexity
Operation	Complexity
add()	🟢 O(1)
remove()	🟢 O(1)
contains()	🟢 O(1)
Iteration	🟡 O(n)

Worst case:
O(n);

✅ Common Methods
Method	Description
add()	Insert element
remove()	Delete element
contains()	Check existence
size()	Total elements
clear()	Remove all

🧪 Example
import java.util.HashSet;
public class Demo {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Java");

        System.out.println(set);
    }
}

Output:
[Java, Python]

Duplicate ignored ✅

Unique usernames
Tags
Cache keys
⚠️ Important Interview Point
set.add(null);

HashSet allows:

ONE null value
🧠 Senior Engineer Insight

HashSet is usually preferred over ArrayList for searching because:

contains() -> O(1)

while ArrayList search is:

O(n)