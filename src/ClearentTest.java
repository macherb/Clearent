import org.junit.jupiter.api.Test;

class ClearentTest {
    @Test
    void test1() {
        System.out.println("Begin Test 1");
        Card x[] =      new Card[3];
        x[0] =          new Visa();
        x[1] =          new MC();
        x[2] =          new Discover();

        Wallet y[] =    new Wallet[1];
        y[0] =          new Wallet(x);

        Person z[] =    new Person[1];
        z[0] =          new Person(y);

        Clearent.main(z);
        System.out.println("End Test 1");
    }

    @Test
    void test2() {
        System.out.println("Begin Test 2");
        Card x1[] =     new Card[2];
        x1[0] =         new Visa();
        x1[1] =         new Discover();
        Card x2[] =     new Card[1];
        x2[0] =         new MC();

        Wallet y[] =    new Wallet[2];
        y[0] =          new Wallet(x1);
        y[1] =          new Wallet(x2);

        Person z[] =    new Person[1];
        z[0] =          new Person(y);

        Clearent.main(z);
        System.out.println("End Test 2");
    }

    @Test
    void test3() {
        System.out.println("Begin Test 3");
        Card x[][] =    new Card[2][];
        x[0] =          new Card[2];
        x[0][0] =       new MC();
        x[0][1] =       new Visa();
        x[1] =          new Card[2];
        x[1][0] =       new Visa();
        x[1][1] =       new MC();

        Wallet y[][] =  new Wallet[2][];
        y[0] =          new Wallet[1];
        y[0][0] =       new Wallet(x[0]);
        y[1] =          new Wallet[1];
        y[1][0] =       new Wallet(x[1]);

        Person z[] =    new Person[2];
        z[0] =          new Person(y[0]);
        z[1] =          new Person(y[1]);

        Clearent.main(z);
        System.out.println("End Test 3");
    }
}