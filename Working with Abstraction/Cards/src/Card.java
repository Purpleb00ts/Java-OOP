public class Card {
    private CardRanks rank;
    private CardSuits suit;
    private int power;

    Card(CardRanks rank, CardSuits suit){
        this.rank = rank;
        this.suit = suit;
    }

    public void calculatePower(){
        power = rank.getPower() + suit.getPower();
    }

    public int getPower() {
        return power;
    }
}
