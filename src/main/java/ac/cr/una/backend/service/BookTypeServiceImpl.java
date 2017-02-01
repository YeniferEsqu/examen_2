 
package ac.cr.una.backend.service;

import ac.cr.una.backend.dao.BookTypeDAO;
import ac.cr.una.backend.model.BookType;

/**
 *
 * @author Yeni
 */

public class BookTypeServiceImpl implements BookTypeService {

    private BookTypeDAO bookTypeDAO;

    /**
     *
     * @param bookTypeDAO
     */
    public BookTypeServiceImpl(BookTypeDAO bookTypeDAO) {
        this.bookTypeDAO = bookTypeDAO;
    }
   
    
    @Override
    public boolean deleteAll() {
      return bookTypeDAO.deleteAll();
    }

    @Override
    public BookType save(BookType bookType) {
        return bookTypeDAO.save(bookType);
    }

    @Override
    public BookType findByName(String name) {
        return bookTypeDAO.findByName(name);
    }
    
}
