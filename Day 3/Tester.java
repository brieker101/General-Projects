public class Tester
{
   public static void main(String[] args){
       Deck deck = new Deck(50);
       deck.printDeck();
       System.out.println("\n");
       System.out.println(deck.draw());
       System.out.println(deck.draw());
       System.out.println(deck.draw());
      System.out.println("\n");
       deck.printDeck();
       System.out.println("\n");
       deck.emptyDeck(); 
       
       
       deck.printDeck();
       
    
    
    }
}
