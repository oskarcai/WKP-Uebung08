package A1_Generische_Stapelklasse;

public class ZahlStapel<T extends Number> extends Stapel<T> {

    // Implementieren Sie die Methode double summe(): Alle Elemente in elemente werden
    // durchlaufen und deren Summe wird als double zurückgegeben.
    double summe() {
        double sum = 0.0;
        for(T number : elemente) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // Implementieren Sie die Methode double durchschnitt(): Gibt den Durchschnittswert
    // aller Elemente zurück. Sie dürfen davon ausgehen, dass der Stapel nicht leer ist.
    double durchschnitt() {
        return summe() / groesse();
    }


}
