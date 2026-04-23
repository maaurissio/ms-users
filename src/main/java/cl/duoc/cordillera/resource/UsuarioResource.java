package cl.duoc.cordillera.resource;

import cl.duoc.cordillera.entity.Usuario;
import cl.duoc.cordillera.service.UsuarioService;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.UUID;

@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioResource {

    @Inject
    UsuarioService service;

    @GET
    public List<Usuario> getAll() {
        return service.listarActivos();
    }

    @POST
    public Response create(Usuario usuario) {
        Usuario nuevo = service.crear(usuario);
        return Response.status(Response.Status.CREATED).entity(nuevo).build();
    }

    @GET
    @Path("/{id}")
    public Usuario getById(@PathParam("id") UUID id) {
        return service.obtenerPorId(id);
    }

    @GET
    @Path("/buscar")
    public List<Usuario> searchByNombre(@QueryParam("nombre") String nombre) {
        return service.buscarPorNombre(nombre);
    }

    @PUT
    @Path("/{id}/desactivar")
    public Usuario desactivar(@PathParam("id") UUID id) {
        return service.desactivar(id);
    }

    @PUT
    @Path("/{id}/activar")
    public Usuario activar(@PathParam("id") UUID id) {
        return service.activar(id);
    }
}