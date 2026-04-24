package cl.duoc.cordillera.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import cl.duoc.cordillera.entity.Rol;
import cl.duoc.cordillera.repository.RolRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.WebApplicationException;

@ApplicationScoped
public class RolService {
    
    @Inject
    RolRepository repository;

    public List<Rol> listarActivos(){
        return repository.list("activo", true);
    }

    public Rol obtenerPorId(UUID id) {
        return repository.findByIdOptional(id)
                .orElseThrow(() -> new NotFoundException("Rol no encontrado"));
    }

    @Transactional
    public Rol crear(Rol rol) {

        if (repository.existePorNombre(rol.nombre)) {
            throw new WebApplicationException("Ya existe un rol con ese nombre", 409);
        }

        rol.activo = true;
        rol.creadoEn = LocalDateTime.now();
        rol.actualizadoEn = LocalDateTime.now();

        repository.persist(rol);

        return rol;
    }

    @Transactional
    public Rol actualizar(UUID id, Rol datos) {

        Rol rol = obtenerPorId(id);

        rol.nombre = datos.nombre;
        rol.descripcion = datos.descripcion;
        rol.actualizadoEn = LocalDateTime.now();

        return rol;
    }

    @Transactional
    public Rol desactivar(UUID id) {

        Rol rol = obtenerPorId(id);

        rol.activo = false;
        rol.actualizadoEn = LocalDateTime.now();

        return rol;
    }

    @Transactional
    public Rol activar(UUID id) {

        Rol rol = obtenerPorId(id);

        rol.activo = true;
        rol.actualizadoEn = LocalDateTime.now();

        return rol;
    }

}
