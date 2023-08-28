import entity.Book;
import entity.Library;

import java.util.ArrayList;

/**
 * Handler class for library management system
 *
 * @author Swaraj Kokate
 */
public class Main {

    public static void main(String[] args) {
        Library library = new Library(new ArrayList<>());

        //Add a book
        boolean isBookAdded = library.addBook(new Book("Shiv-Charitra-Manas", "XYZ", 2019));
        System.out.println(isBookAdded ? "Book was added successfully" : "Book was not added");

        //Retrieve books from library
        System.out.println(
                        library.getTotalBooks().isEmpty() ?
                        "There are no books currently in the library" :
                        library.getTotalBooks()
        );

        //Search by title and author
        System.out.println(
                        library.searchByTitleAndAuthor("Shiv-Charitra-Manas", "XYZ").isEmpty() ?
                        "There are no books currently in the library with specified title or author" :
                        library.searchByTitleAndAuthor("Shiv-Charitra-Manas", "XYZ")
        );
    }
}