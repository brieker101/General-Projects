//Brian Hauck
import java.util.*;

public class BalanceParentheses
{
    Stack<Character> inputString = new Stack<Character>();
    //(<{[]}>)

    public BalanceParentheses(){}

    public boolean isBalanced(String s){
        for(int i = 0;i<s.length();i++){

            if(s.charAt(i)=='('||s.charAt(i)=='<'||s.charAt(i)=='{'||s.charAt(i)=='['){
                inputString.push(s.charAt(i));
            }

            if(s.charAt(i)=='>'&&inputString.peek()=='<'){
                inputString.pop();
            }
            else if(s.charAt(i)=='}'&&inputString.peek()=='{'){
                inputString.pop();
            }
            else if(s.charAt(i)==']'&&inputString.peek()=='['){
                inputString.pop();
            }
            else if(s.charAt(i)==')'&&inputString.peek()=='('){
                inputString.pop();
            }
        }

        return inputString.isEmpty();
    }
}
