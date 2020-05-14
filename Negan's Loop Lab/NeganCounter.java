/**
 * 
 * The NeganCounter class is the setup for creating the list, filling it, and
 * chopping the list down.
 * It also takes user input for a few different parameters
 * (list size, Count, final words)
 * 
 * @author Brian Hauck
 */

import java.util.*;

public class NeganCounter
{
    //Sets up necessary globals
    Scanner in;

    BHLoopList theList;

    Iterator itr;
    /**
     * Regular constructor that creates the input,
     * creates the list, populates the list first(IMPORTANT,
     * then creates the iterator.
     * This will error out of you swap populateList() and the iterator creation.
     */
    public NeganCounter(){
        //Initialization
        in = new Scanner(System.in);

        theList = new BHLoopList();

        populateList();

        itr = theList.iterator();
    }
    /**
     * Generates user input for how many places to count
     * User input needs to be subtracted by one or else it counts unexpectedly.
     * Entering 1 without that will eliminate the #2 spot.
     */

    public int getCount(){

        System.out.println("What number will we count to?");

        int teller = in.nextInt()-1;

        System.out.println();

        return teller;        
    }

    /**
     * Moves through and prints whole list.
     * Sometimes will print things strangely.
     * Still works as intended though.
     */
    public void printList(){

        for(int i=0;i<theList.size();i++){
            System.out.print("=>" + itr.next());        
        }        
    }

    /**
     * Gets user input and fills the list with positions
     * 
     * I had names, but this required user input
     */
    public void populateList(){

        System.out.println("Enter number of people in the list: ");
        int people = in.nextInt();
        System.out.println();

        for(int i = 0;i<people;i++){
            theList.add(i);
        }

        //This was easier to read and do, but it does not satify the requirements
        /*theList.add("Rick");
        theList.add("Daryl");
        theList.add("Carol");
        theList.add("Rosita");
        theList.add("Michonne");
        theList.add("Shane");
        theList.add("Maggie");
        theList.add("Glenn");*/       
    }

    /**
     * The actual core of this class.
     * Queues for the final words, then loops through until the list is
     * of size 1.
     * Everytime it deletes a member, it says the final words and that member's
     * name.
     * 
     * Then congratulates the last member
     */
    public void cull(){
        System.out.println("What will their final words be?");
        in.nextLine();
        String finalWords = in.nextLine();
        System.out.println();

        while(theList.size()>1){

            printList();
            
            System.out.println("\n");
            
            int teller = getCount();
            
            System.out.println();

            for(int i = 0;i<teller;i++){
                itr.next();
            }

            System.out.println(finalWords + ", " + theList.get().toString() + "\n");

            itr.remove();
        }

        System.out.println("Congratulations, " + theList.get());       
    }
}
