package com.beurs;
import java.time.LocalDateTime;

public class Opties implements BeleggingsInstrument {

        // INSTANTIE VARIABELEN
        private String symbool = "AMZN";
        private int aantal;
        private double totaleKosten;
        private LocalDateTime expiratieDatum;

        // CONSTRUCTORS
        public Opties(String symboolIn, int aantalIn) {
            setSymbool(symboolIn);
            koop(aantalIn);
        }

        public Opties(String symboolIn) {
            this(symboolIn, 100);
        }

        // METHODES
        @Override
        public void koop(int aantalIn) {
            float koers = Koers.van(this.symbool);
            if (koers > 0) {
                int aantal = getAantal();
                double totaleKosten = getTotaleKosten();
                aantal += aantalIn;
                setAantal(aantal);
                double aankoopKosten = aantalIn * Math.round(koers / 50);
                totaleKosten += aankoopKosten;
                setTotaleKosten(totaleKosten);
                System.out.println("Transactie: "+aantalIn + " opties " + getSymbool() + " Kosten: " + aankoopKosten);
            } else {
                System.out.println(
                        "Transactie: " + aantalIn + " opties " + getSymbool() + " mislukt. Geen koersinformatie beschikbaar");
            }
        }

        // GETTERS & SETTERS
        private void setSymbool(String symboolIn) {
            this.symbool = symboolIn;
        }

        private void setAantal(int aantalIn) {
            this.aantal = aantalIn;
        }

        public String getSymbool() {
            return this.symbool;
        }

        public int getAantal() {
            return this.aantal;
        }

        public double getTotaleKosten() {
            return this.totaleKosten;
        }

        private void setTotaleKosten(double totaleKosten) {
            this.totaleKosten = totaleKosten;
        }

        public LocalDateTime getExpiratieDatum() {
            return expiratieDatum;
        }

        public void setExpiratieDatum(LocalDateTime expiratieDatum) {
            this.expiratieDatum = expiratieDatum;
        }

        @Override
        public String toString() {
            return "Opties: symbool=" + this.getSymbool() + ", aantal=" + this.getAantal() + ", totale kosten="
                    + this.getTotaleKosten();
        }

}
