
package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.BookType;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Yeni
 */


public class BookTypeDAOImpl implements BookTypeDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();
    
    @Override
    public boolean deleteAll() {
        boolean isDeleted = false;
        List<BookType> authorContactList = new ArrayList<>();
        session.beginTransaction();
        authorContactList = session.createCriteria(BookType.class).list();
        for (Object obj : authorContactList) {
            session.delete(obj);
            isDeleted = true;
        }
        session.getTransaction().commit();
        return isDeleted;
    }

    @Override
    public BookType save(BookType bookType) {
        session.beginTransaction();
        session.save(bookType);
        session.getTransaction().commit();

        return bookType;
    }

    @Override
    public BookType findByName(String type) {
         BookType author = null;
        Query query = session.createQuery("from booktype where type=:type");
        query.setParameter("type", type);
        
        if (query.list().size() > 0) {
            author = (BookType) query.list().get(0);
        }
        return author;
    }
   
}
