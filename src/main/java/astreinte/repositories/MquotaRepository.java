package astreinte.repositories;

import astreinte.entities.Mquota;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MquotaRepository extends JpaRepository<Mquota,Long> {
}
