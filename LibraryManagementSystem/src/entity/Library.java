package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * A class for managing books in a library
 *
 * @author Swaraj Kokate
 */
public class Library {

    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getTotalBooks() {
        return books;
    }

    /**
     * Returns searched books for which the title and author matches
     *
     * @param title Title of the book
     * @param author Author of the book
     * @return list of searched books
     */
    public List<Book> searchByTitleAndAuthor(String title, String author) {
        List<Book> searchedBooks = new ArrayList<>();

        for(Book book : this.books) {
            if(book.getTitle().equals(title) || book.getAuthor().equals(author)) {
                searchedBooks.add(book);
            }
        }

        return searchedBooks;
    }

    public boolean addBook(Book book) {
        return this.books.add(book);
    }
}
