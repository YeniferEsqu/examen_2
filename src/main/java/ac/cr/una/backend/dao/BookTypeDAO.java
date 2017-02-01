
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
     * @param bookType
     * @return
     */
    public BookType save(BookType bookType);

    /**
     *
     * @param name
     * @return
     */
    public BookType findByName(String name);
}
