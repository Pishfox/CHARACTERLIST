package entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "\"characters\"", catalog = "\"roleuniverse\"", schema = "\"charlist\"")
@NamedQueries({
    @NamedQuery(name = "Characters.findAll", query = "SELECT c FROM Characters c"),
    @NamedQuery(name = "Characters.findById", query = "SELECT c FROM Characters c WHERE c.id = :id"),
    @NamedQuery(name = "Characters.findByFirstname", query = "SELECT c FROM Characters c WHERE c.firstname = :firstname"),
    @NamedQuery(name = "Characters.findByLastname", query = "SELECT c FROM Characters c WHERE c.lastname = :lastname"),
    @NamedQuery(name = "Characters.findByAge", query = "SELECT c FROM Characters c WHERE c.age = :age")})
@XmlRootElement
public class Characters implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "\"id\"", nullable = false)
    private Integer id;
    
    @Size(max = 30)
    @Column(name = "\"firstname\"", length = 30)
    private String firstname;
    
    @Size(max = 30)
    @Column(name = "\"lastname\"", length = 30)
    private String lastname;
    
    @Column(name = "\"age\"")
    private Integer age;
    
    @Size(max = 300)
    @Column(name = "\"tagline\"", length = 300)
    private String tagline;
    
    @Lob
    @Column(name = "\"avatar\"")
    private byte[] avatar;
    
    @JoinColumn(name = "\"alignment_id\"", referencedColumnName = "\"id\"")
    @ManyToOne
    private Alignment alignmentId;
    
    @JoinColumn(name = "\"homeworld_id\"", referencedColumnName = "\"id\"")
    @ManyToOne
    private Homeworld homeworldId;
    
    @JoinColumn(name = "\"race_id\"", referencedColumnName = "\"id\"")
    @ManyToOne
    private Race raceId;
    
    @OneToMany(mappedBy = "charId", targetEntity = entities.Build.class)
    private Set<Build> buildSet;
    
    @OneToMany(mappedBy = "charId", targetEntity = entities.Loyalunits.class)
    private Set<Loyalunits> loyalunitsSet;

    public Characters() {
    }

    public Characters(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    public Alignment getAlignmentId() {
        return alignmentId;
    }

    public void setAlignmentId(Alignment alignmentId) {
        this.alignmentId = alignmentId;
    }

    public Homeworld getHomeworldId() {
        return homeworldId;
    }

    public void setHomeworldId(Homeworld homeworldId) {
        this.homeworldId = homeworldId;
    }

    public Race getRaceId() {
        return raceId;
    }

    public void setRaceId(Race raceId) {
        this.raceId = raceId;
    }

    @XmlTransient
    public Set<Build> getBuildSet() {
        return buildSet;
    }

    public void setBuildSet(Set<Build> buildSet) {
        this.buildSet = buildSet;
    }

    @XmlTransient
    public Set<Loyalunits> getLoyalunitsSet() {
        return loyalunitsSet;
    }

    public void setLoyalunitsSet(Set<Loyalunits> loyalunitsSet) {
        this.loyalunitsSet = loyalunitsSet;
    }
}
