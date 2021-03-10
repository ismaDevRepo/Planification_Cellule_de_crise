package astreinte.repositories;


import astreinte.entities.Cellule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CelluleRepository extends JpaRepository<Cellule,Long> {
}
