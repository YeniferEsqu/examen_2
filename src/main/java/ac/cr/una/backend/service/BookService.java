 
package ac.cr.una.backend.service;

import ac.cr.una.backend.model.Book;
import java.util.List;

/**
 *
 * @author Yeni
 */


public interface BookService {
     public boolean deleteAll();

    /**
     *
     * @param authorContact
     * @return
     */
    public Book save(Book authorContact);
    public List<Book> findAll();
}
