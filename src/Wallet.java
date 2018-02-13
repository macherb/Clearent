public class Wallet {
    private Card    cards[];

    public Wallet(Card cards[]) {
        this.cards = cards;
    }

    public String InterestTotal() {
        double  total =     0;

        for (int i = 0; i < cards.length; i++)
            total +=    cards[i].CalculateInterest();

        return  "$" + total + "\n";
    }

    public String InterestPerCard() {
        String  result =    "";

        for (int i = 0; i < cards.length; i++)
            result +=   "$" + cards[i].CalculateInterest() + "\n";

        return  result;
    }
}
