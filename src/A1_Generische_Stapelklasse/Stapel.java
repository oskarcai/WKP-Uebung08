package A1_Generische_Stapelklasse;

import java.util.ArrayList;

public class Stapel<T> {        // Generische Klasse
    ArrayList<T> elemente = new ArrayList<>();


    // * void ablegen(T element): Legt element oben auf den Stapel
    // (d.h. am Ende der internen Liste).
    void ablegen(T element) {
        elemente.add(elemente.size(), element);
    }

    // * T entnehmen(): Entfernt das oberste Element und gibt es zurück.
    // Sie dürfen davon ausgehen, dass der Stapel nicht leer ist.
    T entnehmen() {
        return elemente.remove(elemente.size() - 1);    // entfernt das letzte Element der Liste und gibt es zurück
    }

    // * T ansehen(): Gibt das oberste Element zurück, ohne es zu entfernen.
    // Sie dürfen davon ausgehen, dass der Stapel nicht leer ist.
    T ansehen() {
        return elemente.get(elemente.size() - 1);
    }

    // * boolean istLeer(): Gibt true zurück, falls der Stapel keine Elemente enthält.
    boolean istLeer() {
        return elemente.isEmpty();
    }

    // * int groesse(): Gibt die aktuelle Anzahl der Elemente zurück.
    int groesse() {
        return elemente.size();
    }
}
