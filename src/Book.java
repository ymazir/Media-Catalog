/**
 * Class representing a book in a media library.
 *
 */

public class Book extends MediaItem {
    /**
     * Author of the book.
     */
    private String author;
    /**
     * Year of publication.
     */
    private int year;
    /**
     * Number of pages in the book.
     */
    private int pageCount;
    /**
     * Unique book identifier.
     */
    private String bookId;
    /**
     * Static counter to generate unique book IDs.
     */
    public static int bookCount = 1;


    /**
     * Constructor for Book.
     * @param id
     * @param title
     * @param author
     * @param year
     * @param pageCount
     */
    public Book(int id, String title, String author, int year, int pageCount) {
        super(id, title);
        this.author = author;
        this.year = year;
        this.pageCount = pageCount;
        this.bookId = "BK-" + String.valueOf(Book.bookCount);
        Book.bookCount++;
    }

    /**
     * Get the author of the book.
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Get the year of publication.
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * Get the number of pages in the book.
     * @return pageCount
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * Get the unique book identifier.
     * @return bookId
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * Get a summary of the book.
     * @return summary of the book object.
     */

    @Override
    public String summary() {
        return "Book," + getBookId() + "," + getTitle() + "," + author + "," + year + "," + pageCount;
    }

    /**
     * String representation of the book.
     * @return string
     */
    @Override
    public String toString() {
        return summary();
    }
}
