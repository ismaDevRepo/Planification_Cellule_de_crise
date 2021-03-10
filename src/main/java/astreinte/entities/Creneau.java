package astreinte.entities;


import javax.persistence.*;
import java.util.*;

@Entity
public class Creneau {

    public Creneau() {	}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCreneau;

    @Column
    private Date crDateDebut;

    @Column
    private Date crDateFin;

    @Column
    private int crOrdre;

    @Column
    private int crQuota;

    @Column
    private int crTolerance;

    @OneToMany(targetEntity = Quota.class, mappedBy = "qIdCreneau")
    private List<Quota> crQuotaList = new ArrayList<>();

    @ManyToOne
    private Phase cIdPhase;

    /* -------Accesseurs--------------- */

    public long getIdCreneau() {
        return idCreneau;
    }
    public Date getCrDateDebut() {
        return crDateDebut;
    }

    public void setCrDateDebut(Date crDateDebut) {
        this.crDateDebut = crDateDebut;
    }

    public Date getCrDateFin() {
        return crDateFin;
    }

    public void setCrDateFin(Date crDateFin) {
        this.crDateFin = crDateFin;
    }

    public int getCrOrdre() {
        return crOrdre;
    }

    public void setCrOrdre(int crOrdre) {
        this.crOrdre = crOrdre;
    }

    public int getCrQuota() {
        return crQuota;
    }

    public void setCrQuota(int crQuota) {
        this.crQuota = crQuota;
    }

    public int getCrTolerance() {
        return crTolerance;
    }

    public void setCrTolerance(int crTolerance) {
        this.crTolerance = crTolerance;
    }

    public List<Quota> getCrQuotaList() {
        return crQuotaList;
    }

    public void setCrQuotaList(List<Quota> crQuotaList) {
        this.crQuotaList = crQuotaList;
    }

    public Phase getcIdPhase() {
        return cIdPhase;
    }

    public void setcIdPhase(Phase cIdPhase) {
        this.cIdPhase = cIdPhase;
    }
}
