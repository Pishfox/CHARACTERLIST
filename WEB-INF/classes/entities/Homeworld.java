package entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "\"homeworld\"", catalog = "\"roleuniverse\"", schema = "\"charlist\"")
@NamedQueries({
    @NamedQuery(name = "Homeworld.findAll", query = "SELECT h FROM Homeworld h"),
    @NamedQuery(name = "Homeworld.findById", query = "SELECT h FROM Homeworld h WHERE h.id = :id"),
    @NamedQuery(name = "Homeworld.findByWorldname", query = "SELECT h FROM Homeworld h WHERE h.worldname = :worldname")})
@XmlRootElement
public class Homeworld implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "\"id\"", nullable = false)
    private Integer id;
    
    @Size(max = 30)
    @Column(name = "\"worldname\"", length = 30)
    private String worldname;
    
    @Size(max = 300)
    @Column(name = "\"worlddesc\"", length = 300)
    private String worlddesc;
    
    @OneToMany(mappedBy = "homeworldId")
    private Set<Characters> charactersSet;

    public Homeworld() {
    }

    public Homeworld(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorldname() {
        return worldname;
    }

    public void setWorldname(String worldname) {
        this.worldname = worldname;
    }

    public String getWorlddesc() {
        return worlddesc;
    }

    public void setWorlddesc(String worlddesc) {
        this.worlddesc = worlddesc;
    }

    @XmlTransient
    public Set<Characters> getCharactersSet() {
        return charactersSet;
    }

    public void setCharactersSet(Set<Characters> charactersSet) {
        this.charactersSet = charactersSet;
    }
}
