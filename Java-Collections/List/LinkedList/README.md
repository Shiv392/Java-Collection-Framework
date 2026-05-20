## 📌 What is LinkedList?

`LinkedList` is a linear data structure where elements are connected using nodes.
Each node contains:
- 📦 Data
- 🔗 Reference to next node
- ⬅️ (Optional) previous node

Java LinkedList uses a **Doubly Linked List** internally.
```java
import java.util.LinkedList;
🧠 Internal Working

Unlike arrays:
❌ No contiguous memory
✅ Dynamic memory allocation
✅ Fast insertion/deletion

Structure:
[Prev|Data|Next];

✅ Declaring LinkedList
LinkedList<String> list = new LinkedList<>();

⚡ Common Methods
Method	Description	Complexity
add()	Add element	🟢 O(1)
addFirst()	Insert at head	🟢 O(1)
addLast()	Insert at tail	🟢 O(1)
get(index)	Access node	🔴 O(n)
remove()	Remove node	🟢 O(1)
contains()	Search element	🔴 O(n)
size()	Total nodes	🟢 O(1);

🧪 Example
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {

        LinkedList<Integer> nums = new LinkedList<>();

        nums.add(10);
        nums.add(20);
        nums.addFirst(5);

        System.out.println(nums);

        nums.removeLast();

        System.out.println(nums);
    }
};

📦 Time Complexity
Operation	Complexity
Access	🔴 O(n)
Insert Head/Tail	🟢 O(1)
Delete Head/Tail	🟢 O(1)
Search	🔴 O(n);

🧠 Space Complexity
Scenario	Complexity
Storage	O(n)
Extra Pointer Memory	O(n);

🔥 ArrayList vs LinkedList
Feature	ArrayList	LinkedList
Random Access	🚀 Fast	🐢 Slow
Insert/Delete Middle	❌ Expensive	✅ Better
Memory Usage	✅ Low	❌ Higher
Cache Performance	✅ Better	❌ Poor;

💡 Senior Engineer Tips
✅ Use LinkedList When:
Frequent insertions/deletions
Queue/Deque implementations
Unknown data size
❌ Avoid When:
Heavy random access
Performance-critical reads;

⚠️ Common Mistakes
❌ Using get(i) in loops
for(int i=0; i<list.size(); i++)
This becomes:
O(n²);

✅ Use iterator instead.
📚 Conclusion
LinkedList is powerful for:
Dynamic data
Frequent modifications
Queue/Stack systems