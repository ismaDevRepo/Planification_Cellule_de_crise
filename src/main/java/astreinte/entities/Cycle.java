package astreinte.entities;


import javax.persistence.*;
import java.util.*;

@Entity
public class Cycle {

    public Cycle() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCycle;


    @OneToMany(targetEntity = Phase.class,mappedBy = "pIdCycle")
    private List<Phase> cyPhaseList = new ArrayList<>();


    @OneToMany(targetEntity = Quota.class, mappedBy = "qIdCycle")
    private List<Quota> cyQuotaList = new ArrayList<>();

    @ManyToOne
    private CycleCollection cyIdCycleCollection;

    /* -------Accesseurs--------------- */

    public long getIdCycle() {
        return idCycle;
    }

    public List<Phase> getCyPhaseList() {
        return cyPhaseList;
    }

    public void setCyPhaseList(List<Phase> cyPhaseList) {
        this.cyPhaseList = cyPhaseList;
    }

    public List<Quota> getCyQuotaList() {
        return cyQuotaList;
    }

    public void setCyQuotaList(List<Quota> cyQuotaList) {
        this.cyQuotaList = cyQuotaList;
    }

    public CycleCollection getCyIdCycleCollection() {
        return cyIdCycleCollection;
    }

    public void setCyIdCycleCollection(CycleCollection cyIdCycleCollection) {
        this.cyIdCycleCollection = cyIdCycleCollection;
    }
}
