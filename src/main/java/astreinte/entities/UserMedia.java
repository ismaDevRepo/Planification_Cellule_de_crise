package astreinte.entities;


import javax.persistence.*;
import java.util.*;

@Entity
public class UserMedia {
    public UserMedia() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUserMedia;

    @OneToOne
    private MediaReference umMediaReference_id;

    @ManyToOne
    private AppUser umUserId;

    @Column
    private String umValue;

    /* -------Accesseurs--------------- */

    public Long getIdUserMedia() {
        return idUserMedia;
    }

    public MediaReference getUmMediaReference_id() {
        return umMediaReference_id;
    }

    public void setUmMediaReference_id(MediaReference umMediaReference_id) {
        this.umMediaReference_id = umMediaReference_id;
    }

    public AppUser getUmUserId() {
        return umUserId;
    }

    public void setUmUserId(AppUser umUserId) {
        this.umUserId = umUserId;
    }

    public String getUmValue() {
        return umValue;
    }

    public void setUmValue(String umValue) {
        this.umValue = umValue;
    }
}
