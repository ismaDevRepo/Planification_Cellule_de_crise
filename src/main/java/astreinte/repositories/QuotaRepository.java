package astreinte.repositories;

import astreinte.entities.Quota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface QuotaRepository extends JpaRepository<Quota, Long> {
}
