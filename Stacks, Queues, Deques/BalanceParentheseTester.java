public class BalanceParentheseTester
{
   public static void main(String[] args){
    BalanceParentheses test = new BalanceParentheses();
    
    System.out.println(test.isBalanced("{}"));
    
    System.out.println(test.isBalanced("{]"));
        
    System.out.println(test.isBalanced("()"));
    
    
    
    }
}
