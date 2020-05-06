import GUI.GameScreen;
import GameCards.CardClass;
import GameCards.CardUtilities;


public class Main {
    public static void main(String[] args) {
        GameScreen gameScreen=GameScreen.getInstance();
        CardUtilities cardUtilities=new CardUtilities();
        System.out.println(cardUtilities.getCardsNameOfMana(1).toString());
    }
}
