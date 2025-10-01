public class Book extends MediaItem {
    private String author;
    private int year;
    private int pageCount;


    public Book(String id, String title, String author, int year, int pageCount) {
        super(id, title);
        this.author = author;
        this.year = year;
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String summary() {
        return "Book," + getId() + "," + getTitle() + "," + author + "," + year + "," + pageCount;
    }

    @Override
    public String toString() {
        return summary();
    }
}
