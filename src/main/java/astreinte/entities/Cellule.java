package astreinte.entities;


import javax.persistence.*;
import java.util.*;

@Entity
public class Cellule {
    public Cellule() {    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idCellule;

    @ManyToOne
    private Site cIdSite;

    @Column
    private String cLabel;

    @OneToMany(targetEntity = CelluleUser.class, mappedBy = "cuCel")
    private List<CelluleUser> celluleUserList = new ArrayList<>();

    @ManyToOne
    private Planning cPlanning;

    /* -------Accesseurs--------------- */

    public Long getIdCellule() {
        return idCellule;
    }

    public Site getcIdSite() {
        return cIdSite;
    }

    public void setcIdSite(Site cIdSite) {
        this.cIdSite = cIdSite;
    }

    public List<CelluleUser> getCelluleUserList() {
        return celluleUserList;
    }

    public void setCelluleUserList(List<CelluleUser> celluleUserList) {
        this.celluleUserList = celluleUserList;
    }

    public Planning getcPlanning() {
        return cPlanning;
    }

    public void setcPlanning(Planning cPlanning) {
        this.cPlanning = cPlanning;
    }
}
