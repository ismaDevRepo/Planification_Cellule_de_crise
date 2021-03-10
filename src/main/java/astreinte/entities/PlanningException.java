package astreinte.entities;


import javax.persistence.*;
import java.util.*;

@Entity
public class PlanningException {
    public PlanningException() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlanningException;

    @OneToOne
    private PlanningModele pe_idPlanningModel;

    @Column
    private String pe_label;

    @Column
    private Date pe_dateDebut;

    @Column
    private Date pe_dateFin;

    @ManyToOne
    private Planning pePlanning;

    public Long getIdPlanningException() {
        return idPlanningException;
    }

    public PlanningModele getPe_idPlanningModel() {
        return pe_idPlanningModel;
    }

    public void setPe_idPlanningModel(PlanningModele pe_idPlanningModel) {
        this.pe_idPlanningModel = pe_idPlanningModel;
    }

    public String getPe_label() {
        return pe_label;
    }

    public void setPe_label(String pe_label) {
        this.pe_label = pe_label;
    }

    public Date getPe_dateDebut() {
        return pe_dateDebut;
    }

    public void setPe_dateDebut(Date pe_dateDebut) {
        this.pe_dateDebut = pe_dateDebut;
    }

    public Date getPe_dateFin() {
        return pe_dateFin;
    }

    public void setPe_dateFin(Date pe_dateFin) {
        this.pe_dateFin = pe_dateFin;
    }

    public Planning getPePlanning() {
        return pePlanning;
    }

    public void setPePlanning(Planning pePlanning) {
        this.pePlanning = pePlanning;
    }
}
