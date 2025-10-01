public class Movie extends MediaItem {
    private String director;
    private int year;
    private int runtimeMinutes;
    private String movieId;
    public static int movieCount = 0;

    public Movie(int id, String title, String director, int year, int runtimeMinutes) {
        super(id, title);
        this.director = director;
        this.year = year;
        this.runtimeMinutes = runtimeMinutes;
        this.movieId = "MV-" + String.valueOf(Movie.movieCount);
        Movie.movieCount++;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public int getRuntimeMinutes() {
        return runtimeMinutes;
    }

    @Override
    public String summary() {
        return "Movie," + getId() + "," + getTitle() + "," + director + "," + year + "," + runtimeMinutes;
    }

    @Override
    public String toString() {
        return summary();
    }
}
