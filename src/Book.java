public class Book extends MediaItem {
    private String author;
    private int year;
    private int pageCount;
    private String bookId;
    public static int bookCount = 1;


    public Book(int id, String title, String author, int year, int pageCount) {
        super(id, title);
        this.author = author;
        this.year = year;
        this.pageCount = pageCount;
        this.bookId = "BK-" + String.valueOf(Book.bookCount);
        Book.bookCount++;
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

    public String getBookId() {
        return bookId;
    }

    @Override
    public String summary() {
        return "Book," + getBookId() + "," + getTitle() + "," + author + "," + year + "," + pageCount;
    }

    @Override
    public String toString() {
        return summary();
    }
}
