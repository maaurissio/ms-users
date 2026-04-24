package cl.duoc.cordillera.resource;

import cl.duoc.cordillera.entity.UsuarioRol;
import cl.duoc.cordillera.service.UsuarioRolService;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.UUID;

@Path("/usuario-roles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioRolResource {

    @Inject
    UsuarioRolService service;

    @POST
    @Path("/asignar")
    public Response asignarRol(
            @QueryParam("usuarioId") UUID usuarioId,
            @QueryParam("rolId") UUID rolId
    ) {
        UsuarioRol asignacion = service.asignarRol(usuarioId, rolId);
        return Response.status(Response.Status.CREATED).entity(asignacion).build();
    }

    @GET
    @Path("/usuario/{usuarioId}")
    public List<UsuarioRol> listarRolesPorUsuario(@PathParam("usuarioId") UUID usuarioId) {
        return service.listarRolesPorUsuario(usuarioId);
    }

    @GET
    @Path("/rol/{rolId}")
    public List<UsuarioRol> listarUsuariosPorRol(@PathParam("rolId") UUID rolId) {
        return service.listarUsuariosPorRol(rolId);
    }

    @PUT
    @Path("/{id}/desactivar")
    public UsuarioRol desactivarAsignacion(@PathParam("id") UUID id) {
        return service.desactivarAsignacion(id);
    }
}