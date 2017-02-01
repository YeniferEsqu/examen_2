package ac.cr.una.backend.service;

import ac.cr.una.backend.dao.BookDAO;
import ac.cr.una.backend.model.Book;
import java.util.List;

/**
 *
 * @author Yeni
 */
public class BookServiceImpl implements BookService {

    BookDAO bookDAO;

    public BookServiceImpl(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    public boolean deleteAll() {
        return bookDAO.deleteAll();
    }

    @Override
    public Book save(Book authorContact) {
        return bookDAO.save(authorContact);
    }

    @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

}
