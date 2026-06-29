package A2_Präsenz;

public class Movie {
    private String title;
    private int releaseYear;
    private double rating;

    public Movie(String title, int releaseYear, double rating) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    // Getter
    public String getTitle() {
        return title;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public double getRating() {
        return rating;
    }

     @Override
    public String toString() {
        return "Titel: " + title + " | Erscheinungsjahr: " + releaseYear + " | Rating: " + rating;
     }
}
