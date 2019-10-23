public class JavaTrader {

    private static Aandelen AANDELEN;

    private static void transferAandelen(final Aandelen a){
        AANDELEN = a;
    }

    public static void main(String[] args) {
        Aandelen amazon = new Aandelen("AMZN");
        Aandelen oracle = new Aandelen("ORCL", 100);
        Aandelen apple = new Aandelen("AAPL");
        amazon.koop(100);
        oracle.koop(200);
        oracle.koop(200);
        oracle.koop(600);

        System.out.println("\n" + amazon.toString());
        System.out.println(oracle.toString());
        System.out.println(apple.toString() + "\n");

        transferAandelen(amazon);
        amazon = null;
        AANDELEN.koop(100);
        System.out.println(amazon);
        System.out.println(AANDELEN);
    }
}
