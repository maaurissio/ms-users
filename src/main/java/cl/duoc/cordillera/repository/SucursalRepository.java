package cl.duoc.cordillera.repository;

import cl.duoc.cordillera.entity.Sucursal;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.UUID;

@ApplicationScoped
public class SucursalRepository implements PanacheRepositoryBase<Sucursal, UUID> {

    public boolean existePorNombre(String nombre) {
        return find("nombre", nombre).firstResultOptional().isPresent();
    }
}