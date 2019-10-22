public class Aandelen {
    private String symbool = "AMZN";
    private int aantal;
    private double totaleKosten;
    private static int MAX_AANDELEN_KOPEN = 500;

    public Aandelen(String sym, int aant){
        setSymbool(sym);
        koop(aant);
    }
    public Aandelen(String sym){
        this(sym, 100);
    }

    public String getSymbool(){

        return symbool;
    }
    public int getAantal(){

        return aantal;
    }
    public double getTotaleKosten(){

        return totaleKosten;
    }
    private void setSymbool(String symboolIn){

        symbool = symboolIn;
    }
    private void setAantal(int aantalIn){
        aantal = aantalIn;
    }
    private void setTotaleKosten(double totaleKostenIn){
        totaleKosten = totaleKostenIn;
    }
    public void koop(int aantalIn) {
        if (aantalIn <= 500) {


            int nieuwAantal = getAantal() + aantalIn;
            double kosten = aantalIn * 1919.65;
            double nieuweKosten = getTotaleKosten() + kosten;
            setAantal(nieuwAantal);
            setTotaleKosten(nieuweKosten);
            System.out.println("Transactie: " + aantalIn + " aandelen " + getSymbool() + " kosten: " + kosten);
        } else {
            System.out.println("Transactie: " + aantalIn + " aandelen " + getSymbool() + " mislukt. Maximaal:" +
                    MAX_AANDELEN_KOPEN);
        }
    }

    @Override
    public String toString() {
        return "Aandelen: symbool=" + symbool + ", aantal=" + aantal +", totale kosten=" + totaleKosten;
    }
}