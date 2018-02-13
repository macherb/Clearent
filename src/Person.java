public class Person {
    private Wallet  wallets[];

    public Person(Wallet wallets[]) {
        this.wallets =  wallets;
    }

    public String InterestTotal() {
        String  result =    "";

        for (int i = 0; i < wallets.length; i++)
            result +=   "Total interest in wallet " + (i + 1) + ": " + wallets[i].InterestTotal();

        return  result;
    }

    public String InterestPerCard() {
        String  result =    "";

        for (int i = 0; i < wallets.length; i++)
            result +=   "Interest per card in wallet " + (i + 1) + ":\n" + wallets[i].InterestPerCard();

        return  result;
    }
}
