package A2_Generische_Methoden;

public class ZahlAnalyse {

    static <T extends Number> void analysiereZahl(T zahl) {
        System.out.println("Klassenname: " + zahl.getClass().getSimpleName());
        System.out.println(zahl);

        if(zahl instanceof Float || zahl instanceof Double) {
            System.out.println("Achtung: Gleitkommazahl- moegliche Rundungsfehler!");
        }
    }
}
