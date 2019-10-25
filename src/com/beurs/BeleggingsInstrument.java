package com.beurs;

public interface BeleggingsInstrument {

    void koop (int aantal);
    String getSymbool();
    int getAantal();
    double getTotaleKosten();
    default void dumpAlles(){
        koop(-getAantal());
    }
}
