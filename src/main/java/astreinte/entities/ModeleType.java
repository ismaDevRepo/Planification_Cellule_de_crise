package astreinte.entities;



import javax.persistence.*;
import java.util.*;

@Entity
public class ModeleType {
    public ModeleType() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idModeleType;

    @OneToOne
    private Planning mtIdPlanning;

    @ManyToOne
    private Modele mtIdModele;

    @Column
    private String mtLabel; // Astreinte, Mobilisation, Exception

    @ManyToOne
    private PlanningModele mtIdPm;


    /* -------Accesseurs--------------- */


    public Long getIdModeleType() {
        return idModeleType;
    }

    public Planning getMtIdPlanning() {
        return mtIdPlanning;
    }

    public void setMtIdPlanning(Planning mtIdPlanning) {
        this.mtIdPlanning = mtIdPlanning;
    }

    public Modele getMtIdModele() {
        return mtIdModele;
    }

    public void setMtIdModele(Modele mtIdModele) {
        this.mtIdModele = mtIdModele;
    }

    public String getMtLabel() {
        return mtLabel;
    }

    public void setMtLabel(String mtLabel) {
        this.mtLabel = mtLabel;
    }

    public PlanningModele getMtIdPm() {
        return mtIdPm;
    }

    public void setMtIdPm(PlanningModele mtIdPm) {
        this.mtIdPm = mtIdPm;
    }
}
