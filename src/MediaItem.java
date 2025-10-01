public abstract class MediaItem {
    private int id;
    private String title;

    public MediaItem(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public abstract String summary();
}
