package cl.duoc.cordillera.repository;

import java.util.UUID;

import cl.duoc.cordillera.entity.Rol;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RolRepository implements PanacheRepositoryBase<Rol, UUID> {
    
    public boolean existePorNombre(String nombre){
        return find("nombre", nombre).firstResultOptional().isPresent();
    }
}
