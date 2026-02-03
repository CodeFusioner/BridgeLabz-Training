package streamApi;

import java.util.List;
import static java.lang.System.*;
import static java.util.Comparator.comparing;

class Movie {
    String name;
    double rating;
    int releaseYear;

    Movie(String name, double rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return name + " (" + rating + ", " + releaseYear + ")";
    }

    public double getRating() {
        return rating;
    }
    public int getReleaseYear(){
        return releaseYear;
    }
}

public class MovieDemo {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("Movie A", 9.0, 2024),
                new Movie("Movie B", 8.5, 2023),
                new Movie("Movie C", 9.2, 2022),
                new Movie("Movie D", 8.9, 2024),
                new Movie("Movie E", 9.1, 2023),
                new Movie("Movie F", 8.8, 2021)
        );
        movies.stream().sorted(comparing(Movie::getRating).reversed().thenComparing(Movie::getReleaseYear).reversed()).limit(5).forEach(out::println);
    }
}
