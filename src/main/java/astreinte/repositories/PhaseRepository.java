package astreinte.repositories;


import astreinte.entities.Phase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PhaseRepository extends JpaRepository<Phase,Long> {
}
