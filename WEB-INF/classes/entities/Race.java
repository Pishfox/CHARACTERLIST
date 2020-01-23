package entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "\"race\"", catalog = "\"roleuniverse\"", schema = "\"charlist\"")
@NamedQueries({
    @NamedQuery(name = "Race.findAll", query = "SELECT r FROM Race r"),
    @NamedQuery(name = "Race.findById", query = "SELECT r FROM Race r WHERE r.id = :id"),
    @NamedQuery(name = "Race.findByRacename", query = "SELECT r FROM Race r WHERE r.racename = :racename")})
@XmlRootElement
public class Race implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "\"id\"", nullable = false)
    private Integer id;
    
    @Size(max = 30)
    @Column(name = "\"racename\"", length = 30)
    private String racename;
    
    @Size(max = 300)
    @Column(name = "\"racedesc\"", length = 300)
    private String racedesc;
    
    @OneToMany(mappedBy = "raceId")
    private Set<Characters> charactersSet;

    public Race() {
    }

    public Race(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRacename() {
        return racename;
    }

    public void setRacename(String racename) {
        this.racename = racename;
    }

    public String getRacedesc() {
        return racedesc;
    }

    public void setRacedesc(String racedesc) {
        this.racedesc = racedesc;
    }

    @XmlTransient
    public Set<Characters> getCharactersSet() {
        return charactersSet;
    }

    public void setCharactersSet(Set<Characters> charactersSet) {
        this.charactersSet = charactersSet;
    }
}
