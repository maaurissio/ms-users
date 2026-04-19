package cl.duoc.cordillera.repository;

import cl.duoc.cordillera.entity.Region;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RegionRepository  implements PanacheRepository<Region>{
    
}
