package astreinte.repositories;


import astreinte.entities.SiteMaintenanceList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SiteMaintenanceListRepository extends JpaRepository<SiteMaintenanceList,Long> {
}
