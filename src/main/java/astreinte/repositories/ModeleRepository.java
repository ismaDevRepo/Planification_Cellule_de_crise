package astreinte.repositories;

import astreinte.entities.Modele;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ModeleRepository extends JpaRepository<Modele,Long> {
}
