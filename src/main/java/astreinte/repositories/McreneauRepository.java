package astreinte.repositories;

import astreinte.entities.Mcreneau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface McreneauRepository extends JpaRepository<Mcreneau, Long> {
}
