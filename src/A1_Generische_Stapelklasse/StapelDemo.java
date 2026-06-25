package A1_Generische_Stapelklasse;

public class StapelDemo {
    public static void main(String[] args) {


        // Legen Sie einen Stapel<String> an. Legen Sie drei Zeichenketten nach Wahl auf
        // den Stapel. Geben Sie anschließend alle Elemente durch wiederholte Aufrufe von
        // entnehmen() auf der Konsole aus.
        Stapel<String> stringStapel = new Stapel<>();

        stringStapel.ablegen("Oskar!");
        stringStapel.ablegen("Ich heiße");
        stringStapel.ablegen("Hallo,");

        while (!(stringStapel.istLeer())) {
            System.out.println(stringStapel.entnehmen());

        }

        // Legen Sie einen ZahlStapel<Integer> an, befüllen Sie ihn mit den Werten 4, 7, 9
        // und geben Sie Summe sowie Durchschnitt aus.
        ZahlStapel<Integer> integerStapel = new ZahlStapel<>();

        integerStapel.ablegen(4);   // Auto-Boxing: int -> Integer
        integerStapel.ablegen(7);
        integerStapel.ablegen(9);

        if (!(integerStapel.istLeer())) {
            System.out.println("Summe aller Integer-Objekte in ZahlStapel" + integerStapel.summe());
            System.out.println("Durchschnitt aller Integer-Objekte in ZahlStapel" + integerStapel.durchschnitt());
        }

        /*
        (d) Beantworten Sie die folgenden Fragen:
            – WarumführtZahlStapel<String> zu einem Compilerfehler, ZahlStapel<Integer> jedoch nicht?
            – Welchen Vorteil bietet die Einschränkung <T extends Number> gegenüber
                der direkten Verwendung von Number als Parametertyp–
                also etwa void ablegen(Number element)


            -> ZahlStapel<String> führt im Gegensatz zu ZahlStapel<Integer> bereits zu einem Compilerfehler,
                aufgrund der für die Klasse ZahlStapel definierten Einschränkung des Typparameters <T extends Number>.
                Damit kann ein ZahlStapel-Objekt bzw. das Attribut ArrayList<T> elemente (was ZahlStapel von Stapel erbt),
                von diesem Objekt nur noch Objekte speichern, die Subtypen von der abstrakten Klasse Number sind (u.a. Integer-Objekte).

            -> Die Einschränkung des Typparameters <T extends Number> ermöglicht, dass
                unsere ZahlStapel im Falle von ZahlStapel<Integer> auch tatsächliche
                Integer-Objekte mit Integer-Referenzen speichern.

                Bei der direkten Verwendung von Number als Referenztyp (z.B.: void ablegen(Number element))
                können wir mit der Methode zwar immer noch Integer-Objekte (aufgrund Subtyppolymorphie)
                im ZahlStapel ablegen, aber auch alle anderen Objekttypen, die von Number erben (z.B. Double-Objekte).
                Damit wäre Typsicherheit nicht mehr zwingend garantiert.
                Zudem wären die dynamischen Objekttypen zur Laufzeit zwar ggf. Integer-Objekte,
                hätten aber als Referenztyp immer noch Number.
         */

    }
}
