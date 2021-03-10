package astreinte.repositories;


import astreinte.entities.Cycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CycleRepository extends JpaRepository<Cycle,Long> {
}
