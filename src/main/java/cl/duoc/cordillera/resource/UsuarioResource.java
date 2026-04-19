package cl.duoc.cordillera.resource;

import java.util.List;
import java.util.Locale;
import cl.duoc.cordillera.entity.Usuario;
import cl.duoc.cordillera.enums.Rol;
import cl.duoc.cordillera.repository.UsuarioRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)


public class UsuarioResource {
    
    @Inject
    UsuarioRepository repository; // Se inyecta el Repository Pattern creado

    @GET
    public List<Usuario> getAll(){
        return repository.list("activo", true); // Retorna solo usuarios activos
    }

    @GET
    @Path("/clientes")
    public List<Usuario> getClientesActivos() {
        return repository.list("rol = ?1 and activo = true", Rol.CLIENTE);
    }

    @POST
    @Transactional
    public void create(Usuario usuario){
        repository.persist(usuario); // Guarda el nuevo usuario creado
    }

    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") Long id) {
        Usuario usuario = repository.find("id = ?1 and activo = true", id).firstResult();
        if (usuario == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Usuario no encontrado")
                    .build();
        }
        return Response.ok(usuario).build();
    }

    @GET
    @Path("/buscar")
    public List<Usuario> searchByNombre(@QueryParam("nombre") String nombre) {
        if (nombre == null || nombre.isBlank()) {
            return repository.list("activo", true);
        }

        String nombreNormalizado = "%" + nombre.toLowerCase(Locale.ROOT) + "%";
        return repository.list("activo = true and lower(nombre) like ?1", nombreNormalizado);
    }

    @PUT
    @Path("/{id}/desactivar")
    @Transactional
    public Response deactivateById(@PathParam("id") Long id) {
        Usuario usuario = repository.findById(id);
        if (usuario == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Usuario no encontrado")
                    .build();
        }

        usuario.activo = false;
        return Response.ok(usuario).build();
    }

    @PUT
    @Path("/{id}/activar")
    @Transactional
    public Response activateById(@PathParam("id") Long id) {
        Usuario usuario = repository.findById(id);
        if (usuario == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Usuario no encontrado")
                    .build();
        }

        usuario.activo = true;
        return Response.ok(usuario).build();
    }
}
