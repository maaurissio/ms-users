package cl.duoc.cordillera.service;

import cl.duoc.cordillera.dto.SucursalRequestDTO;
import cl.duoc.cordillera.dto.SucursalResponseDTO;
import cl.duoc.cordillera.entity.Sucursal;
import cl.duoc.cordillera.repository.SucursalRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.WebApplicationException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class SucursalService {

    @Inject
    SucursalRepository repository;

    public List<Sucursal> listarActivos() {
        return repository.list("activo", true);
    }

    public Sucursal obtenerPorId(UUID id) {
        return repository.findByIdOptional(id)
                .orElseThrow(() -> new NotFoundException("Sucursal no encontrada"));
    }

    @Transactional
    public Sucursal crear(Sucursal sucursal) {

        if (repository.existePorNombre(sucursal.nombre)) {
            throw new WebApplicationException("Ya existe una sucursal con ese nombre", 409);
        }

        sucursal.creadoEn = LocalDateTime.now();
        sucursal.actualizadoEn = LocalDateTime.now();

        repository.persist(sucursal);

        return sucursal;
    }

    @Transactional
    public Sucursal activar(UUID id) {
        Sucursal s = obtenerPorId(id);
        s.activo = true;
        s.actualizadoEn = LocalDateTime.now();
        return s;
    }

    @Transactional
    public Sucursal desactivar(UUID id) {
        Sucursal s = obtenerPorId(id);
        s.activo = false;
        s.actualizadoEn = LocalDateTime.now();
        return s;
    }

    public SucursalResponseDTO toDTO(Sucursal s) {
        SucursalResponseDTO dto = new SucursalResponseDTO();

        dto.id = s.id;
        dto.nombre = s.nombre;
        dto.direccion = s.direccion;

        return dto;
    }

    public Sucursal fromDTO(SucursalRequestDTO dto) {
        Sucursal s = new Sucursal();

        s.nombre = dto.nombre;
        s.direccion = dto.direccion;

        return s;
    }
}