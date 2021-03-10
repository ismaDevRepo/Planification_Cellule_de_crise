package astreinte.repositories;

import astreinte.entities.AppUser;
import astreinte.entities.Site;
import astreinte.entities.UserProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface UserPropertiesRepository extends JpaRepository<UserProperties, Long> {

    public UserProperties findByUpLabelAndUpSubLabel(String upLabel, String upSubLabel);

    public UserProperties findByUpLabel(String upLabel);

    public List<UserProperties> findByUpIdSite(Site upIdSite);

    public List<UserProperties> findByUpIdUser(AppUser upIdUser);
}
