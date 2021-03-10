package astreinte.service;

import astreinte.entities.AppRole;
import astreinte.entities.MediaReference;
import astreinte.entities.Site;

import java.util.List;

public interface MediaReferenceService {

    public MediaReference saveMediaReference(MediaReference mediaReference);

    public AppRole saveRole(AppRole appRole);

    public void addSiteToMediaReference(String usernanme, String role);

    public MediaReference findMediaReferenceByLabel(String username);

    public List<MediaReference> findMediaReferenceBySite(Site mediaReferenceSite);

}
