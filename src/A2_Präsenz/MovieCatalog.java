package A2_Präsenz;

import java.util.ArrayList;
import java.util.Optional;

public class MovieCatalog {
    private ArrayList<Movie> movies = new ArrayList<>();

    public void add(Movie m) {
        movies.add(m);
    }

    public Optional<Movie> findByTitle(String title) {
        for(Movie m : movies) {
            if(m.getTitle().equalsIgnoreCase(title)) {
                return Optional.of(m);
            }
        }
        return Optional.empty();
    }

    public Optional<Movie> topRated() {
        if (movies.isEmpty()) return Optional.empty();

        Movie topRated = movies.get(0);
        for (Movie m : movies) {
            if (m.getRating() > topRated.getRating()) {
                topRated = m;
            }
        }

        return Optional.of(topRated);
    }
}
