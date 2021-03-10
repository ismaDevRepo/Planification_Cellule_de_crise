package astreinte.entities;


import javax.persistence.*;

import java.util.*;

@Entity
public class SiteMaintenanceList {

    public SiteMaintenanceList() {    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSiteMaintenanceList;

    @OneToOne
    private Site mlIdSite;

    @Column
    private Date mlDate;

    @Column
    private String mlTitle;

    @Column
    private String mlDescription;

    @Column
    private String mlCategory;


    /* Accesseur */

    public Long getIdSiteMaintenanceList() {
        return idSiteMaintenanceList;
    }

    public Site getMlIdSite() {
        return mlIdSite;
    }

    public void setMlIdSite(Site mlIdSite) {
        this.mlIdSite = mlIdSite;
    }

    public Date getMlDate() {
        return mlDate;
    }

    public void setMlDate(Date mlDate) {
        this.mlDate = mlDate;
    }

    public String getMlTitle() {
        return mlTitle;
    }

    public void setMlTitle(String mlTitle) {
        this.mlTitle = mlTitle;
    }

    public String getMlDescription() {
        return mlDescription;
    }

    public void setMlDescription(String mlDescription) {
        this.mlDescription = mlDescription;
    }

    public String getMlCategory() {
        return mlCategory;
    }

    public void setMlCategory(String mlCategory) {
        this.mlCategory = mlCategory;
    }
}
