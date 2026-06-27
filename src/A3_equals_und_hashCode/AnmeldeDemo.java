package A3_equals_und_hashCode;

public class AnmeldeDemo {
    public static void main(String[] args) {

        Anmeldeliste anmeldeliste = new Anmeldeliste();
        anmeldeliste.eintraege.add(new Anmeldung("12345", "Anna")); // ILIAS
        anmeldeliste.eintraege.add(new Anmeldung("12345", "Anna Schmidt")); // KLIPS
        anmeldeliste.eintraege.add(new Anmeldung("67890", "Ben")); //ILIAS
        anmeldeliste.eintraege.add(new Anmeldung("67890", "Benjamin Mueller")); // KLIPS
        anmeldeliste.eintraege.add(new Anmeldung("11111", "Clara Weber")); // nur KLIPS

        // Anzahl der Anmeldeeinträge vor bereinigen()
        System.out.println(anmeldeliste.anzahl());

        // Anzahl der Anmeldeeinträge nach bereinigen()
        anmeldeliste.bereinigen();
        System.out.println(anmeldeliste.anzahl());

        // Ausgabe der verbleibenden Anmeldeeinträge:
        for(Anmeldung a : anmeldeliste.eintraege) {
            System.out.println(a);
        }

        /*
        (d) Beantworten Sie die folgenden Fragen:
            – Warum wird equals auf der matrikelnummer und nicht auf dem name definiert?
            – Welches Problem entstünde, wenn hashCode nicht mit equals übereinstimmt–
            beispielsweise, wenn Anmeldung-Objekte in einem HashSet gespeichert werden?

            -> unsere equals()-Logik bezieht sich auf ILIAS und KLIPS.
            Zwei Anmeldungen sind also dieselben (bzw. von derselben Person), wenn die Matrikelnummer dieselbe ist.
            -> Wenn hashCode() nicht mit equals() übereinstimmt - also andere Felder als Übergabeparameter aufnimmt,
            als die, die in der equals()-Logik definiert sind - dann würden Duplikate von einer Datenstruktur wie
            HashSet nicht korrekt erkannt werden. Somit würden Anmeldungen potenziell doppelt gespeichert werden
            - trotz gleicher Matrikelnummer.

         */
    }
}
