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
1. When we add a key like "Shiv" into a HashSet, Java first generates a hashCode() for that object. [4]
Using this hash value, an index is calculated for the bucket array internally done using hashing logic.
2. HashSet internally uses a dynamic bucket array. At the calculated index:
If the bucket is empty, a new node is inserted.
The node stores:
the actual value
reference to the next node (next pointer).
3. Average insertion time is O(1).
4. If multiple elements map to the same bucket (collision), nodes are connected using a linked list.
5. In Java 8+, if collisions in one bucket become too high (bucket size > 8), the linked list is converted into a Red-Black Tree to improve search performance from:
O(N) → O(log N). [4]

⚡ Time Complexity
Operation	Complexity
add()	🟢 O(1)
remove()	🟢 O(1)
contains()	🟢 O(1) worst case O(n)
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