import java.util.*;
public class Deck
{
    private ArrayList<Card> deck; 
    private int deckLength;

    public Deck(int length){
        deck = new ArrayList<Card>();
        deckLength = length;
        fillDeck();
    }

    public void fillDeck(){
        System.out.println("Filling deck...");
        for(int i = 0;i<deckLength;i++){
            int teller = (int)Math.round(Math.random()*6);
            if(teller<=2){
                deck.add((Card)(new One()));
            }
            else if(teller>2&&teller<4){
                deck.add((Card)(new Two()));
            }
            else{
                deck.add((Card)(new Three()));
            }
        }
    }

    public int draw(){
        int drawn = (int)(Math.round(Math.random()));
        drawn = deck.get(drawn).getValue();
        deck.remove(drawn);
        return drawn;
    }

    public void emptyDeck(){
        System.out.println("Emptying Deck...");
        deck = new ArrayList();
    }

    public void printDeck(){
        if(deck.size()==0){System.out.println("Deck is empty!");}
        else{
            for(int i = 0; i<deck.size();i++){
                System.out.print((deck.get(i).getValue())+ " ");
            }
        }
    }

}
