public class RingofFire {
    // Create the deck variable.
    private Deck deck;
    // Initialise the cardIndex.
    private int cardIndex = 0;
    // Initialise the number of players.
    private int players = 0;
    // Initialise the players turn.
    private int player = 1;
    // Initialise the turn counter.
    private int turn = 1;
    // Initialise the king counter.
    private int kings = 4;
    // Initialise the game rules
    private String gameRule = "";

    /**
     * Constructor for objects of class Main.
     * @construct a deck of cards.
     * @parameter passes the number of players
     */
    public RingofFire(int x) {
        deck = new Deck();
        players = x;
        deckInitialise();
    }

    /**
     * Method to initialise the deck. If the deck is empty, add all of the 
     * cards possible and if the deck isn't empty, clear it and re-initialise.
     */
    public void deckInitialise() {
        if(deck.isEmpty()) {
            deck.addCard(new Card("Ace","Spades"));
            deck.addCard(new Card("2","Spades"));
            deck.addCard(new Card("3","Spades"));
            deck.addCard(new Card("4","Spades"));
            deck.addCard(new Card("5","Spades"));
            deck.addCard(new Card("6","Spades"));
            deck.addCard(new Card("7","Spades"));
            deck.addCard(new Card("8","Spades"));
            deck.addCard(new Card("9","Spades"));
            deck.addCard(new Card("10","Spades"));
            deck.addCard(new Card("Jack","Spades"));
            deck.addCard(new Card("Queen","Spades"));
            deck.addCard(new Card("King","Spades"));

            deck.addCard(new Card("Ace","Hearts"));
            deck.addCard(new Card("2","Hearts"));
            deck.addCard(new Card("3","Hearts"));
            deck.addCard(new Card("4","Hearts"));
            deck.addCard(new Card("5","Hearts"));
            deck.addCard(new Card("6","Hearts"));
            deck.addCard(new Card("7","Hearts"));
            deck.addCard(new Card("8","Hearts"));
            deck.addCard(new Card("9","Hearts"));
            deck.addCard(new Card("10","Hearts"));
            deck.addCard(new Card("Jack","Hearts"));
            deck.addCard(new Card("Queen","Hearts"));
            deck.addCard(new Card("King","Hearts"));

            deck.addCard(new Card("Ace","Diamonds"));
            deck.addCard(new Card("2","Diamonds"));
            deck.addCard(new Card("3","Diamonds"));
            deck.addCard(new Card("4","Diamonds"));
            deck.addCard(new Card("5","Diamonds"));
            deck.addCard(new Card("6","Diamonds"));
            deck.addCard(new Card("7","Diamonds"));
            deck.addCard(new Card("8","Diamonds"));
            deck.addCard(new Card("9","Diamonds"));
            deck.addCard(new Card("10","Diamonds"));
            deck.addCard(new Card("Jack","Diamonds"));
            deck.addCard(new Card("Queen","Diamonds"));
            deck.addCard(new Card("King","Diamonds"));

            deck.addCard(new Card("Ace","Clubs"));
            deck.addCard(new Card("2","Clubs"));
            deck.addCard(new Card("3","Clubs"));
            deck.addCard(new Card("4","Clubs"));
            deck.addCard(new Card("5","Clubs"));
            deck.addCard(new Card("6","Clubs"));
            deck.addCard(new Card("7","Clubs"));
            deck.addCard(new Card("8","Clubs"));
            deck.addCard(new Card("9","Clubs"));
            deck.addCard(new Card("10","Clubs"));
            deck.addCard(new Card("Jack","Clubs"));
            deck.addCard(new Card("Queen","Clubs"));
            deck.addCard(new Card("King","Clubs"));
            
            shuffleDeck();
            System.out.println("Deck shuffled and ready to play!");
            System.out.println("There are "+players+" players.");
            System.out.println("-----------------------------------");
            System.out.println();
        } else {
            deck.clearDeck();
            cardIndex = 0;
            player = 1;
            kings = 4;
            turn = 1;
            deckInitialise();
            shuffleDeck();
            
            System.out.println("Deck shuffled and ready to play!");
            System.out.println("There are "+players+" players.");
            System.out.println("-----------------------------------");
            System.out.println();
        }
    }

    /**
     * Method to get the total number of cards in the deck; this number shouldn't be able to exceed 52.
     */
    public void getTotalCard() {
        int total = deck.getTotalCards();
        System.out.println("There are currently "+total+" cards in the deck.");
    }
    
    /**
     * Method to get the remaining number of kings in the current deck of cards.
     * Dependant on the cardIndex value.
     */
    public int getKings() {
        return kings;
    }

    /**
     * Method to print all of the cards in the deck in their current order from index of 0 to 51.
     */
    public void printAllCards() {
        int index = 0;
        while(index < 52){
            String cardNumber = deck.getCardNumber(index);
            String cardSuit = deck.getCardSuit(index);
            System.out.println(cardNumber + " of " + cardSuit);
            index++;
        }
    }

    /**
     * Method that prints out the current cardIndex and the increments it.
     */
    public void printNextCard() {
        if(cardIndex < 52) {
            String cardNumber = deck.getCardNumber(cardIndex);
            String cardSuit = deck.getCardSuit(cardIndex);
            System.out.println(cardNumber + " of " + cardSuit);
            cardIndex++;
        } else {
            System.out.println("Out of cards!");
        }
    }

    /**
     * Method that is essentially a game tick, it handles which player is to be subject of the card,
     * it handle the current turn number and the number of kings still in play.
     */
    public void nextTurn() {
        String cardNumber = deck.getCardNumber(cardIndex);
        String cardSuit = deck.getCardSuit(cardIndex);
        
        if(player == (players+1)) {
            player = 1;
        }
        
        switch(cardNumber) {
            case "Ace": gameRule = "Waterfall! Everyone drinks until the person who picked up the card stops!";
            break;
            case "2": gameRule = "2 is choose! You choose someone to drink!";
            break;
            case "3": gameRule = "3 is me! You must drink!";
            break;
            case "4": gameRule = "4 is whore! All girls drink!";
            break;
            case "5": gameRule = "Thumb Master! When you put your thumb on the table, the last to copy must drink!";
            break;
            case "6": gameRule = "6 is dicks! All guys drink!";
            break;
            case "7": gameRule = "7 is heaven! When you raise your hand, the last to copy must drink!";
            break;
            case "8": gameRule = "8 is mate! Choose someone to drink with you!";
            break;
            case "9": gameRule = "9 is rhyme! Pick a word, the next person must pick a word that rhymes and so on until someone messes up, they must drink!";
            break;
            case "10": gameRule = "Categories! Pick a category such as rum, the next person must pick a word that fits and so on until someone messes up, they must drink!";
            break;
            case "Jack": gameRule = "Make a rule! You can make a rule up that everyone has to follow (including you) for the rest of the game, whoever doesn't do it must drink! (Each and every time!)";
            break;
            case "Queen": gameRule = "Questions! Go around in a circle and keep asking questions, whoever messes up must drink!";
            break;
            case "King": gameRule = "Pour! You must pour 'some' of your drink into the cup in the middle of the table, whoever picks up the final king must drink it all!";
            kings = kings - 1;
            break;
        }            

        if(kings != 0) {
            System.out.println("Turn "+turn+", player "+player);
            System.out.println("-----------------------------------");
            System.out.println(cardNumber + " of " + cardSuit);
            System.out.println(gameRule);
            System.out.println("-----------------------------------");
            System.out.println("Cards left: "+(52-(cardIndex+1))+", Kings left: "+kings);
            System.out.println();
            System.out.println();
            System.out.println();
        } else {
            System.out.println("Turn "+turn+", player "+player);
            System.out.println("-----------------------------------");
            System.out.println(cardNumber + " of " + cardSuit);
            System.out.println("PLAYER "+player+" LOSES, DRINK!");
            System.out.println("-----------------------------------");
            System.out.println("Cards left: "+(52-(cardIndex+1))+", Kings left: "+kings);
            System.out.println();
            System.out.println();
            System.out.println();
        }
       
        cardIndex++;
        player++;
        turn++;
    }

    /**
     * Method to shuffle the deck, it does this 3 times for 'maximum' shuffle.
     */
    public void shuffleDeck() {
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
    }
}
