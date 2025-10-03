/**
 * Album class represents a music album.
 */
public class Album extends MediaItem {

    /**
     * Artist of the album.
     */
    private String artist;
    /**
     * Year of release.
     */
    private int year;
    /**
     * Number of tracks in the album.
     */
    private int trackCount;
    /**
     * Unique album identifier.
     */
    private String albumId;
    /**
     * Static counter to generate unique album IDs.
     */
    private static int albumCount = 1;
    /**
     * Constructor for Album.
     * @param id
     * @param title
     * @param artist
     * @param year
     * @param trackCount
     */

    public Album(int id, String title, String artist, int year, int trackCount) {
        super(id, title);
        this.artist = artist;
        this.year = year;
        this.trackCount = trackCount;
        this.albumId = "AL-" + String.valueOf(Album.albumCount);
        Album.albumCount++;

    }
    /**
     * Get the artist of the album.
     * @return artist
     */

    public String getArtist() {
        return artist;
    }
    /**
     * Get the year of release.
     * @return year
     */
    public int getYear() {
        return year;
    }
    /**
     * Get the number of tracks in the album.
     * @return trackCount
     */
    public int getTrackCount() {
        return trackCount;
    }
    /**
     * Get the unique album identifier.
     * @return albumId
     */
    public String getAlbumId() {
        return albumId;
    }

/**
     * Get a summary of the album.
     * @return summary
     */
    @Override
    public String summary() {
        return "Album," + getAlbumId() + "," + getTitle() + "," + artist + "," + year + "," + trackCount;
    }
/**
     * Override toString method to return the summary of the album.
     * @return summary
     */
    @Override
    public String toString() {
        return summary();
    }
}
