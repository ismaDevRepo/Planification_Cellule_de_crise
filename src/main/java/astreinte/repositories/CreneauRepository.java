package astreinte.repositories;


import astreinte.entities.Creneau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CreneauRepository extends JpaRepository<Creneau,Long> {
}
