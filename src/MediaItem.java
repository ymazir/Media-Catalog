public abstract class MediaItem {
    private String id;
    private String title;

    public MediaItem(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public abstract String summary();
}
