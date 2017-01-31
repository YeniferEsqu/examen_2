
package ac.cr.una.backend.service;

import ac.cr.una.backend.dao.AuthorContactDAO;
import ac.cr.una.backend.dao.AuthorDAO;
import ac.cr.una.backend.model.Author;
import ac.cr.una.backend.model.AuthorContact;
import java.util.List;

/**
 *
 * @author Yeni
 */


public class AuthorServiceImpl implements AuthorService {
    AuthorDAO authorDAO;
    AuthorContactDAO authorContactDAO;

    /**
     *
     * @param authorDAO
     */
    public AuthorServiceImpl(AuthorDAO authorDAO) {
        this.authorDAO = authorDAO;
    }

    /**
     *
     * @param authorContactDAO
     */
    public AuthorServiceImpl(AuthorContactDAO authorContactDAO) {
        this.authorContactDAO = authorContactDAO;
    }

    /**
     *
     * @param authorDAO
     * @param authorContactDAO
     */
    public AuthorServiceImpl(AuthorDAO authorDAO, AuthorContactDAO authorContactDAO) {
        this.authorDAO = authorDAO;
        this.authorContactDAO = authorContactDAO;
    }

    /**
     *
     */
    public AuthorServiceImpl() {
    }

    @Override
    public boolean deleteAll() {
       return authorContactDAO.deleteAll();
    }

    @Override
    public AuthorContact save(AuthorContact authorContact) {
        return authorContactDAO.save(authorContact);
    }

    @Override
    public List<AuthorContact> findAll() {
        return authorContactDAO.findAll();
    }

    @Override
    public Author findByName(String name) {
        return authorDAO.findByName(name);
    }
            
    
}

