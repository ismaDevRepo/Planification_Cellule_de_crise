package astreinte.entities;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Mcreneau {

    public Mcreneau() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMCreneau;

    @Column
    private int mcrDuree;

    @Column
    private int mcrOrdre;

    @Column
    private int mcrQuota;

    @Column
    private int mcrTolerance;

    @ManyToOne
    private Mphase mcrIdPhase;

    @OneToMany(targetEntity = Mquota.class, mappedBy = "mqIdCreneau")
    private List<Mquota> mcrQuotaList = new ArrayList<>();


    /* -------Accesseurs--------------- */

    public Long getIdMCreneau() {
        return idMCreneau;
    }
    public int getMcrDuree() {
        return mcrDuree;
    }

    public void setMcrDuree(int mcrDuree) {
        this.mcrDuree = mcrDuree;
    }

    public int getMcrOrdre() {
        return mcrOrdre;
    }

    public void setMcrOrdre(int mcrOrdre) {
        this.mcrOrdre = mcrOrdre;
    }

    public int getMcrQuota() {
        return mcrQuota;
    }

    public void setMcrQuota(int mcrQuota) {
        this.mcrQuota = mcrQuota;
    }

    public int getMcrTolerance() {
        return mcrTolerance;
    }

    public void setMcrTolerance(int mcrTolerance) {
        this.mcrTolerance = mcrTolerance;
    }

    public Mphase getMcrIdPhase() {
        return mcrIdPhase;
    }

    public void setMcrIdPhase(Mphase mcrIdPhase) {
        this.mcrIdPhase = mcrIdPhase;
    }

    public List<Mquota> getMcrQuotaList() {
        return mcrQuotaList;
    }

    public void setMcrQuotaList(List<Mquota> mcrQuotaList) {
        this.mcrQuotaList = mcrQuotaList;
    }
}
