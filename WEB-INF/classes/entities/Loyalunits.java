package entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "\"loyalunits\"", catalog = "\"roleuniverse\"", schema = "\"charlist\"")
@NamedQueries({
    @NamedQuery(name = "Loyalunits.findAll", query = "SELECT l FROM Loyalunits l"),
    @NamedQuery(name = "Loyalunits.findById", query = "SELECT l FROM Loyalunits l WHERE l.id = :id"),
    @NamedQuery(name = "Loyalunits.findByUnitname", query = "SELECT l FROM Loyalunits l WHERE l.unitname = :unitname")})
@XmlRootElement
public class Loyalunits implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "\"id\"", nullable = false)
    private Integer id;
    
    @Size(max = 30)
    @Column(name = "\"unitname\"", length = 30)
    private String unitname;
    
    @JoinColumn(name = "\"charId\"", referencedColumnName = "\"id\"")
    @ManyToOne
    private Characters charId;
    
    @JoinColumn(name = "\"kindId\"", referencedColumnName = "\"id\"")
    @ManyToOne
    private Unitkind kindId;

    public Loyalunits() {
    }

    public Loyalunits(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public Characters getCharId() {
        return charId;
    }

    public void setCharId(Characters charId) {
        this.charId = charId;
    }

    public Unitkind getKindId() {
        return kindId;
    }

    public void setKindId(Unitkind kindId) {
        this.kindId = kindId;
    }
}
