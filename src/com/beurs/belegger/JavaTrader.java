package com.beurs.belegger;

import com.beurs.Aandelen;

public class JavaTrader {

    public static void main(String[] args) {
        Aandelen amazon = new Aandelen("AMZN");
        Aandelen oracle = new Aandelen("ORCL", 100);
        Aandelen apple = new Aandelen("AAPL");
        amazon.koop(100);
        oracle.koop(200);
        oracle.koop(200);
        oracle.koop(600);

        System.out.println("\n" + amazon.toString());
        System.out.println(oracle.toString());
        System.out.println(apple.toString() + "\n");

        amazon.berekenDividend();
        amazon.berekenTransactieKosten();
    }
}
