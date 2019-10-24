package com.beurs.belegger;

import com.beurs.Aandelen;
import com.beurs.PreferenteAandelen;
import com.beurs.PrioriteitsAandelen;

public class JavaTrader {

    public static void main(String[] args) {
        Aandelen amazon = new Aandelen("AMZN");
        PreferenteAandelen oracle = new PreferenteAandelen("ORCL", 100);
        PrioriteitsAandelen apple = new PrioriteitsAandelen("AAPL");
        amazon.koop(100);
        oracle.koop(200);
        oracle.koop(200);
        oracle.koop(600);

        System.out.println("\n" + amazon.toString());
        System.out.println(oracle.toString() + " extra dividend percentage: " + oracle.getExtraDividendPercentage());
        System.out.println(apple.toString() +  " extra stemrechtfactor: " + apple.getStemRechtFactor() + "\n");

        amazon.berekenDividend();
        amazon.berekenTransactieKosten();
    }
}
