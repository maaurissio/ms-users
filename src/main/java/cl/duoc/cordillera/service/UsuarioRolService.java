package cl.duoc.cordillera.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import cl.duoc.cordillera.dto.UsuarioRolRequestDTO;
import cl.duoc.cordillera.dto.UsuarioRolResponseDTO;
import cl.duoc.cordillera.entity.Rol;
import cl.duoc.cordillera.entity.Usuario;
import cl.duoc.cordillera.entity.UsuarioRol;
import cl.duoc.cordillera.repository.RolRepository;
import cl.duoc.cordillera.repository.UsuarioRepository;
import cl.duoc.cordillera.repository.UsuarioRolRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.WebApplicationException;

@ApplicationScoped
public class UsuarioRolService {
    
    @Inject
    UsuarioRolRepository usuarioRolRepository;

    @Inject
    UsuarioRepository usuarioRepository;

    @Inject
    RolRepository rolRepository;

    public List<UsuarioRol> listarActivos() {
        return usuarioRolRepository.list("activo", true);
    }

    @Transactional
    public UsuarioRol asignarRol(UsuarioRolRequestDTO dto) {

        Usuario usuario = usuarioRepository.findByIdOptional(dto.usuarioId)
                .orElseThrow(() -> new NotFoundException("Usuario no encontrado"));

        Rol rol = rolRepository.findByIdOptional(dto.rolId)
                .orElseThrow(() -> new NotFoundException("Rol no encontrado"));

        if (usuarioRolRepository.existeAsignacionActiva(usuario, rol)) {
            throw new WebApplicationException("El usuario ya tiene este rol", 409);
        }

        UsuarioRol ur = new UsuarioRol();
        ur.usuario = usuario;
        ur.rol = rol;
        ur.asignadoEn = LocalDateTime.now();
        ur.activo = true;

        usuarioRolRepository.persist(ur);

        return ur;
    }

    public List<UsuarioRol> listarRolesPorUsuario(UUID usuarioId) {

        Usuario usuario = usuarioRepository.findByIdOptional(usuarioId)
                .orElseThrow(() -> new NotFoundException("Usuario no encontrado"));

        return usuarioRolRepository.listarRolesPorUsuario(usuario);
    }

    public List<UsuarioRol> listarUsuariosPorRol(UUID rolId) {

        Rol rol = rolRepository.findByIdOptional(rolId)
                .orElseThrow(() -> new NotFoundException("Rol no encontrado"));

        return usuarioRolRepository.listarUsuariosPorRol(rol);
    }

    @Transactional
    public UsuarioRol desactivarAsignacion(UUID id) {

        UsuarioRol usuarioRol = usuarioRolRepository.findByIdOptional(id)
                .orElseThrow(() -> new NotFoundException("Asignación usuario-rol no encontrada"));

        usuarioRol.activo = false;

        return usuarioRol;
    }

    public UsuarioRolResponseDTO toDTO(UsuarioRol ur) {

        UsuarioRolResponseDTO dto = new UsuarioRolResponseDTO();

        dto.id = ur.id;

        dto.usuarioId = ur.usuario.id;
        dto.nombreUsuario = ur.usuario.nombre;

        dto.rolId = ur.rol.id;
        dto.nombreRol = ur.rol.nombre;

        dto.asignadoEn = ur.asignadoEn;

        return dto;
    }

}
