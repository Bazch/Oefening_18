package com.beurs;

import com.beurs.*;
import com.beurs.BeleggingsInstrument;
import com.beurs.Portfolio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JavaTraderPortfolio {

    char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static void main(String[] args) {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Collection<BeleggingsInstrument> beleggingen = new ArrayList<BeleggingsInstrument>();

//        for (BeleggingsInstrument bellegingen : Portfolio.zoekOpSymbool("M%"))
//            System.out.println(bellegingen.toString());

//        for (char a : alphabet) {
//            Collection<BeleggingsInstrument> temp = new ArrayList<BeleggingsInstrument>();
//
//            for (BeleggingsInstrument bellegingen : Portfolio.zoekOpSymbool(a+"%")) {
//                temp.add(bellegingen);
//            }
//            System.out.println("Er zijn "+temp.size()+" aandelen met beginletter "+a);
//        }

        double hoogsteKosten = 0;
        BeleggingsInstrument duursteBelleging = null;

        Collection<BeleggingsInstrument> temp = Portfolio.alleAandelen();

        for (BeleggingsInstrument i : temp){
            if (i.getTotaleKosten() > hoogsteKosten){
                hoogsteKosten = i.getTotaleKosten();
                duursteBelleging = i;
            }
        }
        System.out.println(duursteBelleging.toString());

    }

}
