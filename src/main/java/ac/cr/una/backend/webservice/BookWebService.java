package ac.cr.una.backend.webservice;

import ac.cr.una.backend.dao.BookDAO;
import ac.cr.una.backend.dao.BookDAOImpl;
import ac.cr.una.backend.model.Book;
import ac.cr.una.backend.service.BookService;
import ac.cr.una.backend.service.BookServiceImpl;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author Yeni
 */
@Path("books")
public class BookWebService {

    private BookDAO bookDAO;
    private BookService service;

    @Context
    private UriInfo context;

    /**
     *
     */
    public BookWebService() {
    }

    /**
     *
     * @return
     */
    @DELETE
    @Path("/")
    public boolean deleteAll() {
        boolean result;
        bookDAO = new BookDAOImpl();
        service = new BookServiceImpl(bookDAO);

        result = service.deleteAll();

        return result;
    }

    /**
     *
     * @return
     */
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> findAll() {
        List<Book> authorList = null;
        bookDAO = new BookDAOImpl();
        service = new BookServiceImpl(bookDAO);

        authorList = service.findAll();

        return authorList;
    }

    /**
     *
     * @param book
     * @return
     */
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Book save(Book book) {

        bookDAO = new BookDAOImpl();
        service = new BookServiceImpl(bookDAO);

        book = service.save(book);

        return book;
    }
//
//    /**
//     *
//     * @return
//     */
//    @GET
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public float totalPriceAll() {
//        float price;
//        bookDAO = new BookDAOImpl();
//        service = new BookServiceImpl(bookDAO);
//
//        price = service.totalPriceAll();
//
//        return price;
//    }

}
