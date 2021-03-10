package astreinte.repositories;


import astreinte.entities.CycleCollection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RepositoryRestResource
public interface CycleCollectionRepository extends JpaRepository<CycleCollection, Long> {
}
