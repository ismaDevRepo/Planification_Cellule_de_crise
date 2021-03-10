package astreinte.entities;



import javax.persistence.*;
import java.util.*;

@Entity
public class Planning {
    public Planning() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlanning;

    @Column
    private String p_labelPlanning;

    @Column
    private Date p_startDate;

    @Column
    private Date p_endDate;

    @Column
    private int p_timeLag;

    @OneToOne
    private PlanningModele pIdPlaningModel;

    @ManyToOne
    private Modele pIdModele;

    @OneToMany(targetEntity = PlanningException.class, mappedBy = "pePlanning")
    private List<PlanningException> planningExceptionList = new ArrayList<>();

    @OneToMany(targetEntity = Cellule.class, mappedBy = "cPlanning")
    private List<Cellule> celluleList = new ArrayList<>();

    @OneToMany(targetEntity = Regle.class,mappedBy = "ruIdPlanning")
    private List<Regle> p_ruleList = new ArrayList<>();

    public Long getIdPlanning() {
        return idPlanning;
    }

    public String getP_labelPlanning() {
        return p_labelPlanning;
    }

    public void setP_labelPlanning(String p_labelPlanning) {
        this.p_labelPlanning = p_labelPlanning;
    }

    public Date getP_startDate() {
        return p_startDate;
    }

    public void setP_startDate(Date p_startDate) {
        this.p_startDate = p_startDate;
    }

    public Date getP_endDate() {
        return p_endDate;
    }

    public void setP_endDate(Date p_endDate) {
        this.p_endDate = p_endDate;
    }

    public int getP_timeLag() {
        return p_timeLag;
    }

    public void setP_timeLag(int p_timeLag) {
        this.p_timeLag = p_timeLag;
    }

    public PlanningModele getpIdPlaningModel() {
        return pIdPlaningModel;
    }

    public void setpIdPlaningModel(PlanningModele pIdPlaningModel) {
        this.pIdPlaningModel = pIdPlaningModel;
    }

    public Modele getpIdModele() {
        return pIdModele;
    }

    public void setpIdModele(Modele pIdModele) {
        this.pIdModele = pIdModele;
    }

    public List<PlanningException> getPlanningExceptionList() {
        return planningExceptionList;
    }

    public void setPlanningExceptionList(List<PlanningException> planningExceptionList) {
        this.planningExceptionList = planningExceptionList;
    }

    public List<Cellule> getCelluleList() {
        return celluleList;
    }

    public void setCelluleList(List<Cellule> celluleList) {
        this.celluleList = celluleList;
    }

    public List<Regle> getP_ruleList() {
        return p_ruleList;
    }

    public void setP_ruleList(List<Regle> p_ruleList) {
        this.p_ruleList = p_ruleList;
    }
}
