package astreinte.repositories;


import astreinte.entities.Occupancy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OccupancyRepository extends JpaRepository<Occupancy, Long> {
}
