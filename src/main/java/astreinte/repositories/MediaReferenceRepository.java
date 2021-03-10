package astreinte.repositories;


import astreinte.entities.MediaReference;
import astreinte.entities.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface MediaReferenceRepository extends JpaRepository<MediaReference, Long> {
    public MediaReference findByMrLabel(String mediaReferenceLabel);

    public List<MediaReference> findAllByMrIdSite(Site mrIdSite);
}
