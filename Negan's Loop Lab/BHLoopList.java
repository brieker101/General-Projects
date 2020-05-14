/**
 * This LoopList will take any type and place it into a series of nodes
 * that move in one direction infinitely. It loops back to the beginning when
 * it encounters the end of the list.
 * 
 * This one was tricky because I tricked myself.
 * I wrote all of the logic one go and everything worked.
 * It printed out all of the same object names. 
 * Hint: itr.next() should be used to grab names of nodes as you pass by,
 * not list.get().
 * 
 * @author Brian Hauck
 */
import java.util.*;

public class BHLoopList<E> implements Iterable
{
    //Necessay globals
    private Node current;

    private Node head;

    private int size;

    /**
     * Blank constructor that creates a nodeless list and sets size to 0
     */
    public BHLoopList(){

        size = 0;

        head =  null;

        current = head;
    }

    /**
     *Test only method to determine whether or not head was being set correctly
     *@return Head
     */
    private String getHead(){

        return head.getNext().getData().toString();
    }

    /**
     * Adds nodes to the list. If head is null, it sets the first element added
     * as the head and links it back to itself.
     * All other adds beyond that reroute the previous reference to it and
     * points the new object to the head. Adds size.
     */
    public void add(E item){
        Node temp = new Node(item);

        if(head==null){

            head = temp;

            current = head;

            current.setNext((E)head);

        }
        else{

            current.setNext((E)temp);

            current = temp;

            current.setNext((E)head);
        }

        size++;
    }

    /**
     * Returns the current node in use
     * @return Node current 
     */
    public E get(){

        return (E)current;
    }

    /**
     * @return size
     */
    public int size(){

        return size;
    }

    /**
     * Returns the iterator specific to this class
     * @return BHLoopList Iterator
     */
    public Iterator iterator(){

        return new BHLoopListIterator();
    }

    /**
     * The node class that contains data and the reference to the next object
     */
    private class Node{
        //Necessary private globals
        private E data;

        private Node next;
        /**
         * Only constructor due to how this class is designed.
         * The Outer class handles the next references
         */
        public Node(E data){

            this.data = data;

            next = null;
        }

        /**
         * Standard method that needs to be included but is not used
         * @return Node current
         */
        public Node getNode(E item){

            current = head;

            while(current.getData()!=item){

                current = current.getNext();

            }

            return current;
        }

        /**
         * returns the nodes data
         * @return data
         */
        public E getData(){

            return data;
        }

        /**
         * A setter that designates the reference for the next variable
         */
        public void setNext(E object){

            next = (Node)object;
        }

        /**
         * returns next variable
         * @return Node next
         */
        public Node getNext(){

            return next;
        }

        /**
         * Overridden method for any data type
         */
        @Override
        public String toString(){

            return "" + data;
        }
    }

    /**
     * Custom iterator for this class
     */
    private class BHLoopListIterator implements Iterator{
        //Necessary private globals
        private Node previous;

        //Never used this
        //private boolean nextCalled;

        private Node next;
        /**
         * Constructor that the iterator method in the outer class uses to 
         * hand over control to the Iterator object.
         * Resets position and sets previous, current, and next.
         */
        public BHLoopListIterator(){
            while(current!=head){
                current = current.getNext();
            }
            previous = current;

            current = previous.getNext();

            next = current.getNext();
        }

        /**
         * Teller for whether or not there is a next element in the list.
         * This is useless because there will always be another element next in the list.
         * That is unless the list is empty.
         * @return boolean
         */
        public boolean hasNext(){

            if(current.getNext()!=null){

                return true;
            }
            else{

                return false;
            }
        }

        /**
         * Moves the iterator to the next value while returning the previous Node.
         * Return previous and current will get the same result when printing.
         * @return Node previous
         */
        public E next(){

            previous = current;

            current = previous.getNext();

            next = current.getNext();

            return (E)previous;
        }

        /**
         * Very carefully shifts the references around to cut out the current node.
         * Checks if the current node is head and then sets head to current.getNext().
         */
        public void remove(){

            if(current==head){
                head = current.getNext();
            }

            previous.setNext((E)current.getNext());

            current = previous.getNext();

            next = current.getNext();

            size--;
        }
    }
}