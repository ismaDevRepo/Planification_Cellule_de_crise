package astreinte.entities;


import javax.persistence.*;
import java.util.*;

@Entity
public class Mcycle {

    public Mcycle() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMcycle;

    @Column
    private int mcyQuota;

    @OneToMany(targetEntity = Mphase.class, mappedBy = "mphIdMcycle")
    private List<Mphase> mcyModelePhaseList = new ArrayList<>();

    @OneToMany(targetEntity = Mquota.class, mappedBy = "mqIdCycle")
    private List<Mquota> mcyModeleQuotaList = new ArrayList<>();

    @OneToOne
    private Modele mcModele;


    /* -------Accesseurs--------------- */

    public Long getIdMcycle() {
        return idMcycle;
    }
    public int getMcyQuota() {
        return mcyQuota;
    }

    public void setMcyQuota(int mcyQuota) {
        this.mcyQuota = mcyQuota;
    }

    public List<Mphase> getMcyModelePhaseList() {
        return mcyModelePhaseList;
    }

    public void setMcyModelePhaseList(List<Mphase> mcyModelePhaseList) {
        this.mcyModelePhaseList = mcyModelePhaseList;
    }

    public List<Mquota> getMcyModeleQuotaList() {
        return mcyModeleQuotaList;
    }

    public void setMcyModeleQuotaList(List<Mquota> mcyModeleQuotaList) {
        this.mcyModeleQuotaList = mcyModeleQuotaList;
    }

    public Modele getMcModele() {
        return mcModele;
    }

    public void setMcModele(Modele mcModele) {
        this.mcModele = mcModele;
    }
}
