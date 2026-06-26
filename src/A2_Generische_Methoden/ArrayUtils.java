package A2_Generische_Methoden;

public class ArrayUtils {   // Utility-Klasse (eigene Hilfsklasse schreiben)


    static <T> void tausche(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static <T extends Comparable<T>> T maximum(T a, T b, T c){
        if(a.compareTo(b) >= 0) {
            if(a.compareTo(c) >= 0) {
                return a;
            } else {
                return c;
            }
        } else {
            return b;
        }
    }

}
