package cl.duoc.cordillera.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

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

    @Transactional
    public UsuarioRol asignarRol(UUID usuarioId, UUID rolId) {

        Usuario usuario = usuarioRepository.findByIdOptional(usuarioId)
                .orElseThrow(() -> new NotFoundException("Usuario no encontrado"));

        Rol rol = rolRepository.findByIdOptional(rolId)
                .orElseThrow(() -> new NotFoundException("Rol no encontrado"));

        if (usuarioRolRepository.existeAsignacionActiva(usuario, rol)) {
            throw new WebApplicationException("El usuario ya tiene este rol asignado", 409);
        }

        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.usuario = usuario;
        usuarioRol.rol = rol;
        usuarioRol.asignadoEn = LocalDateTime.now();
        usuarioRol.activo = true;

        usuarioRolRepository.persist(usuarioRol);

        return usuarioRol;
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

}
