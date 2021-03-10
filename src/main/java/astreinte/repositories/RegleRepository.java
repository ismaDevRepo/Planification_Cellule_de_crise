package astreinte.repositories;

import astreinte.entities.Regle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RegleRepository extends JpaRepository<Regle, Long> {
}
