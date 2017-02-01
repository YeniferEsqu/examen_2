package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.Book;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Yeni
 */
public class BookDAOImpl implements BookDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public boolean deleteAll() {
        boolean isDeleted = false;
        List<Book> bookList = new ArrayList<>();
        session.beginTransaction();
        bookList = session.createCriteria(Book.class).list();
        for (Object obj : bookList) {
            session.delete(obj);
            isDeleted = true;
        }
        session.getTransaction().commit();
        return isDeleted;
    }

    @Override
    public Book save(Book book) {
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();

        return book;
    }

    @Override
    public List<Book> findAll() {
        List<Book> book = new ArrayList<>();

        book = session.createCriteria(Book.class).list();

        return book;
    }

    

}
