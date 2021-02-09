import org.junit.Before;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("The Art of War", "Sun Tzu", "Non-fiction");
    }

}
