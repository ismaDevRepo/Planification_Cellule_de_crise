package astreinte.entities;



import javax.persistence.*;
import java.util.*;

@Entity
public class Regle {

    public Regle() {     }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRule;

    @Column
    private String ruLabel;

    @Column
    private String ruDescription;

    @OneToOne
    private Site ruIdSite;

    @ManyToOne
    private Planning ruIdPlanning;

    @ManyToOne
    private Modele ruIdModele;

    /* -------Accesseurs--------------- */

    public Long getIdRule() {
        return idRule;
    }

    public String getRuLabel() {
        return ruLabel;
    }

    public void setRuLabel(String ruLabel) {
        this.ruLabel = ruLabel;
    }

    public String getRuDescription() {
        return ruDescription;
    }

    public void setRuDescription(String ruDescription) {
        this.ruDescription = ruDescription;
    }

    public Site getRuIdSite() {
        return ruIdSite;
    }

    public void setRuIdSite(Site ruIdSite) {
        this.ruIdSite = ruIdSite;
    }

    public Planning getRuIdPlanning() {
        return ruIdPlanning;
    }

    public void setRuIdPlanning(Planning ruIdPlanning) {
        this.ruIdPlanning = ruIdPlanning;
    }

    public Modele getRuIdModele() {
        return ruIdModele;
    }

    public void setRuIdModele(Modele ruIdModele) {
        this.ruIdModele = ruIdModele;
    }
}
