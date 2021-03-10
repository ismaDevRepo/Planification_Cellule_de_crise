package astreinte.entities;

import javax.persistence.*;
import java.util.*;
import java.util.Date;

@Entity
public class CelluleUser {
    public CelluleUser() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCelluleUser;

    private Date registredAt;

    @ManyToOne
    private AppUser cuUsr;

    @ManyToOne
    private Cellule cuCel;

    @OneToMany(targetEntity = AppRole.class, mappedBy = "roIdCelluleUser")
    private List<AppRole> cu_App_App_roleList = new ArrayList<>();


    /* -------Accesseurs--------------- */

    public Long getIdCelluleUser() {
        return idCelluleUser;
    }

    public Date getRegistredAt() {
        return registredAt;
    }

    public void setRegistredAt(Date registredAt) {
        this.registredAt = registredAt;
    }

    public AppUser getCuUsr() {
        return cuUsr;
    }

    public void setCuUsr(AppUser cuUsr) {
        this.cuUsr = cuUsr;
    }

    public Cellule getCuCel() {
        return cuCel;
    }

    public void setCuCel(Cellule cuCel) {
        this.cuCel = cuCel;
    }

    public List<AppRole> getCu_App_App_roleList() {
        return cu_App_App_roleList;
    }

    public void setCu_App_App_roleList(List<AppRole> cu_App_App_roleList) {
        this.cu_App_App_roleList = cu_App_App_roleList;
    }
}
