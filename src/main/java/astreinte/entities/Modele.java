package astreinte.entities;


import javax.persistence.*;
import java.util.*;

@Entity
public class Modele {
    public Modele() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idModel;

    private String m_label;

    @OneToMany(targetEntity = Planning.class, mappedBy = "pIdModele")
    private List<Planning> planningList = new ArrayList<>();

    @OneToMany(targetEntity = ModeleType.class, mappedBy = "mtIdModele")
    private List<ModeleType> m_mtList = new ArrayList<>();

    @OneToMany(targetEntity = Regle.class,mappedBy = "ruIdModele")
    private List<Regle> p_ruleList = new ArrayList<>();


    /* -------Accesseurs--------------- */


    public Long getIdModel() {
        return idModel;
    }
    public String getM_label() {
        return m_label;
    }

    public void setM_label(String m_label) {
        this.m_label = m_label;
    }

    public List<Planning> getPlanningList() {
        return planningList;
    }

    public void setPlanningList(List<Planning> planningList) {
        this.planningList = planningList;
    }

    public List<Regle> getP_ruleList() {
        return p_ruleList;
    }

    public void setP_ruleList(List<Regle> p_ruleList) {
        this.p_ruleList = p_ruleList;
    }
}
