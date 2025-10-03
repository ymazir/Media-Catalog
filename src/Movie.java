/**
 * Class representing a movie item in a media library.
 */
public class Movie extends MediaItem {
    /**
     * Director of the movie.
     */
    private String director;
    /**
     * Year of release.
     */
    private int year;
    /**
     * Runtime in minutes.
     */
    private int runtimeMinutes;
    /**
     * Unique movie identifier.
     */
    private String movieId;
    /**
     * Static counter to generate unique movie IDs.
     */
    public static int movieCount = 1;

    /**
     * Constructor for Movie.
     * @param id
     * @param title
     * @param director
     * @param year
     * @param runtimeMinutes
     */

    public Movie(int id, String title, String director, int year, int runtimeMinutes) {
        super(id, title);
        this.director = director;
        this.year = year;
        this.runtimeMinutes = runtimeMinutes;
        this.movieId = "MV-" + String.valueOf(Movie.movieCount);
        Movie.movieCount++;
    }

    /**
     * Get the director of the movie.
     * @return director
     */
    public String getDirector() {
        return director;
    }
    /**
     * Get the year of release.
     * @return year
     */

    public int getYear() {
        return year;
    }
    /**
     * Get the runtime in minutes.
     * @return runtimeMinutes
     */

    public int getRuntimeMinutes() {
        return runtimeMinutes;
    }
    /**
     * Get the unique movie identifier.
     * @return movieId
     */
    public String getMovieId() {
        return movieId;
    }
    /**
     * Get a summary of the movie.
     * @return summary
     */
    @Override
    public String summary() {
        return "Movie," + getMovieId() + "," + getTitle() + "," + director + "," + year + "," + runtimeMinutes;
    }
    /** Override toString to return the summary of the movie.
     * @return summary
     */
    @Override
    public String toString() {
        return summary();
    }
}
