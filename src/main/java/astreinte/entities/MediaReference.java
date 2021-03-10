package astreinte.entities;


import javax.persistence.*;
import java.util.*;

@Entity
public class MediaReference {
    public MediaReference() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedia_Ref;

    @ManyToOne
    private Site mrIdSite;

    @Column
    private String mrLabel;

    @Column
    private String mrType;

    @Column
    private Boolean mrMandatoryFlag;


    /* -------Accesseurs--------------- */

    public Long getIdMedia_Ref() {
        return idMedia_Ref;
    }

    public void setIdMedia_Ref(Long idMedia_Ref) {
        this.idMedia_Ref = idMedia_Ref;
    }

    public void setMrIdSite(Site mrIdSite) {
        this.mrIdSite = mrIdSite;
    }

    public String getMrLabel() {
        return mrLabel;
    }

    public void setMrLabel(String mrLabel) {
        this.mrLabel = mrLabel;
    }

    public String getMrType() {
        return mrType;
    }

    public void setMrType(String mrType) {
        this.mrType = mrType;
    }

    public Boolean getMrMandatoryFlag() {
        return mrMandatoryFlag;
    }

    public void setMrMandatoryFlag(Boolean mrMandatoryFlag) {
        this.mrMandatoryFlag = mrMandatoryFlag;
    }
}
