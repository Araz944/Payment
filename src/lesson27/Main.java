package lesson27;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setAuthor("my friend");
        book1.setTitle("Dogs and cats");
        book1.setStatus(BookStatus.BORROWED);
        book1.borrowBook();
        System.out.println("The book's title is " + book1.getTitle() + ", written by " + book1.getAuthor() + " and " +
                "is " + book1.getStatus());
    }
}
