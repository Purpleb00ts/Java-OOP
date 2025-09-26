import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardRanks cardRank = CardRanks.valueOf(scanner.nextLine());
        CardSuits cardSuit = CardSuits.valueOf(scanner.nextLine());

        Card card = new Card(cardRank, cardSuit);

        card.calculatePower();

        System.out.printf("Card name: %s of %s; Card power: %d", cardRank.name(), cardSuit.name(), card.getPower());
    }
}
