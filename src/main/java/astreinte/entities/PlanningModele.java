package astreinte.entities;


import javax.persistence.*;
//import java.util.*;

@Entity
public class PlanningModele {
    public PlanningModele() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlanningModele;

    @Column
    private String pmLabel;

    @OneToOne
    private CycleCollection pm_idCycleCollection;

    /*@OneToMany(targetEntity = ModeleType.class,mappedBy = "mt_idPm")
    private List<ModeleType> pm_ModeleTypeList = new ArrayList<>();*/

    public Long getIdPlanningModele() {
        return idPlanningModele;
    }
    public String getPmLabel() {
        return pmLabel;
    }

    public void setPmLabel(String pmLabel) {
        this.pmLabel = pmLabel;
    }

    public CycleCollection getPm_idCycleCollection() {
        return pm_idCycleCollection;
    }

    public void setPm_idCycleCollection(CycleCollection pm_idCycleCollection) {
        this.pm_idCycleCollection = pm_idCycleCollection;
    }
}
