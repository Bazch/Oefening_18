package com.beurs;

public class Aandelen {
    private String symbool;
    private int aantal;
    private double totaleKosten;
    private static int MAX_AANDELEN_KOPEN = 500;
    private Kosten kosten = new Kosten();
    private Dividend dividend = new Dividend();


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
        if (aantalIn <= MAX_AANDELEN_KOPEN) {
            int nieuwAantal = getAantal() + aantalIn;
            float koers = Koers.van(getSymbool());
            if (koers > 0) {
                double kosten = aantalIn * koers;
                double nieuweKosten = getTotaleKosten() + kosten;
                setAantal(nieuwAantal);
                setTotaleKosten(nieuweKosten);
                System.out.println("Transactie: " + aantalIn + " aandelen " + getSymbool() + " kosten: " + kosten);
            }else {
                System.out.println("Transactie: " + aantalIn + " aandelen " + getSymbool() + " mislukt. Geen " +
                        "koersinformatie beschikbaar.");
            }
        }else {
            System.out.println("Transactie: " + aantalIn + " aandelen " + getSymbool() + " mislukt. Maximaal:" +
                    MAX_AANDELEN_KOPEN);
        }
    }

    public void berekenTransactieKosten() {
    kosten.berekenTransactieKosten(this.symbool, this.aantal);
    }
    public void berekenDividend(){
        dividend.berekenDividend(this.symbool, Koers.van(this.symbool), this.aantal);
    }

    @Override
    public String toString() {
        return "Aandelen: symbool=" + symbool + ", aantal=" + aantal +", totale kosten=" + totaleKosten;
    }
}