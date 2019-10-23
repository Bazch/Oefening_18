public class JavaTraderArray {

    static Aandelen amazon;
    static Aandelen oracle;
    static Aandelen apple;

    public static void main(String[] args) {

        Aandelen aandelenArray[] = new Aandelen[3];
        for (int i = 0; i < args.length; i++) {
            if (i % 2 == 0) {
                switch (args[i]) {
                    case "AMZN":
                        amazon = new Aandelen(args[i], Integer.parseInt(args[i+1]));
                        break;
                    case "ORCL":
                        oracle = new Aandelen(args[i], Integer.parseInt(args[i+1]));
                        break;
                    case "AAPL":
                        apple = new Aandelen(args[i], Integer.parseInt(args[i+1]));
                        break;
                    default:
                        break;
                }
            }else continue;
        }
        System.out.println(amazon.toString());
        System.out.println(oracle.toString());
        System.out.println(apple.toString());
    }
}
