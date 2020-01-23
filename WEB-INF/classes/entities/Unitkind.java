package entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "\"unitkind\"", catalog = "\"roleuniverse\"", schema = "\"charlist\"")
@NamedQueries({
    @NamedQuery(name = "Unitkind.findAll", query = "SELECT u FROM Unitkind u"),
    @NamedQuery(name = "Unitkind.findById", query = "SELECT u FROM Unitkind u WHERE u.id = :id"),
    @NamedQuery(name = "Unitkind.findByKindname", query = "SELECT u FROM Unitkind u WHERE u.kindname = :kindname")})
@XmlRootElement
public class Unitkind implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "\"id\"", nullable = false)
    private Integer id;
    
    @Size(max = 30)
    @Column(name = "\"kindname\"", length = 30)
    private String kindname;
    
    @Size(max = 300)
    @Column(name = "\"kinddesc\"", length = 300)
    private String kinddesc;
    
    @OneToMany(mappedBy = "kindId")
    private Set<Loyalunits> loyalunitsSet;

    public Unitkind() {
    }

    public Unitkind(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKindname() {
        return kindname;
    }

    public void setKindname(String kindname) {
        this.kindname = kindname;
    }

    public String getKinddesc() {
        return kinddesc;
    }

    public void setKinddesc(String kinddesc) {
        this.kinddesc = kinddesc;
    }

    @XmlTransient
    public Set<Loyalunits> getLoyalunitsSet() {
        return loyalunitsSet;
    }

    public void setLoyalunitsSet(Set<Loyalunits> loyalunitsSet) {
        this.loyalunitsSet = loyalunitsSet;
    }
}
