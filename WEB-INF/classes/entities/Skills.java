package entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "\"skills\"", catalog = "\"roleuniverse\"", schema = "\"charlist\"")
@NamedQueries({
    @NamedQuery(name = "Skills.findAll", query = "SELECT s FROM Skills s"),
    @NamedQuery(name = "Skills.findById", query = "SELECT s FROM Skills s WHERE s.id = :id"),
    @NamedQuery(name = "Skills.findBySkillname", query = "SELECT s FROM Skills s WHERE s.skillname = :skillname"),
    @NamedQuery(name = "Skills.findByType", query = "SELECT s FROM Skills s WHERE s.type = :type")})
@XmlRootElement
public class Skills implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "\"id\"", nullable = false)
    private Integer id;
    
    @Size(max = 30)
    @Column(name = "\"skillname\"", length = 30)
    private String skillname;
    
    @Size(max = 30)
    @Column(name = "\"type\"", length = 30)
    private String type;
    
    @OneToMany(mappedBy = "skillId")
    private Set<Build> buildSet;

    public Skills() {
    }

    public Skills(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSkillname() {
        return skillname;
    }

    public void setSkillname(String skillname) {
        this.skillname = skillname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlTransient
    public Set<Build> getBuildSet() {
        return buildSet;
    }

    public void setBuildSet(Set<Build> buildSet) {
        this.buildSet = buildSet;
    }
}
