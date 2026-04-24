package cl.duoc.cordillera.service;

import cl.duoc.cordillera.dto.UsuarioSucursalRequestDTO;
import cl.duoc.cordillera.dto.UsuarioSucursalResponseDTO;
import cl.duoc.cordillera.entity.Sucursal;
import cl.duoc.cordillera.entity.Usuario;
import cl.duoc.cordillera.entity.UsuarioSucursal;
import cl.duoc.cordillera.repository.SucursalRepository;
import cl.duoc.cordillera.repository.UsuarioRepository;
import cl.duoc.cordillera.repository.UsuarioSucursalRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.WebApplicationException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class UsuarioSucursalService {

    @Inject
    UsuarioSucursalRepository usuarioSucursalRepository;

    @Inject
    UsuarioRepository usuarioRepository;

    @Inject
    SucursalRepository sucursalRepository;

    public List<UsuarioSucursal> listarActivos() {
        return usuarioSucursalRepository.list("activo", true);
    }

    @Transactional
    public UsuarioSucursal asignarSucursal(UsuarioSucursalRequestDTO dto) {

        Usuario usuario = usuarioRepository.findByIdOptional(dto.usuarioId)
                .orElseThrow(() -> new NotFoundException("Usuario no encontrado"));

        Sucursal sucursal = sucursalRepository.findByIdOptional(dto.sucursalId)
                .orElseThrow(() -> new NotFoundException("Sucursal no encontrada"));

        if (usuarioSucursalRepository.existeAsignacionActiva(usuario, sucursal)) {
            throw new WebApplicationException("El usuario ya tiene esta sucursal asignada", 409);
        }

        UsuarioSucursal us = new UsuarioSucursal();
        us.usuario = usuario;
        us.sucursal = sucursal;
        us.asignadoEn = LocalDateTime.now();
        us.activo = true;

        usuarioSucursalRepository.persist(us);

        return us;
    }

    public List<UsuarioSucursal> listarSucursalesPorUsuario(UUID usuarioId) {
        Usuario usuario = usuarioRepository.findByIdOptional(usuarioId)
                .orElseThrow(() -> new NotFoundException("Usuario no encontrado"));

        return usuarioSucursalRepository.listarSucursalesPorUsuario(usuario);
    }

    public List<UsuarioSucursal> listarUsuariosPorSucursal(UUID sucursalId) {
        Sucursal sucursal = sucursalRepository.findByIdOptional(sucursalId)
                .orElseThrow(() -> new NotFoundException("Sucursal no encontrada"));

        return usuarioSucursalRepository.listarUsuariosPorSucursal(sucursal);
    }

    @Transactional
    public UsuarioSucursal desactivarAsignacion(UUID id) {
        UsuarioSucursal us = usuarioSucursalRepository.findByIdOptional(id)
                .orElseThrow(() -> new NotFoundException("Asignación usuario-sucursal no encontrada"));

        us.activo = false;

        return us;
    }

    public UsuarioSucursalResponseDTO toDTO(UsuarioSucursal us) {
        UsuarioSucursalResponseDTO dto = new UsuarioSucursalResponseDTO();

        dto.id = us.id;

        dto.usuarioId = us.usuario.id;
        dto.nombreUsuario = us.usuario.nombre;

        dto.sucursalId = us.sucursal.id;
        dto.nombreSucursal = us.sucursal.nombre;

        dto.asignadoEn = us.asignadoEn;

        return dto;
    }
}