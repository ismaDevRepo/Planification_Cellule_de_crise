package astreinte.entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class Commentaire {


    public Commentaire() { }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommentaire;

    @Column
    private String comContent;

    @Column
    private Boolean comStatut;

    @OneToOne
    private AppUser comIdUser;

    @OneToOne
    private Cycle comIdCycle;

    @OneToOne
    private Phase comIdPhase;

    @OneToOne
    private Occupancy comIdOccupancy;


    /* -------Accesseurs--------------- */

    public Long getIdCommentaire() {
        return idCommentaire;
    }

    public String getComContent() {
        return comContent;
    }

    public void setComContent(String comContent) {
        this.comContent = comContent;
    }

    public Boolean getComStatut() {
        return comStatut;
    }

    public void setComStatut(Boolean comStatut) {
        this.comStatut = comStatut;
    }

    public AppUser getComIdUser() {
        return comIdUser;
    }

    public void setComIdUser(AppUser comIdUser) {
        this.comIdUser = comIdUser;
    }

    public Cycle getComIdCycle() {
        return comIdCycle;
    }

    public void setComIdCycle(Cycle comIdCycle) {
        this.comIdCycle = comIdCycle;
    }

    public Phase getComIdPhase() {
        return comIdPhase;
    }

    public void setComIdPhase(Phase comIdPhase) {
        this.comIdPhase = comIdPhase;
    }

    public Occupancy getComIdOccupancy() {
        return comIdOccupancy;
    }

    public void setComIdOccupancy(Occupancy comIdOccupancy) {
        this.comIdOccupancy = comIdOccupancy;
    }
}
