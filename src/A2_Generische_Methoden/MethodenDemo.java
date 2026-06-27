package A2_Generische_Methoden;

public class MethodenDemo {
    public static void main(String[] args) {
        String[] strings = {"Banane", "Apfel", "Kirsche", "Mango", "Erdbeere"};

        // T[]-Array vor dem Tausch ausgeben:
        for (String s : strings) {
            System.out.print(s + " ");
        }

        // Tauschen mithilfe von selbstgeschriebener Utility-Class -> ArrayUtils:
        ArrayUtils.tausche(strings, 0, strings.length-1);

        System.out.println();

        // T[]-Array nach dem Tausch ausgeben:
        for (String s : strings) {
            System.out.print(s + " ");
        }

        System.out.println();

        // Rufen Sie maximum mit drei Integer-Werten auf und geben Sie das Ergebnis aus:
        System.out.println(ArrayUtils.maximum(10,12,299));  // klappt wegen Auto-Boxing & Auto-Unboxing

        // Rufen Sie analysiere je einmal mit einem Integer-, einem Double- und einem
        // Float-Wert auf und beobachten Sie die Ausgabe:
        ZahlAnalyse.analysiereZahl(15); 
        ZahlAnalyse.analysiereZahl(15.00);
        ZahlAnalyse.analysiereZahl(15.00f);
    }
}
