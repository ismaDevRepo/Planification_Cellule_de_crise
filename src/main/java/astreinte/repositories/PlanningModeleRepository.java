package astreinte.repositories;

import astreinte.entities.PlanningModele;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PlanningModeleRepository extends JpaRepository<PlanningModele, Long> {
}
