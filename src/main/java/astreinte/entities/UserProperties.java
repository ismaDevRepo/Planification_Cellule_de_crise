package astreinte.entities;


import javax.persistence.*;
import java.util.*;

@Entity
public class UserProperties {
    public UserProperties() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUserProperty;

    @ManyToOne
    private Site upIdSite;

    @ManyToOne
    private AppUser upIdUser;

    @Column
    private String upLabel; // PUI/TECH

    @Column
    private String upSubLabel;


    @Column
    private String upDescription;

    /* -------Accesseurs--------------- */

    public Long getIdUserProperty() {
        return idUserProperty;
    }

    public Site getUpIdSite() {
        return upIdSite;
    }

    public void setUpIdSite(Site upIdSite) {
        this.upIdSite = upIdSite;
    }

    public AppUser getUpIdUser() {
        return upIdUser;
    }

    public void setUpIdUser(AppUser upIdUser) {
        this.upIdUser = upIdUser;
    }

    public String getUpLabel() {
        return upLabel;
    }

    public void setUpLabel(String upLabel) {
        this.upLabel = upLabel;
    }

    public String getUpSubLabel() {
        return upSubLabel;
    }

    public void setUpSubLabel(String upSubLabel) {
        this.upSubLabel = upSubLabel;
    }

    public String getUpDescription() {
        return upDescription;
    }

    public void setUpDescription(String upDescription) {
        this.upDescription = upDescription;
    }
}
