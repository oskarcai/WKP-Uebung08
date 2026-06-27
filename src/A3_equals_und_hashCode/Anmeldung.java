package A3_equals_und_hashCode;

import java.util.Objects;

public class Anmeldung {
    private String matrikelnummer;
    private String name;

    public Anmeldung(String matrikelnummer, String name) {
        this.matrikelnummer = matrikelnummer;
        this.name = name;
    }

    @Override // equals(Object obj) überschreiben:
    public boolean equals(Object obj) {
        if(obj == null) return false; // Null-Check! (immer zuerst, wenn man equals() überschreibt)
        if(obj == this) return true;  // ein und dasselbe Objekt natürlich gleich
        if(!(obj instanceof Anmeldung)) return false; // Typ-Check (ob übergebenes Objekt obj ein (Sub-)Typ der Klasse ist

        Anmeldung other = (Anmeldung) obj;  // Cast
        return this.matrikelnummer.equals(other.matrikelnummer); // eigentliche equals()-Logik (selbst definiert!)
    }

    @Override // hashCode() überschreiben:
    public int hashCode() {
        return Objects.hash(matrikelnummer);    // nur die Felder (Attribute), die in der equals()-Logik stecken
    }

    @Override // toString() überschreiben:
    public String toString() {
        return name + " [" + matrikelnummer + "]";
    }

    // Getter:
    public String getMatrikelnummer() {
        return matrikelnummer;
    }
    public String getName() {
        return name;
    }
}
