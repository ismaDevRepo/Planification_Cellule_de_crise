package astreinte.service;

import astreinte.entities.Cellule;
import astreinte.entities.MediaReference;
import astreinte.entities.Site;
import astreinte.entities.UserProperties;

import java.util.List;

public interface SiteService {

    public Site saveSite(Site site);

    public UserProperties saveUserProperties(UserProperties appRole);

    public Cellule saveCellule(Cellule cel);

    public MediaReference saveMediaReference(MediaReference mediaReference);

    public void addUserProperties (String userPropertyLabel, String siteName);

    public  void addCellule (String celluleLabel, String siteName);

    public  void addMediaReference (String mediaReferenceLabel, String siteName);

    public Site findSiteBySiteNomRefLabel(String siteName);

    public List<Site> findAll();

    public Site update(Site site);

    public void delete(Site site);



}
