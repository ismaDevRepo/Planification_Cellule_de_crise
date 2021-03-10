package astreinte.entities;



import javax.persistence.*;
import java.util.*;

@Entity
public class Mquota {
    public Mquota() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMquota;

    @Column
    private int mqQuota;

    @OneToOne
    private UserProperties mqUserProperty;

    @ManyToOne
    private Mphase mqIdModeleQuota;

    @ManyToOne
    private Mcreneau mqIdCreneau;

    @ManyToOne
    private Mcycle mqIdCycle;


    /* -------Accesseurs--------------- */

    public Long getIdMquota() {
        return idMquota;
    }
    public int getMqQuota() {
        return mqQuota;
    }

    public void setMqQuota(int mqQuota) {
        this.mqQuota = mqQuota;
    }

    public UserProperties getMqUserProperty() {
        return mqUserProperty;
    }

    public void setMqUserProperty(UserProperties mqUserProperty) {
        this.mqUserProperty = mqUserProperty;
    }

    public Mphase getMqIdModeleQuota() {
        return mqIdModeleQuota;
    }

    public void setMqIdModeleQuota(Mphase mqIdModeleQuota) {
        this.mqIdModeleQuota = mqIdModeleQuota;
    }

    public Mcreneau getMqIdCreneau() {
        return mqIdCreneau;
    }

    public void setMqIdCreneau(Mcreneau mqIdCreneau) {
        this.mqIdCreneau = mqIdCreneau;
    }

    public Mcycle getMqIdCycle() {
        return mqIdCycle;
    }

    public void setMqIdCycle(Mcycle mqIdCycle) {
        this.mqIdCycle = mqIdCycle;
    }
}
