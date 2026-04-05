import service.LibraryService;
import model.Book;
import exception.BookNotAvailableException;

public class Main {
    public static void main(String[] args) {
        LibraryService service = new LibraryService();
        service.addBook(new Book(1, "Clean Code", "Robert Martin"));

        try {
            service.issueBook(1);
            System.out.println("Book issued successfully");
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
