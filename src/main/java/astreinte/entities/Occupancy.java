package astreinte.entities;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Occupancy {

    public Occupancy() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOccupancy;

    @Column
    private Date ocDateDebut;

    @Column
    private Date ocDateFin;

    @OneToOne
    private AppUser ocIdUserSubstitute;

    @OneToOne
    private AppUser ocIdUser;

    @OneToOne
    private Creneau ocIdCreneau;


    /* -------Accesseurs--------------- */

    public Long getIdOccupancy() {
        return idOccupancy;
    }
    public Date getOcDateDebut() {
        return ocDateDebut;
    }

    public void setOcDateDebut(Date ocDateDebut) {
        this.ocDateDebut = ocDateDebut;
    }

    public Date getOcDateFin() {
        return ocDateFin;
    }

    public void setOcDateFin(Date ocDateFin) {
        this.ocDateFin = ocDateFin;
    }

    public AppUser getOcIdUserSubstitute() {
        return ocIdUserSubstitute;
    }

    public void setOcIdUserSubstitute(AppUser ocIdUserSubstitute) {
        this.ocIdUserSubstitute = ocIdUserSubstitute;
    }

    public AppUser getOcIdUser() {
        return ocIdUser;
    }

    public void setOcIdUser(AppUser ocIdUser) {
        this.ocIdUser = ocIdUser;
    }

    public Creneau getOcIdCreneau() {
        return ocIdCreneau;
    }

    public void setOcIdCreneau(Creneau ocIdCreneau) {
        this.ocIdCreneau = ocIdCreneau;
    }
}
