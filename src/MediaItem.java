/**
 * Abstract class representing a media item.
 */
public abstract class MediaItem {

    /**
     * Unique identifier for the media item.
     */
    private int id;
    /**
     * Title of the media item.
     */
    private String title;

    /**
     * Constructor for MediaItem.
     * @param id
     * @param title
     */
    public MediaItem(int id, String title) {
        this.id = id;
        this.title = title;
    }

    /**
     * Get the ID of the media item.
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Get the title of the media item.
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Abstract method to get a summary of the media item.
     * @return summary
     */

    public abstract String summary();
}
