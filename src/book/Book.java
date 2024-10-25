package book;

public class Book implements Displayable {
    private String bookName;
    private String author;
    private String yearOfBook;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearOfBook() {
        return yearOfBook;
    }

    public void setYearOfBook(String yearOfBook) {
        this.yearOfBook = yearOfBook;
    }

    @Override
    public void display() {
        System.out.println(this.bookName + " " + this.author + " " + this.yearOfBook);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", yearOfBook='" + yearOfBook + '\'' +
                '}';
    }
}
