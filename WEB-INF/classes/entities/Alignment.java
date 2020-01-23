package entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "\"alignment\"", catalog = "\"roleuniverse\"", schema = "\"charlist\"")
@NamedQueries({
    @NamedQuery(name = "Alignment.findAll", query = "SELECT a FROM Alignment a"),
    @NamedQuery(name = "Alignment.findById", query = "SELECT a FROM Alignment a WHERE a.id = :id"),
    @NamedQuery(name = "Alignment.findByAlignname", query = "SELECT a FROM Alignment a WHERE a.alignname = :alignname")})
@XmlRootElement
public class Alignment implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "\"id\"", nullable = false, insertable = false)
    private Integer id;
    
    @Size(max = 30)
    @Column(name = "\"alignname\"", length = 30, insertable = false)
    private String alignname;
    
    @OneToMany(mappedBy = "alignmentId")
    private Set<Characters> charactersSet;

    public Alignment() {
    }

    public Alignment(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getAlignname() {
        return alignname;
    }

    @XmlTransient
    public Set<Characters> getCharactersSet() {
        return charactersSet;
    }

    public void setCharactersSet(Set<Characters> charactersSet) {
        this.charactersSet = charactersSet;
    }
}
