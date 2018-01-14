import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    // Create deck ArrayList
    private ArrayList<Card> deck;

    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        deck = new ArrayList<>();
    }
    
    public void addCard(Card card)
    {
        deck.add(card);
    }
    
    public boolean isEmpty() {
        return deck.isEmpty();
    }
    
    public int getTotalCards()
    {
        return deck.size();
    }
    
    public String getCard(int index)
    {
        return deck.get(index).getCard();
    }
    
    public String getCardNumber(int index)
    {
        return deck.get(index).getCardNumber();
    }
    
    public String getCardSuit(int index)
    {
        return deck.get(index).getCardSuit();
    }
    
    public void clearDeck()
    {
        deck.clear();
    }
    
    public void shuffleDeck()
    {
        Collections.shuffle(deck);
    }
}
