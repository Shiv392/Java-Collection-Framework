## 📌 What is ArrayList?

`ArrayList` is a dynamic array implementation in Java from the Java Collections Framework.

Unlike normal arrays, ArrayList can:
- ✅ Grow automatically
- ✅ Shrink dynamically
- ✅ Store duplicate values
- ✅ Maintain insertion order

```java
import java.util.ArrayList;
🧠 Internal Working

ArrayList internally uses a resizable array.

📈 How it grows automatically

When capacity becomes full:

Java creates a new bigger array
Copies old elements
Replaces old array

Growth Formula (approx):

newCapacity = oldCapacity + (oldCapacity / 2);
newCapacity = 1.5*(oldCapacity);
then first it copies all element of the old array then add new element.
Example:

10 → 15 → 22 → 33 ...
📉 How it shrinks

ArrayList does NOT shrink automatically after remove operations.

Use:

list.trimToSize();

This reduces unused memory.

✅ Declaring ArrayList
Basic Syntax
ArrayList<String> names = new ArrayList<>();

With Initial Capacity
ArrayList<Integer> nums = new ArrayList<>(100);

⚡ Common Methods
Method	Description	Time Complexity
add(E e)	Add element at end	🟢 O(1);
add(index, E e)	Insert at index	🟡 O(n);
get(index)	Access element	🟢 O(1);
set(index, E e)	Update element	🟢 O(1);
remove(index)	Remove by index	🟡 O(n);
remove(Object o)	Remove by value	🟡 O(n);
contains(obj)	Search element	🔴 O(n);
size()	Current size	🟢 O(1);
clear()	Remove all elements	🟡 O(n);

🧪 Example
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println(fruits);

        fruits.remove("Mango");

        System.out.println(fruits.get(1));
    }
}

📦 Time Complexity Summary
Operation	Complexity
Access	🟢 O(1)
Insert End	🟢 O(1) amortized
Insert Middle	🟡 O(n)
Delete	🟡 O(n)
Search	🔴 O(n)

🧠 Space Complexity
Scenario	Complexity
Storage	O(n)
Resize Operation	O(n) temporary;

🔥 Array vs ArrayList
Feature	Array	ArrayList
Fixed Size	✅ Yes	❌ No
Dynamic Resize	❌ No	✅ Yes
Primitive Support	✅ Yes	❌ Wrapper only
Built-in Methods	❌ Limited	✅ Rich API;

💡 Senior Engineer Tips
✅ Use Initial Capacity

Avoid frequent resizing.

new ArrayList<>(1000);
✅ Prefer ArrayList for Read-heavy Systems

Fast random access:

list.get(index);
❌ Avoid Middle Insertions Frequently

Because shifting elements is expensive.

Use:

LinkedList
Deque for heavy insert/delete workloads.

⚠️ Common Mistakes
❌ IndexOutOfBoundsException
list.get(10);

Always validate:
if(index < list.size());

✅ Best Practices
Use Generics
Predefine capacity when possible
Prefer List interface
List<String> list = new ArrayList<>();

📚 Conclusion
ArrayList is one of the most used Java collections because of:
🚀 Fast access
📈 Dynamic resizing
🧩 Easy API
✅ Cache-friendly performance

Best for:
Read-heavy applications
Dynamic datasets
General-purpose storage