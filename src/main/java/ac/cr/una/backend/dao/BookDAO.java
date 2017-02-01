 
package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.Book;
import java.util.List;

/**
 *
 * @author Yeni
 */


public interface BookDAO {
     /**
     *
     * @return
     */
    public boolean deleteAll();

    /**
     *
     * @param authorContact
     * @return
     */
    public Book save(Book authorContact);
    public List<Book> findAll();
    public float totalPriceAll();
}
