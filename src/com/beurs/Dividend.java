package com.beurs;

public class Dividend {
    private float percentage=0.0125f;
    private String periode="kwartaal";

    public float getPercentage() {
        return percentage;
    }
    public String getPeriode() {
        return periode;
    }
    public void berekenDividend(String symbool, float koers, int aantalAandelen) {
        System.out.println("Het dividend voor "+symbool+" is: "+percentage*aantalAandelen*koers);
    }

}
