package astreinte.entities;


import javax.persistence.*;
import java.util.*;

@Entity
public class Mphase {

    public Mphase() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMphase;

    @Column
    private int mphDuree;
    @Column
    private int mphOrdre;
    @Column
    private int mphQuota;
    @Column
    private int mphTolerance;

    @OneToMany(targetEntity = Mcreneau.class,mappedBy = "mcrIdPhase")
    private List<Mcreneau> mphModeleCreneauList = new ArrayList<>();


    @OneToMany(targetEntity = Mquota.class ,mappedBy = "mqIdModeleQuota")
    private List<Mquota> mphModeleQuotaList = new ArrayList<>();

    @ManyToOne
    private Mcycle mphIdMcycle;

    /* -------Accesseurs--------------- */

    public Long getIdMphase() {
        return idMphase;
    }

    public int getMphDuree() {
        return mphDuree;
    }

    public void setMphDuree(int mphDuree) {
        this.mphDuree = mphDuree;
    }

    public int getMphOrdre() {
        return mphOrdre;
    }

    public void setMphOrdre(int mphOrdre) {
        this.mphOrdre = mphOrdre;
    }

    public int getMphQuota() {
        return mphQuota;
    }

    public void setMphQuota(int mphQuota) {
        this.mphQuota = mphQuota;
    }

    public int getMphTolerance() {
        return mphTolerance;
    }

    public void setMphTolerance(int mphTolerance) {
        this.mphTolerance = mphTolerance;
    }

    public List<Mcreneau> getMphModeleCreneauList() {
        return mphModeleCreneauList;
    }

    public void setMphModeleCreneauList(List<Mcreneau> mphModeleCreneauList) {
        this.mphModeleCreneauList = mphModeleCreneauList;
    }

    public List<Mquota> getMphModeleQuotaList() {
        return mphModeleQuotaList;
    }

    public void setMphModeleQuotaList(List<Mquota> mphModeleQuotaList) {
        this.mphModeleQuotaList = mphModeleQuotaList;
    }

    public Mcycle getMphIdMcycle() {
        return mphIdMcycle;
    }

    public void setMphIdMcycle(Mcycle mphIdMcycle) {
        this.mphIdMcycle = mphIdMcycle;
    }
}
