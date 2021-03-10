package astreinte.repositories;

import astreinte.entities.Mphase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MphaseRepository extends JpaRepository<Mphase, Long> {
}
