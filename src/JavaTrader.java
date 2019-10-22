public class JavaTrader {

    private static Aandelen AANDELEN;

    static Aandelen transferAandelen(Aandelen a){
        AANDELEN = a;
        return AANDELEN;
    }

    public static void main(String[] args) {
        Aandelen amazon = new Aandelen("AMZN");
        Aandelen oracle = new Aandelen("ORCL", 100);
        amazon.koop(100);
        oracle.koop(200);
        oracle.koop(200);
        oracle.koop(600);

        System.out.println(amazon.toString());
        System.out.println(oracle.toString());

        transferAandelen(amazon);
        amazon = null;
        AANDELEN.koop(100);
        System.out.println(amazon);
        System.out.println(AANDELEN);
    }

}
