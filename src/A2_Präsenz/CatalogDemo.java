package A2_Präsenz;

import java.util.Optional;

public class CatalogDemo {
    public static void main(String[] args) {
        MovieCatalog movieCatalog = new MovieCatalog();

        movieCatalog.add(new Movie("Harry Potter", 2000, 10));
        movieCatalog.add(new Movie("Game of Thrones", 2010, 7));
        movieCatalog.add(new Movie("Herr der Ringe", 1986, 6));
        movieCatalog.add(new Movie("Spongebob", 2010, 9));

        // Suchen Sie nach einem Titel, der im Katalog vorhanden ist. Verwenden Sie get(),
        // um den gefundenen Film auszugeben.
        Optional<Movie> optionalMovie1 = movieCatalog.findByTitle("Spongebob");
        System.out.println(optionalMovie1.get());

        // Suchen Sie nach einem Titel, der nicht im Katalog vorhanden ist.
        // Verwenden Sie orElse, um stattdessen die Zeichenkette "Movie not found" auszugeben.

        Optional<Movie> optionalMovie2 = movieCatalog.findByTitle("Herr der Fliegen");
        System.out.println(optionalMovie2.orElse(new Movie("Movie not found", -100000, -100000.0)));

        // Geben Sie den Titel des am besten bewerteten Films aus. Falls der Katalog leer
        // wäre, soll "Catalog is empty" ausgegeben werden – lösen Sie dies ebenfalls mit
        // orElse.
        Optional<Movie> optionalTopMovie = movieCatalog.topRated();
        System.out.println(optionalTopMovie.orElse(new Movie("Catalog is empty", -100000, -100000.0)));
    }
}