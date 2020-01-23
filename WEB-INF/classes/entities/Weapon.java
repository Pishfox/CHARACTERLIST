package entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "\"weapon\"", catalog = "\"roleuniverse\"", schema = "\"charlist\"")
@NamedQueries({
    @NamedQuery(name = "Weapon.findAll", query = "SELECT w FROM Weapon w"),
    @NamedQuery(name = "Weapon.findById", query = "SELECT w FROM Weapon w WHERE w.id = :id"),
    @NamedQuery(name = "Weapon.findByWeaponname", query = "SELECT w FROM Weapon w WHERE w.weaponname = :weaponname")})
@XmlRootElement
public class Weapon implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "\"id\"", nullable = false)
    private Integer id;
    
    @Size(max = 30)
    @Column(name = "\"weaponname\"", length = 30)
    private String weaponname;
    
    @OneToMany(mappedBy = "weaponId")
    private Set<Build> buildSet;

    public Weapon() {
    }

    public Weapon(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWeaponname() {
        return weaponname;
    }

    public void setWeaponname(String weaponname) {
        this.weaponname = weaponname;
    }

    @XmlTransient
    public Set<Build> getBuildSet() {
        return buildSet;
    }

    public void setBuildSet(Set<Build> buildSet) {
        this.buildSet = buildSet;
    }
}
