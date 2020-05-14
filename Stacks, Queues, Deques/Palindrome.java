//Brian Hauck
import java.util.*;

public class Palindrome
{
    //Set up necessary comparables and holders
    Stack<Character> inputString;
    Stack<Character> inputStringHolder;
    Stack<Character> inputStringReverse;
    Scanner in;
    String input;
   

    /**
     * Input creation and all of the Stacks necessary for checking
     */
    public Palindrome(){
        in = new Scanner(System.in);
        inputString = new Stack<Character>();
        inputStringReverse = new Stack<Character>(); 
        inputStringHolder = new Stack<Character>();
    }

    /**
     * Whenever I set inputStringHolder = InputString it would give me emptyStack
     * Push character to both inputString and inputStringHolder
     */
    public void fillStack(){
        System.out.println("Please enter a String to test:");
        input = in.nextLine();
        for(int i = 0;i<input.length();i++){
           inputString.push((Character) input.charAt(i));
           inputStringHolder.push((Character) input.charAt(i));
        }
         buildReverse();
    }

    /**
     * Pop until empty and place in another stack
     */
    private void buildReverse(){
       
        while(!inputStringHolder.isEmpty()){
            inputStringReverse.push(inputStringHolder.pop());
        }
        System.out.println(inputString.peek());
        System.out.println(inputStringReverse.peek());
    }

    /**
     * Since the reverse should be the same if they are palindrome, it is fine to just wildy compare them.
     * THIS IS CASE SENSITIVE
     */
    public boolean isPalindrome(){
        while(!inputString.isEmpty()||!inputStringReverse.isEmpty()){
            if(!inputString.peek().equals(inputStringReverse.peek())){return false;}
            inputString.pop();
            inputStringReverse.pop();
        }
         return true;
    }
   

}

