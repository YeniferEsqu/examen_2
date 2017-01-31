package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.AuthorContact;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Yeni
 */
public class AuthorContactDAOImpl implements AuthorContactDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    /**
     *
     * @return
     */
    @Override
    public boolean deleteAll() {
        boolean isDeleted = false;
        String stringQuery = "DELETE FROM authorcontact";
        Query query = session.createQuery(stringQuery);
        isDeleted = true;
        query.executeUpdate();
        return isDeleted;
    }

    /**
     *
     * @param authorContact
     * @return
     */
    @Override
    public AuthorContact save(AuthorContact authorContact) {
        session.beginTransaction();
        session.save(authorContact);
        session.getTransaction().commit();

        return authorContact;
    }

    /**
     *
     * @return
     */
    @Override
    public List<AuthorContact> findAll() {
       List<AuthorContact> authorContactList = new ArrayList<>();

        authorContactList = session.createCriteria(AuthorContact.class).list();

        return authorContactList;
    }

}
