package com.beurs;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Portfolio {

    static Random rand = new Random();

    class Aandelen implements BeleggingsInstrument {
        private String symbool;
        private int aantal;
        private double totaleKosten;
        public Aandelen(String s){this.symbool=s;};
        public void koop(int aantal) {this.aantal=aantal;this.totaleKosten=aantal*rand.nextFloat()*750;};
        public String getSymbool() {return symbool;};
        public int getAantal() {return aantal;};
        public double getTotaleKosten() {return totaleKosten;};
        public String toString() {
            DecimalFormat df = new DecimalFormat(".##");
            return "Aandelen: symbool=" + this.getSymbool() + ", aantal=" + this.getAantal() + ", totale kosten="
                    + df.format(this.getTotaleKosten());
        }
    }

    // verzameling van alle beleggingen
    private static Collection<BeleggingsInstrument> beleggingen = new ArrayList<BeleggingsInstrument>();

    // doorzoek alle beleggingen op basis van symbool
    public static Collection<BeleggingsInstrument> zoekOpSymbool(String symbool) {
        // maak een variabele voor het zoekresultaat
        Collection<BeleggingsInstrument> zoekResultaat = new ArrayList<BeleggingsInstrument>();
        // loop door alles heen en match op symbool
        for (BeleggingsInstrument belegging : beleggingen) {
            if (belegging.getSymbool().matches(symbool.replace("%",".*"))) {
                zoekResultaat.add(belegging);
            }
        }

        // geef zoekresultaat terug
        return zoekResultaat;
    }

    // geef alle beleggingen terug
    public static Collection<BeleggingsInstrument> alleAandelen() {
        return beleggingen;
    }

    // random size picker
    public static int willekeurigAantal() {

        return 1;
    }

    static {
        Portfolio portfolio = new Portfolio();
        int randomNum;
        String[] SP500_symbols = {"AAPL", "ABT", "ABBV", "ACN", "ACE", "ADBE", "ADT", "AAP", "AES", "AET", "AFL", "AMG", "A", "GAS", "ARE", "APD", "AKAM", "AA", "AGN", "ALXN", "ALLE", "ADS", "ALL", "ALTR", "MO", "AMZN", "AEE", "AAL", "AEP", "AXP", "AIG", "AMT", "AMP", "ABC", "AME", "AMGN", "APH", "APC", "ADI", "AON", "APA", "AIV", "AMAT", "ADM", "AIZ", "T", "ADSK", "ADP", "AN", "AZO", "AVGO", "AVB", "AVY", "BHI", "BLL", "BAC", "BK", "BCR", "BXLT", "BAX", "BBT", "BDX", "BBBY", "BRK.B", "BBY", "BLX", "HRB", "BA", "BWA", "BXP", "BSX", "BMY", "BRCM", "BF.B", "CHRW", "CA", "CVC", "COG", "CAM", "CPB", "COF", "CAH", "HSIC", "KMX", "CCL", "CAT", "CBG", "CBS", "CELG", "CNP", "CTL", "CERN", "CF", "SCHW", "CHK", "CVX", "CMG", "CB", "CI", "XEC", "CINF", "CTAS", "CSCO", "C", "CTXS", "CLX", "CME", "CMS", "COH", "KO", "CCE", "CTSH", "CL", "CMCSA", "CMA", "CSC", "CAG", "COP", "CNX", "ED", "STZ", "GLW", "COST", "CCI", "CSX", "CMI", "CVS", "DHI", "DHR", "DRI", "DVA", "DE", "DLPH", "DAL", "XRAY", "DVN", "DO", "DTV", "DFS", "DISCA", "DISCK", "DG", "DLTR", "D", "DOV", "DOW", "DPS", "DTE", "DD", "DUK", "DNB", "ETFC", "EMN", "ETN", "EBAY", "ECL", "EIX", "EW", "EA", "EMC", "EMR", "ENDP", "ESV", "ETR", "EOG", "EQT", "EFX", "EQIX", "EQR", "ESS", "EL", "ES", "EXC", "EXPE", "EXPD", "ESRX", "XOM", "FFIV", "FB", "FAST", "FDX", "FIS", "FITB", "FSLR", "FE", "FISV", "FLIR", "FLS", "FLR", "FMC", "FTI", "F", "FOSL", "BEN", "FCX", "FTR", "GME", "GPS", "GRMN", "GD", "GE", "GGP", "GIS", "GM", "GPC", "GNW", "GILD", "GS", "GT", "GOOGL", "GOOG", "GWW", "HAL", "HBI", "HOG", "HAR", "HRS", "HIG", "HAS", "HCA", "HCP", "HCN", "HP", "HES", "HPQ", "HD", "HON", "HRL", "HSP", "HST", "HCBK", "HUM", "HBAN", "ITW", "IR", "INTC", "ICE", "IBM", "IP", "IPG", "IFF", "INTU", "ISRG", "IVZ", "IRM", "JEC", "JBHT", "JNJ", "JCI", "JOY", "JPM", "JNPR", "KSU", "K", "KEY", "GMCR", "KMB", "KIM", "KMI", "KLAC", "KSS", "KRFT", "KR", "LB", "LLL", "LH", "LRCX", "LM", "LEG", "LEN", "LVLT", "LUK", "LLY", "LNC", "LLTC", "LMT", "L", "LOW", "LYB", "MTB", "MAC", "M", "MNK", "MRO", "MPC", "MAR", "MMC", "MLM", "MAS", "MA", "MAT", "MKC", "MCD", "MCK", "MJN", "MMV", "MDT", "MRK", "MET", "KORS", "MCHP", "MU", "MSFT", "MHK", "TAP", "MDLZ", "MON", "MNST", "MCO", "MS", "MOS", "MSI", "MUR", "MYL", "NDAQ", "NOV", "NAVI", "NTAP", "NFLX", "NWL", "NFX", "NEM", "NWSA", "NEE", "NLSN", "NKE", "NI", "NE", "NBL", "JWN", "NSC", "NTRS", "NOC", "NRG", "NUE", "NVDA", "ORLY", "OXY", "OMC", "OKE", "ORCL", "OI", "PCAR", "PLL", "PH", "PDCO", "PAYX", "PNR", "PBCT", "POM", "PEP", "PKI", "PRGO", "PFE", "PCG", "PM", "PSX", "PNW", "PXD", "PBI", "PCL", "PNC", "RL", "PPG", "PPL", "PX", "PCP", "PCLN", "PFG", "PG", "PGR", "PLD", "PRU", "PEG", "PSA", "PHM", "PVH", "QRVO", "PWR", "QCOM", "DGX", "RRC", "RTN", "O", "RHT", "REGN", "RF", "RSG", "RAI", "RHI", "ROK", "COL", "ROP", "ROST", "RLD", "R", "CRM", "SNDK", "SCG", "SLB", "SNI", "STX", "SEE", "SRE", "SHW", "SPG", "SWKS", "SLG", "SJM", "SNA", "SO", "LUV", "SWN", "SE", "STJ", "SWK", "SPLS", "SBUX", "HOT", "STT", "SRCL", "SYK", "STI", "SYMC", "SYY", "TROW", "TGT", "TEL", "TE", "TGNA", "THC", "TDC", "TSO", "TXN", "TXT", "HSY", "TRV", "TMO", "TIF", "TWX", "TWC", "TJX", "TMK", "TSS", "TSCO", "RIG", "TRIP", "FOXA", "TSN", "TYC", "UA", "UNP", "UNH", "UPS", "URI", "UTX", "UHS", "UNM", "URBN", "VFC", "VLO", "VAR", "VTR", "VRSN", "VZ", "VRTX", "VIAB", "V", "VNO", "VMC", "WMT", "WBA", "DIS", "WM", "WAT", "ANTM", "WFC", "WDC", "WU", "WY", "WHR", "WFM", "WMB", "WEC", "WYN", "WYNN", "XEL", "XRX", "XLNX", "XL", "XYL", "YHOO", "YUM", "ZBH", "ZION", "ZTS"};

        try {
            BeleggingsInstrument belegging;

            for (String symbool : SP500_symbols) {
                belegging = portfolio.new Aandelen(symbool);
                randomNum = ((rand.nextInt(50) + 1)) * 10;
                belegging.koop(randomNum);
                beleggingen.add(belegging);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}