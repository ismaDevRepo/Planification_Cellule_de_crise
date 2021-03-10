package astreinte.repositories;

import astreinte.entities.Mcycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface McycleRepository extends JpaRepository<Mcycle, Long> {
}
