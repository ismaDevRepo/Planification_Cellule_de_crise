package astreinte.entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class CycleCollection {

    public CycleCollection() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCycleCollection;

    @OneToMany(targetEntity = Cycle.class, mappedBy = "cyIdCycleCollection")
    private List<Cycle> cc_cycleList = new ArrayList<>();

    /* -------Accesseurs--------------- */

    public Long getIdCycleCollection() {
        return idCycleCollection;
    }

    public List<Cycle> getCc_cycleList() {
        return cc_cycleList;
    }

    public void setCc_cycleList(List<Cycle> cc_cycleList) {
        this.cc_cycleList = cc_cycleList;
    }
}
