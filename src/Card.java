public class Card {
    // A cards number, from Ace (1) to King (13)
    private String card;
    // A cards suit. Spades, Hearts, Clubs, Diamonds.
    private String suit;
    
    /**
     * Constructor for objects of class Card
     */
    public Card(String card, String suit)
    {
       this.card = card;
       this.suit = suit;
    }
    
    /**
     * Method to return card and suit.
     */
    public String getCard()
    {
        return card + " " + suit;
    }
    
    public String getCardNumber()
    {
        return card;
    }
    
    public String getCardSuit()
    {
        return suit;
    }
}
