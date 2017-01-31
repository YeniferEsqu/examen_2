
package ac.cr.una.backend.service;

import ac.cr.una.backend.model.Author;
import ac.cr.una.backend.model.AuthorContact;
import java.util.List;

/**
 *
 * @author Yeni
 */


public interface AuthorService {
    
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
    AuthorContact save(AuthorContact authorContact);

    /**
     *
     * @return
     */
    List<AuthorContact> findAll();

    /**
     *
     * @param name
     * @return
     */
    Author findByName(String name);
    
}
