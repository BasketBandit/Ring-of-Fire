public class main {
    public static void main(String[] args) {
      RingofFire game = new RingofFire(1);
      game.deckInitialise();

      // A small loop to run through a complete game. (This shows that it actually works! haha)
      while(game.getKings() != 0) {
          game.nextTurn();
      }

    }
}
