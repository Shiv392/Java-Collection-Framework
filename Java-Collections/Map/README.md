## 📌 What is Map?

`Map` is a collection that stores:
- ✅ key : value pair elements

🧠 Internal Working

When you add data:
1. When we add a key like key : "Name" & value :"Shiv" into a Map, Java first generates a hashCode() for that object. [4] A new node is created using key, value. 
Using this hash value, an index is calculated for the bucket array internally done using hashing logic.
2. Map internally uses a dynamic bucket array. At the calculated index:
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

Map Classes -->
1. HashMap : it internally hash key into their hashIndex so that searching can be faster here order of the key would not be same or it is unpredectibe. 
2. TreeMap : Stores key and value in the sorted order in terms of their keys. 
3. LinkedListMap : Store key, value with their exact order as they were adding. 
