## 📌 What is Deque?

Deque stands for **Double-Ended Queue**.  
It allows insertion and deletion from **both front and rear** ends.

Deque<Integer> deque = new ArrayDeque<>();
🎯 Why Use Deque?

✅ Fast insertion/removal from both ends
✅ Can work as:
Queue (FIFO)
Stack (LIFO)

✅ Used in:
Sliding Window Problems
BFS Graph Traversal
Undo/Redo Features
Browser History
⚙️ How Deque Works
Front  <--->  Rear

Elements can be added/removed from both sides.

🔥 Common Deque Methods 
Method	Description	Time
addFirst()	Add at front	O(1)
addLast()	Add at rear	O(1)
removeFirst()	Remove from front	O(1)
removeLast()	Remove from rear	O(1)
peekFirst()	View front	O(1)
peekLast()	View rear	O(1)

🧠 Internal Working
Deque internally uses:
Dynamic Array (ArrayDeque)
Doubly Linked List (LinkedList);

✅ Advantages
✔ Faster than Stack
✔ Flexible data structure
✔ Efficient memory usage

❌ Disadvantages
❌ Random access not supported
❌ Slightly complex compared to Queue

📚 Real Interview Uses
🔥 Monotonic Queue
🔥 LRU Cache
🔥 Sliding Window Maximum
🔥 Palindrome Checking