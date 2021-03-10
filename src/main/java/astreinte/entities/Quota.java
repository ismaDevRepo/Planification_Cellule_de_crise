package astreinte.entities;


import javax.persistence.*;
import java.util.*;

@Entity
public class Quota {
    public Quota() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQuota;

    @Column
    private int qQuota;

    @ManyToOne
    private Cycle qIdCycle;

    @ManyToOne
    private Phase qIdPhase;

    @ManyToOne
    private Creneau qIdCreneau;

    @OneToOne
    private CelluleUser qIdCelluleUser;

    @OneToOne
    private UserProperties qIdUserProperty;

    /* -------Accesseurs--------------- */

    public Long getIdQuota() {
        return idQuota;
    }

    public int getqQuota() {
        return qQuota;
    }

    public void setqQuota(int qQuota) {
        this.qQuota = qQuota;
    }

    public Cycle getqIdCycle() {
        return qIdCycle;
    }

    public void setqIdCycle(Cycle qIdCycle) {
        this.qIdCycle = qIdCycle;
    }

    public Phase getqIdPhase() {
        return qIdPhase;
    }

    public void setqIdPhase(Phase qIdPhase) {
        this.qIdPhase = qIdPhase;
    }

    public Creneau getqIdCreneau() {
        return qIdCreneau;
    }

    public void setqIdCreneau(Creneau qIdCreneau) {
        this.qIdCreneau = qIdCreneau;
    }

    public CelluleUser getqIdCelluleUser() {
        return qIdCelluleUser;
    }

    public void setqIdCelluleUser(CelluleUser qIdCelluleUser) {
        this.qIdCelluleUser = qIdCelluleUser;
    }

    public UserProperties getqIdUserProperty() {
        return qIdUserProperty;
    }

    public void setqIdUserProperty(UserProperties qIdUserProperty) {
        this.qIdUserProperty = qIdUserProperty;
    }
}
