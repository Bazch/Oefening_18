package com.beurs;
public class Kosten {

    private float transactiekosten=0.12f;
    private float abonnementskosten=5.5f;

    public void setTransactiekostenPerAandeel(float transactiekosten) {
        this.transactiekosten = transactiekosten;
    }
    public void berekenTransactieKosten(String symbool, int aantalAandelen) {
        System.out.println("De transactiekosten voor "+symbool+" zijn: "+abonnementskosten * aantalAandelen);
    }

    public void getAbonnementskosten() {
        System.out.println("De abonnementskosten zijn: "+abonnementskosten);
    }
}