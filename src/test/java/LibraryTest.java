import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(1);
        book = new Book("The Art of War", "Sun Tzu", "Non-fiction");
    }

    @Test
    public void numberOfBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void libraryIsFullOfBooks(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }
}
