public abstract class Card {
    protected   int     interest;

    private     double  balance;

    public Card() {
        balance =   100.00;
    }

    public double CalculateInterest()
    {
        return balance * (interest / 100.0);
    }
}
