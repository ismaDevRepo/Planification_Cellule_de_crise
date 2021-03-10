package astreinte.entities;



import javax.persistence.*;
import java.util.*;

@Entity
public class Phase {

    public Phase() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPhase;

    @OneToMany(targetEntity = Creneau.class,mappedBy = "cIdPhase")
    private List<Creneau> pCreneauList = new ArrayList<>();

    @ManyToOne
    private Cycle pIdCycle;

    @OneToMany(targetEntity = Quota.class, mappedBy = "qIdPhase")
    private List<Quota> pQuotaList = new ArrayList<>();

    /* -------Accesseurs--------------- */

    public long getIdPhase() {
        return idPhase;
    }
    public List<Creneau> getpCreneauList() {
        return pCreneauList;
    }

    public void setpCreneauList(List<Creneau> pCreneauList) {
        this.pCreneauList = pCreneauList;
    }

    public Cycle getpIdCycle() {
        return pIdCycle;
    }

    public void setpIdCycle(Cycle pIdCycle) {
        this.pIdCycle = pIdCycle;
    }

    public List<Quota> getpQuotaList() {
        return pQuotaList;
    }

    public void setpQuotaList(List<Quota> pQuotaList) {
        this.pQuotaList = pQuotaList;
    }
}
