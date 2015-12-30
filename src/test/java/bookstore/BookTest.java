package bookstore;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by vrodriguez on 12/29/15.
 */
public class BookTest {

    @Test
    public void shouldCreateABookWithParameters(){
        Book book = new Book("autor","titulo");
        assertNotNull(book);
    }

    @Test
    public void shouldCreateABookWithoutParameters(){
        Book book = new Book();
        assertNotNull(null);
    }


}
