package lesson27;

public class Book implements IBook {
    private String title;
    private String author;
    private BookStatus status;

    @Override
    public void borrowBook() {
        if (this.status == BookStatus.AVAILABLE) {
            setStatus(BookStatus.BORROWED);
        }
        else {
            throw new OutOfStockException("The book is out of stock");
        }
    }

    @Override
    public void returnBook() {
        if (this.status == BookStatus.BORROWED) {
            setStatus(BookStatus.AVAILABLE);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }
}
