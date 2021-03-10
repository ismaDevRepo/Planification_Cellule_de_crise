package astreinte.repositories;

import astreinte.entities.ModeleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ModeleTypeRepository extends JpaRepository<ModeleType, Long> {
}
