public class Ue12 {
    public static void main(String[] args) {
        System.out.println("exchangeCurrency(\"HUF\", 12) = " + exchangeCurrency("HUF", 12));
        System.out.println("exchangeCurrency(\"USD\", 12) = " + exchangeCurrency("USD", 12));
        System.out.println("exchangeCurrency(\"CAD\", 12) = " + exchangeCurrency("CAD", 12));
        System.out.println("exchangeCurrency(\"SEK\", 12) = " + exchangeCurrency("SEK", 12));
        System.out.println("exchangeCurrency(\"CHF\", 12) = " + exchangeCurrency("CHF", 12));
    }

    public static double exchangeCurrency(String currencyID, double value){
        if (currencyID.equals("HUF")){
            return value * 328.61;
        }
        if (currencyID.equals("SEK")){
            return value * 10.67;
        }
        if (currencyID.equals("USD")){
            return value * 1.12;
        }
        if (currencyID.equals("CAD")){
            return value * 1.47;
        }
        return 0; // Es muss bei einer Methode mit Rückgabetyp immer ein return geben
    }
}
