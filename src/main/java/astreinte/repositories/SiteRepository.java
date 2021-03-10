package astreinte.repositories;
import astreinte.entities.Cellule;
import astreinte.entities.MediaReference;
import astreinte.entities.Site;
import astreinte.entities.UserProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface SiteRepository extends JpaRepository<Site, Long> {
    public Site findBySiteLieu(String siteLieu);

    public Site findBySiteNomRefLabel(String nomRefLabel);

    public Site findBySiteContactPrincipal(String contactPrincipal);

    public List<UserProperties> findAllBySiteUserPropertyList(Site s);

    public List<MediaReference> findAllBySiteMediaReferenceList(Site s);

    public List<Cellule> findDistinctBySiteCelluleList(Site s);



}
