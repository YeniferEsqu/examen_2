
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
@Table(name = "authorcontact", catalog = "progra3_exa2", uniqueConstraints = {
    @UniqueConstraint(columnNames = "id_authorContact")})
public class AuthorContact implements Serializable {
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_authorContact")
    private int idAuthorContact;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Author", nullable = false)
    private Author idAuthor;

    @Column(name = "contact", unique = false, nullable = false)
    private String contact;

    @Column(name = "type", unique = false, nullable = false)
    private String type;

    /**
     *
     * @param idAuthorContact
     * @param idAuthor
     * @param contact
     * @param type
     */
    public AuthorContact(int idAuthorContact, Author idAuthor, String contact, String type) {
        this.idAuthorContact = idAuthorContact;
        this.idAuthor = idAuthor;
        this.contact = contact;
        this.type = type;
    }

    /**
     *
     */
    public AuthorContact() {
    }

    /**
     *
     * @return
     */
    public int getIdAuthorContact() {
        return idAuthorContact;
    }

    /**
     *
     * @param idAuthorContact
     */
    public void setIdAuthorContact(int idAuthorContact) {
        this.idAuthorContact = idAuthorContact;
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
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.idAuthorContact;
        hash = 31 * hash + Objects.hashCode(this.idAuthor);
        hash = 31 * hash + Objects.hashCode(this.contact);
        hash = 31 * hash + Objects.hashCode(this.type);
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
        final AuthorContact other = (AuthorContact) obj;
        if (this.idAuthorContact != other.idAuthorContact) {
            return false;
        }
        if (!Objects.equals(this.contact, other.contact)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.idAuthor, other.idAuthor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AuthorContact{" + "idAuthorContact=" + idAuthorContact + ", idAuthor=" + idAuthor + ", contact=" + contact + ", type=" + type + '}';
    }
    
    
    
}
