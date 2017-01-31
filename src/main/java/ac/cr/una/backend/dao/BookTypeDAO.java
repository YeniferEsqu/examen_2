
package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.BookType;

/**
 *
 * @author Yeni
 */


public interface BookTypeDAO {

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
    public BookType save(BookType authorContact);

    /**
     *
     * @param name
     * @return
     */
    public BookType findByName(String name);
}
