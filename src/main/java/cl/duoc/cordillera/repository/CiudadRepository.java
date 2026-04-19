package cl.duoc.cordillera.repository;

import cl.duoc.cordillera.entity.Ciudad;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CiudadRepository implements PanacheRepository<Ciudad> {
    
}
