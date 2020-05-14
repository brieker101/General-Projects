/**
 * @author Brian Hauck
 */
import java.util.*;

public class Tester
{
    public static void main(String[] args){
        System.out.println("Stack");
        //stack can be created on its own because it is not an interface. This is an empty one.
        Stack stack = new Stack(); 
        System.out.println(stack.empty()); //Check if it is empty
        stack.push("Hello"); //Place an element in
        System.out.println(stack.peek()); //Look at the top without removing
        System.out.println(stack.pop()); //Remove and get top value
        for(int i = 0;i<10;i++){
            //Adding a bunch of numbers to be tested upon
            stack.push(i + "");
        }

        System.out.println("\n");
        System.out.println("Queue");
        Queue queue = new LinkedList(); //Creating a queue with a LinkedList backend
        queue.add("Hello"); //This method forces an object into the list and can error out
        System.out.println(queue.peek()); //Look at the top
        queue.offer("Hello!"); // Try to add but don't add if there is no room
        System.out.println(queue.element()); //Retrieves head of queue
        System.out.println(queue.poll()); //Retrieves and removes head
        System.out.println(queue.remove() + "\n"); //Removes head
        for(int i = 0;i<10;i++){
            //Adding a bunch of numbers to be tested upon
            queue.add(i + "");
        }

        System.out.println("Deque");
        //Making a deque with an array backend    
        Deque deque = new ArrayDeque();
        for(int i = 0;i<10;i++){
            //Adding a bunch of numbers to be tested upon
            deque.add(i + "");
        }
        deque.addFirst("-1");//Add before every other element
        deque.addLast("10"); //Add after every other element
        deque.contains("10"); //Check if this object is in the list

        System.out.println(deque.element());//Gets first element
        System.out.println(deque.getFirst());//Gets first element
        System.out.println(deque.getLast());//Gets last element

        deque.offer("-2");//Same as the previous offer() method. Tries to add and doesn't if no room.
        deque.offerFirst("-3"); //Tries to add before other elements
        deque.offerLast("11"); // Tries to add after other elements

        System.out.println(deque.peek()); //Looks at the head of the list
        System.out.println(deque.peekFirst()); //Looks at the head of the list
        System.out.println(deque.peekLast()); //Looks at the end of the list

        System.out.println(deque.poll()); //Gets and removes the head of the list
        System.out.println(deque.pollFirst()); //Gets and removes the head of the list
        System.out.println(deque.pollLast()); //Gets and removes the end of the list

        System.out.println(deque.pop()); //Gets the top element and removes it
        deque.push("-4"); //Puts a new item on top of the other items

        deque.remove(); //Removes the top of the deque
        deque.remove("5"); //Removes a specified object from the deque
        deque.removeFirst(); //Removes the top of the deque
        deque.removeLast(); //Removes the bottom of the deque
        deque.removeFirstOccurrence("10"); //Removes the first appearance of the specified object
        deque.removeLastOccurrence("1"); //Removes the last appearance of the specified object
        System.out.println(deque.size()); //Returns size of deque

        Iterator stackIterator = stack.iterator();//Iterates through stack
        for(int i = 0;i<stack.size();i++){
            System.out.print(stackIterator.next() + " ");
        }
        System.out.println("\n");

        Iterator queueIterator = queue.iterator();//Iterates through queue
        for(int i = 0;i<queue.size();i++){
            System.out.print(queueIterator.next() + " ");
        }
        System.out.println("\n");

        Iterator dequeDescending = deque.descendingIterator(); //Descending iterator
        Iterator dequeIterator = deque.iterator(); //Regular iterator that moves through deque
        for(int i = 0;i<deque.size();i++){
            System.out.print(dequeIterator.next() + " ");
        }
    }

}
