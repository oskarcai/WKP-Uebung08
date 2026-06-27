package A3_equals_und_hashCode;

import java.util.ArrayList;
import java.util.List;

public class Anmeldeliste {
    List<Anmeldung> eintraege = new ArrayList<>();

    void eintragen(Anmeldung a) {
        eintraege.add(a);
    }

    String nachschlagen(String matrikelnummer) {
        for (Anmeldung a : eintraege) {
            if (a.getMatrikelnummer().equals(matrikelnummer)) return a.getName();
        }
        return null;
    }

    void bereinigen() {
        List<Anmeldung> zuEntfernen = new ArrayList<>();

        for (Anmeldung a : eintraege) {
            for (Anmeldung b : eintraege) {

                if (a.equals(b) && a != b) { // wenn gleiche Matrik.Nr., unterschiedliche Anmeldung-Objekte
                    boolean bIstBesser = b.getName().length() > a.getName().length();
                    boolean gleichLangAberBVorA = b.getName().length() == a.getName().length()
                                                    && eintraege.indexOf(b) < eintraege.indexOf(a);

                    if (bIstBesser || gleichLangAberBVorA) {
                        zuEntfernen.add(a); // a ist raus - weiter mit nächstem Anmeldung-Objekt a
                        break;  // weil wir bereits ein Annmeldung-Objekt b gefunden haben (mit gleicher Matr.Nr. wie a)
                                // und längerem Namen als a -> wird also entfernt
                    }
                }
            }
        }
        eintraege.removeIf(e -> {
            for(Anmeldung z : zuEntfernen) {
                if (e == z) return true; // exakt dasselbe Objekt?
            }
            return false;
        });
        /*
                // Was removeIf intern macht (vereinfacht):
            for (Anmeldung e : eintraege) {
                if (deine Lambda-Logik mit e) {
                        // e entfernen
                    }
                }
         */
    }

    int anzahl() {
        return eintraege.size();
    }
}
