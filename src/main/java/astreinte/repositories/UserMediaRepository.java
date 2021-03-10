package astreinte.repositories;

import astreinte.entities.UserMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface UserMediaRepository extends JpaRepository<UserMedia, Long> {
}
