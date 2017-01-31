
package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.Author;

/**
 *
 * @author Yeni
 */


public interface AuthorDAO {

    /**
     *
     * @param name
     * @return
     */
    public Author findByName(String name);
}
