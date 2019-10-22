public class JavaTrader {

    public static void main(String[] args) {
        Aandelen amazon = new Aandelen("AMZN");
        Aandelen oracle = new Aandelen("ORCL", 100);
        amazon.koop(100);
        oracle.koop(200);
        oracle.koop(200);
        oracle.koop(600);

        System.out.println(amazon.toString());
        System.out.println(oracle.toString());

    }
}
