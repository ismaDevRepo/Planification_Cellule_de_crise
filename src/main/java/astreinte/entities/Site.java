package astreinte.entities;


import javax.persistence.*;
import java.util.*;

@Entity
public class Site {
    public Site() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSite;

    @Column
    private String siteNomRefLabel;


    @Column
    private String siteLieu;

    @Column
    private String siteDescription;


    @Column
    private String siteContactPrincipal;

    @Lob
    @Column
    private byte[] siteLogoImg;

    @Column
    private String siteArticleIntro;

    @Column
    private Long siteColorPrimary;

    @Column
    private Long siteColorSecondary;

    @Column
    private Long siteDefaultSlotDuration;


    @OneToMany(targetEntity = UserProperties.class,mappedBy = "upIdSite")
    private List<UserProperties> siteUserPropertyList = new ArrayList<>();


    @OneToMany(targetEntity = Cellule.class,mappedBy = "cIdSite")
    private List<Cellule> siteCelluleList = new ArrayList<>();

    @OneToMany(targetEntity = MediaReference.class, mappedBy = "mrIdSite")
    private List<MediaReference> siteMediaReferenceList = new ArrayList<>();


    /* -------Accesseurs--------------- */

    public Long getIdSite() {
        return idSite;
    }

    public String getSiteNomRefLabel() {
        return siteNomRefLabel;
    }

    public void setSiteNomRefLabel(String siteNomRefLabel) {
        this.siteNomRefLabel = siteNomRefLabel;
    }

    public String getSiteLieu() {
        return siteLieu;
    }

    public void setSiteLieu(String siteLieu) {
        this.siteLieu = siteLieu;
    }

    public String getSiteDescription() {
        return siteDescription;
    }

    public void setSiteDescription(String siteDescription) {
        this.siteDescription = siteDescription;
    }

    public String getSiteContactPrincipal() {
        return siteContactPrincipal;
    }

    public void setSiteContactPrincipal(String siteContactPrincipal) {
        this.siteContactPrincipal = siteContactPrincipal;
    }

    public byte[] getSiteLogoImg() {
        return siteLogoImg;
    }

    public void setSiteLogoImg(byte[] siteLogoImg) {
        this.siteLogoImg = siteLogoImg;
    }

    public String getSiteArticleIntro() {
        return siteArticleIntro;
    }

    public void setSiteArticleIntro(String siteArticleIntro) {
        this.siteArticleIntro = siteArticleIntro;
    }

    public Long getSiteColorPrimary() {
        return siteColorPrimary;
    }

    public void setSiteColorPrimary(Long siteColorPrimary) {
        this.siteColorPrimary = siteColorPrimary;
    }

    public Long getSiteColorSecondary() {
        return siteColorSecondary;
    }

    public void setSiteColorSecondary(Long siteColorSecondary) {
        this.siteColorSecondary = siteColorSecondary;
    }

    public Long getSiteDefaultSlotDuration() {
        return siteDefaultSlotDuration;
    }

    public void setSiteDefaultSlotDuration(Long siteDefaultSlotDuration) {
        this.siteDefaultSlotDuration = siteDefaultSlotDuration;
    }

    public List<UserProperties> getSiteUserPropertyList() {
        return siteUserPropertyList;
    }

    public void setSiteUserPropertyList(List<UserProperties> siteUserPropertyList) {
        this.siteUserPropertyList = siteUserPropertyList;
    }

    public List<Cellule> getSiteCelluleList() {
        return siteCelluleList;
    }

    public void setSiteCelluleList(List<Cellule> siteCelluleList) {
        this.siteCelluleList = siteCelluleList;
    }

    public List<MediaReference> getSiteMediaReferenceList() {
        return siteMediaReferenceList;
    }

    public void setSiteMediaReferenceList(List<MediaReference> siteMediaReferenceList) {
        this.siteMediaReferenceList = siteMediaReferenceList;
    }
}
