package astreinte.repositories;


import astreinte.entities.CelluleUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CelluleUserRepository extends JpaRepository<CelluleUser,Long> {
}
