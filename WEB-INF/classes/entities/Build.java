package entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "\"build\"", catalog = "\"roleuniverse\"", schema = "\"charlist\"")
@NamedQueries({
    @NamedQuery(name = "Build.findAll", query = "SELECT b FROM Build b"),
    @NamedQuery(name = "Build.findById", query = "SELECT b FROM Build b WHERE b.id = :id")})
@XmlRootElement
public class Build implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "\"id\"", nullable = false)
    private Integer id;
    
    @JoinColumn(name = "\"charId\"", referencedColumnName = "\"id\"")
    @ManyToOne
    private Characters charId;
    
    @JoinColumn(name = "\"skillId\"", referencedColumnName = "\"id\"")
    @ManyToOne
    private Skills skillId;
    
    @JoinColumn(name = "\"weaponId\"", referencedColumnName = "\"id\"")
    @ManyToOne
    private Weapon weaponId;

    public Build() {
    }

    public Build(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Characters getCharId() {
        return charId;
    }

    public void setCharId(Characters charId) {
        this.charId = charId;
    }

    public Skills getSkillId() {
        return skillId;
    }

    public void setSkillId(Skills skillId) {
        this.skillId = skillId;
    }

    public Weapon getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(Weapon weaponId) {
        this.weaponId = weaponId;
    }
}
