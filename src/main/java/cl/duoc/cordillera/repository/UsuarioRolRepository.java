package cl.duoc.cordillera.repository;

import java.util.List;
import java.util.UUID;

import cl.duoc.cordillera.entity.Rol;
import cl.duoc.cordillera.entity.Usuario;
import cl.duoc.cordillera.entity.UsuarioRol;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioRolRepository implements PanacheRepositoryBase <UsuarioRol, UUID> {
    
    public boolean existeAsignacionActiva(Usuario usuario, Rol rol){
        return find("usuario = ?1 and rol = ?2 and activo = true", usuario, rol)
                .firstResultOptional()
                .isPresent();
    }

    public List<UsuarioRol> listarRolesPorUsuario(Usuario usuario){
        return list("usuario = ?1 and activo = true", usuario);
    }

    public List<UsuarioRol> listarUsuariosPorRol(Rol rol) {
        return list("rol = ?1 and activo = true", rol);
    }
}
