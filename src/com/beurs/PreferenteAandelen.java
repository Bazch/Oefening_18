package com.beurs;

public class PreferenteAandelen extends Aandelen {

    private float extraDividendPercentage = 0.0075f;

    public float getExtraDividendPercentage() {
        return extraDividendPercentage;
    }
    public void setExtraDividendPercentage(float extraDividendPercentage) {
        this.extraDividendPercentage = extraDividendPercentage;
    }

    public PreferenteAandelen(String sym, int value){
        super(sym, value);
    }

    @Override
    public String toString(){
        super.toString();
        return"Aandelen: symbool= "+getSymbool()+", aantal= "+getAantal()+", totale kosten= "+getTotaleKosten()+
                " extra dividend percentage: "+getExtraDividendPercentage();
    }

}
