/**
 * The BHLinkedList class recreates java's LinkedList class
 * 
 * @author Brian Hauck
 * @date 9/20/2018
 */
public class BHLinkedList <E> 
{
    //Necessary variables for the operation of BHLinkedList
    private Node head;
    private Node current;
    private Node temp;
    private int size;

    /**
     * Initial Constructor for the whole linked list.
     * Creates a size tracker starting at 0.
     * Creates the head node that treacks the first node/
     * Sets the current operable node to head.
     */
    public BHLinkedList(){
        size = 0;
        head = new Node ("Head", null);    
        current = head;
    }

    /**
     * Adds a node at the end of the list.
     * Sets previous end of the list's nextNode() value to the new one.
     * @param Generic Object
     */
    public void addNode(E data){
        current = head;
        temp = new Node(data, null);
        while(current.getNext()!=null){
            current = current.getNext();
        }
        current.setNext(temp);
        current = temp;
        size++;
    }

    /**
     * Adds a node at a specified location.
     * Creates new node, counts until one before the new location, points the current node towards the new one,
     * then points the new one at the previous current.getNext()
     * @param Index to insert at, Generic Object
     */
    public void addNode(int i, E data){
        current = head;
        temp = new Node(data, null);
        for(int j = 0;j<i;j++){
            current = current.getNext();
        }
        temp.setNext(current.getNext());
        current.setNext(temp);
        size++;
    }

    /**
     * The opposite of removeFromFront.
     * Creates a new node, sets the next field on it to the Head's nextNode value,
     * then sets the Head's nextNode to the new node.
     * @param Generic Object
     */
    public void addInFront(E data){
        current = head;
        temp = new Node(data, current.getNext());
        temp.setNext(current.getNext());
        current.setNext(temp); 
        size++;
    }

    /**
     * Uses the overridden toString() method to print each Node's data.
     */
    public void printArray(){
        current = head.getNext();
        while(current.getNext()!=null){
            System.out.print(current.toString() + " ====> ");
            current = current.getNext();
        }
        System.out.println(current.toString());
    }

    /**
     * Removes the first node by moving to the second node, 
     * then setting that one to the head's first node tracker.
     */
    public void removeFromFront(){
        current = head;
        current = current.getNext();
        head.setNext(current.getNext());
        size--;
    }

    /**
     * Counts until one before the node you want to remove, then grabs the reference from the to-be cut node
     * and pastes it into the node before it.
     * @param Index to remove
     */
    public void remove(int i){
        current = head;
        for(int j = 0;j<i;j++){
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        size--;
    }

    /**
     * @return Size
     */
    public int size(){
        return size;
    }

    /**
     * The inner class of the LinkedList class. These objects function as the "links"  in the list. 
     * They hold their own data and object references to the next node.
     * @param None
     * @return None
     */
    private class Node<E>{
        
        //Data and the object reference
        private E data;
        private Node next;
        
        /**
         * The first overloaded contructor.
         * @param Generic Object, Node nextNodeReference
         * @return None
         */
        public Node(E d, Node n){
            data =  d;
            next =  n;
        }
        
        /**
         * The second overloaded constructor
         * @param Generic Object
         */
        public Node(E d){
            data = d;
            next = null;
        }

        /**
         * Custom toString that casts the data to a String
         * @override 
         * @return (String) Node data
         */
        public String toString(){
            return (String) data;
        }

        /**
         * Returns the next object reference
         * @return Node Reference
         */
        public Node getNext(){
            return next;
        }

        /**
         * Gets the current node's data
         * @return Node data;
         */
        public E getData(){
            return data;
        }

        /**
         * Sets next Node in the list
         * @param Node
         */
        public void setNext(Node s){
            next = s;
        }
    }
}

