
package ac.cr.una.backend.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Yeni
 */

@Entity
@Table(name = "book", catalog = "progra3_exa2", uniqueConstraints = {
    @UniqueConstraint(columnNames = "id_book")})
public class Book implements Serializable {
    
     @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_book")
    private int idBook;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Author", nullable = false)
    private Author idAuthor;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_type", nullable = false)
    private BookType idType;
    
    @Column(name = "name", unique = false, nullable = false)
    private String name;
    
    @Column(name = "dateRelease", unique = false, nullable = false)
    private String contact;
    
    @Column(name = "price", unique = false, nullable = false)
    private float price;

    /**
     *
     * @param idBook
     * @param idAuthor
     * @param idType
     * @param name
     * @param contact
     * @param price
     */
    public Book(int idBook, Author idAuthor, BookType idType, String name, String contact, float price) {
        this.idBook = idBook;
        this.idAuthor = idAuthor;
        this.idType = idType;
        this.name = name;
        this.contact = contact;
        this.price = price;
    }

    /**
     *
     */
    public Book() {
    }

    /**
     *
     * @return
     */
    public int getIdBook() {
        return idBook;
    }

    /**
     *
     * @param idBook
     */
    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    /**
     *
     * @return
     */
    public Author getIdAuthor() {
        return idAuthor;
    }

    /**
     *
     * @param idAuthor
     */
    public void setIdAuthor(Author idAuthor) {
        this.idAuthor = idAuthor;
    }

    /**
     *
     * @return
     */
    public BookType getIdType() {
        return idType;
    }

    /**
     *
     * @param idType
     */
    public void setIdType(BookType idType) {
        this.idType = idType;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getContact() {
        return contact;
    }

    /**
     *
     * @param contact
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     *
     * @return
     */
    public float getPrice() {
        return price;
    }

    /**
     *
     * @param price
     */
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.idBook;
        hash = 61 * hash + Objects.hashCode(this.idAuthor);
        hash = 61 * hash + Objects.hashCode(this.idType);
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + Objects.hashCode(this.contact);
        hash = 61 * hash + Objects.hashCode(this.price);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.idBook != other.idBook) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.contact, other.contact)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        if (!Objects.equals(this.idAuthor, other.idAuthor)) {
            return false;
        }
        if (!Objects.equals(this.idType, other.idType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Book{" + "idBook=" + idBook + ", idAuthor=" + idAuthor + ", idType=" + idType + ", name=" + name + ", contact=" + contact + ", price=" + price + '}';
    }
    
    
}
