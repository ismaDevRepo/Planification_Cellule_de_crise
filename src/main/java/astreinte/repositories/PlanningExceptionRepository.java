package astreinte.repositories;

import astreinte.entities.PlanningException;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PlanningExceptionRepository extends JpaRepository<PlanningException, Long> {
}
