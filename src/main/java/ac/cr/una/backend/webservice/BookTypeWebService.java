 
package ac.cr.una.backend.webservice;

import ac.cr.una.backend.dao.BookTypeDAO;
import ac.cr.una.backend.dao.BookTypeDAOImpl;
import ac.cr.una.backend.model.BookType;
import ac.cr.una.backend.service.BookTypeService;
import ac.cr.una.backend.service.BookTypeServiceImpl;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author Yeni
 */

@Path("booktypes")
public class BookTypeWebService {
   private BookTypeDAO bookDAO;
   private BookTypeService service;
   
   @Context
    private UriInfo context;

    /**
     *
     */
    public BookTypeWebService() {
    }
   
    /**
     *
     * @param type
     * @return
     */
    @GET
    @Path("/{type}")
    @Produces(MediaType.APPLICATION_JSON)
    public BookType getBookByType(@PathParam("type") String type) {
        BookType book = null;
        bookDAO = new BookTypeDAOImpl();
        service = new BookTypeServiceImpl(bookDAO);

        book = service.findByName(type);

        return book;
    }
    
    /**
     *
     * @return
     */
    @DELETE
    @Path("/")
    public boolean deleteAll() {
        boolean result;
        bookDAO = new BookTypeDAOImpl();
        service = new BookTypeServiceImpl(bookDAO);

        result = service.deleteAll();

        return result;
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
    public BookType createBookType(BookType book) {

        bookDAO = new BookTypeDAOImpl();
        service = new BookTypeServiceImpl(bookDAO);

        book = service.save(book);

        return book;
    }
    
    
}
