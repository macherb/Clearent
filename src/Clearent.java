public class Clearent {
    public static void main(Person[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("For Person " + (i + 1) + ":\n");
            System.out.println(args[i].InterestTotal());
            System.out.println(args[i].InterestPerCard());
        }
    }
}
