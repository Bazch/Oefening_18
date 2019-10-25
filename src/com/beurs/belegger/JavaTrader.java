package com.beurs.belegger;
import com.beurs.Aandelen;
import com.beurs.BeleggingsInstrument;
import com.beurs.PreferenteAandelen;
import com.beurs.PrioriteitsAandelen;
import com.beurs.Opties;

public class JavaTrader {

    public static void main(String[] args) {

//        Aandelen[] aandelenArray = new Aandelen[3];
//        aandelenArray[0] = amazon;
//        aandelenArray[1] = oracle;
//        aandelenArray[2] = apple;
//        for(Aandelen i : aandelenArray)
//                {
//            System.out.println(i.toString());
//        }

        BeleggingsInstrument[] beleggingenArray = new BeleggingsInstrument[4];
        beleggingenArray[0] = new Aandelen("AMZN");
        beleggingenArray[1] = new PreferenteAandelen("ORCL");
        beleggingenArray[2] = new PrioriteitsAandelen("AAPL");
        beleggingenArray[3] = new Opties("AAPL");
        for(BeleggingsInstrument i : beleggingenArray)
        {
            i.koop(250);
            i.dumpAlles();
            System.out.println(i.toString());
        }
    }
}
