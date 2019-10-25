package com.beurs;

public class PrioriteitsAandelen extends Aandelen{

    private int stemRechtFactor = 10;

    public int getStemRechtFactor() {
        return stemRechtFactor;
    }
    public void setStemRechtFactor(int stemRechtFactor) {
        this.stemRechtFactor = stemRechtFactor;
    }

    public PrioriteitsAandelen(String sym){
        super(sym, 100);
    }

    @Override
    public String toString(){
        super.toString();
        return"Aandelen: symbool= "+getSymbool()+", aantal= "+getAantal()+", totale kosten= "+getTotaleKosten()+
                " extra stemrechtfactor: " +getStemRechtFactor();
    }
}
