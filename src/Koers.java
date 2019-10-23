public class Koers {
    private static float AMZN = 1_919.65f;
    private static float ORCL = 47.81f;
    private static float AAPL = 210.24f;

    public static float van(String symbool){
        switch (symbool)
        {   case "AMZN":
                        return AMZN;
            case "ORCL":
                         return ORCL;
            case "AAPL":
                        return AAPL;
                default:
                        return 0f;
        }
    }
}
