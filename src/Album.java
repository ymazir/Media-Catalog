public class Album extends MediaItem {

    private String artist;
    private int year;
    private int trackCount;
    private String albumId;
    private static int albumCount = 0;

    public Album(int id, String title, String artist, int year, int trackCount) {
        super(id, title);
        this.artist = artist;
        this.year = year;
        this.trackCount = trackCount;
        this.albumId = "AL-" + String.valueOf(Album.albumCount);
        Album.albumCount++;

    }

    public String getArtist() {
        return artist;
    }
    public int getYear() {
        return year;
    }
    public int getTrackCount() {
        return trackCount;
    }


    @Override
    public String summary() {
        return "Album," + getId() + "," + getTitle() + "," + artist + "," + year + "," + trackCount;
    }

    @Override
    public String toString() {
        return summary();
    }
}
