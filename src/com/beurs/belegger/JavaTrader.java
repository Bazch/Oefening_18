package com.beurs.belegger;
import com.beurs.Aandelen;
import com.beurs.PreferenteAandelen;
import com.beurs.PrioriteitsAandelen;

public class JavaTrader {


    public static void main(String[] args) {
        Aandelen amazon = new Aandelen("AMZN");
        PreferenteAandelen oracle = new PreferenteAandelen("ORCL", 100);
        PrioriteitsAandelen apple = new PrioriteitsAandelen("AAPL");
        
        Aandelen[] aandelenArray = new Aandelen[3];
        aandelenArray[0] = amazon;
        aandelenArray[1] = oracle;
        aandelenArray[2] = apple;
        for(Aandelen i : aandelenArray)
                {
            System.out.println(i.toString());
        }
    }
}
