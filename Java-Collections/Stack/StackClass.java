package Stack;

import java.util.Iterator;
import java.util.Stack;

public class StackClass {
 public static void main(String[] args) {
    
    //define Stack Object with Stack Interface
    Stack<Integer>stk = new Stack<>();

    //add(): add element into the stack and returns true after successfull adding
    stk.add(10);
    stk.add(20);
    stk.add(30);
    stk.add(40);
    stk.add(50);

    //we can also use push() to insert element into the stack but it will returns the last inserted elemnent again.
    stk.push(60);

    //size() : get the size of the stack
    int size = stk.size();
    System.out.println("Size of the stack:"+" "+size);

    //print the stck
    PrintStack(stk);

    //peek(): return the top of the stack, if stack is empry returns null;
    int peek = stk.peek();
    System.out.println("Top of the stack:"+" "+peek);

    //pop() : first remove the top of the stack also returns it.
    int top = stk.pop();
    System.out.print("Pop from the stack:"+" "+top);
    PrintStack(stk);

    //get(index) : used to get the stack from the perticular index;
    int num = stk.get(0);
    System.out.println(num);
 }   

 public static void PrintStack(Stack<Integer>stack){
    //1. using Iterator class
    Iterator<Integer>itr = stack.iterator();
    while(itr.hasNext()){
        System.out.print(itr.next()+" ");
    }

    //2. Using forEach method
    System.out.println();
    stack.forEach((Integer num)-> System.out.print(num+" "));
 }
}
