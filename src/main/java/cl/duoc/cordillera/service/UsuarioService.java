package cl.duoc.cordillera.service;

import cl.duoc.cordillera.dto.UsuarioRequestDTO;
import cl.duoc.cordillera.dto.UsuarioResponseDTO;
import cl.duoc.cordillera.entity.Usuario;
import cl.duoc.cordillera.enums.EstadoUsuario;
import cl.duoc.cordillera.repository.UsuarioRepository;
import cl.duoc.cordillera.repository.UsuarioRolRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.WebApplicationException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

@ApplicationScoped
public class UsuarioService {

    @Inject
    UsuarioRepository repository;

    @Inject
    UsuarioRolRepository usuarioRolRepository;

    //Listar activos
    public List<Usuario> listarActivos() {
        return repository.list("estado", EstadoUsuario.ACTIVO);
    }

    //Crear usuario
    @Transactional
    public Usuario crear(Usuario usuario) {

        if (repository.existePorRut(usuario.rut)) {
            throw new WebApplicationException("RUT ya existe", 409);
        }

        if (repository.existePorEmail(usuario.email)) {
            throw new WebApplicationException("Email ya existe", 409);
        }

        if (usuario.passwordHash == null || usuario.passwordHash.isBlank()) {
            throw new WebApplicationException("Password requerido", 400);
        }

        usuario.estado = EstadoUsuario.ACTIVO;
        usuario.creadoEn = LocalDateTime.now();
        usuario.actualizadoEn = LocalDateTime.now();

        repository.persist(usuario);

        return usuario;
    }

    //Buscar por ID
    public Usuario obtenerPorId(UUID id) {
        return repository.findByIdOptional(id)
                .orElseThrow(() -> new NotFoundException("Usuario no encontrado"));
    }

    //Buscar por nombre
    public List<Usuario> buscarPorNombre(String nombre) {

        if (nombre == null || nombre.isBlank()) {
            return listarActivos();
        }

        String filtro = "%" + nombre.toLowerCase(Locale.ROOT) + "%";

        return repository.list(
                "estado = ?1 and lower(nombre) like ?2",
                EstadoUsuario.ACTIVO,
                filtro
        );
    }

    //Desactivar
    @Transactional
    public Usuario desactivar(UUID id) {

        Usuario usuario = obtenerPorId(id);

        usuario.estado = EstadoUsuario.INACTIVO;
        usuario.actualizadoEn = LocalDateTime.now();

        return usuario;
    }

    //Activar
    @Transactional
    public Usuario activar(UUID id) {

        Usuario usuario = obtenerPorId(id);

        usuario.estado = EstadoUsuario.ACTIVO;
        usuario.actualizadoEn = LocalDateTime.now();

        return usuario;
    }

    public UsuarioResponseDTO toDTO(Usuario usuario) {
        UsuarioResponseDTO dto = new UsuarioResponseDTO();

        dto.id = usuario.id;
        dto.rut = usuario.rut;
        dto.nombre = usuario.nombre;
        dto.apellido = usuario.apellido;
        dto.email = usuario.email;

        dto.roles = usuarioRolRepository.listarRolesPorUsuario(usuario)
                .stream()
                .map(usuarioRol -> usuarioRol.rol.nombre)
                .toList();

        return dto;
    }

    public Usuario fromDTO(UsuarioRequestDTO dto) {
        Usuario usuario = new Usuario();

        usuario.rut = dto.rut;
        usuario.dv = dto.dv;
        usuario.nombre = dto.nombre;
        usuario.apellido = dto.apellido;
        usuario.email = dto.email;

        //En el futuro aquí va hash real
        usuario.passwordHash = dto.password;

        return usuario;
    }
}