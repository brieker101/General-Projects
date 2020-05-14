import java.util.ArrayList;
public class Data
{
    private int random;
    private boolean judge;

    ArrayList<Integer> accounts = new ArrayList<Integer>(10);
    ArrayList<Integer> eraser = new ArrayList<Integer>(10);
    public Data(){
        for(int i = 0; i < 10; i++){
            random = (int)(Math.random()*2000);
            accounts.add(random);
        }
    }

    public void process(Filter helper){
        printAccounts();
        for(int i = 0; i < accounts.size(); i++){      
            judge = helper.accept(accounts, i);
            if(judge == false){
                eraser.add(i);
            }
        }
        for(int i = 0; i < eraser.size(); i++){
            accounts.remove((eraser.get(i)-i));        
        }
        printAccounts();
    }   
    
    public void printAccounts(){
        for(int i = 0; i< accounts.size(); i++){
            System.out.println("Account #" + (i+1) + ": " + accounts.get(i));
        }
    }
}
