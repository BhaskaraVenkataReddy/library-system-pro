package service;

import model.Book;
import exception.BookNotAvailableException;
import java.util.*;

public class LibraryService {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(int id) throws BookNotAvailableException {
        for (Book b : books) {
            if (b.getId() == id && !b.isIssued()) {
                b.setIssued(true);
                return;
            }
        }
        throw new BookNotAvailableException("Book not available");
    }

    public List<Book> getBooks() {
        return books;
    }
}
