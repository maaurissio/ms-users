package cl.duoc.cordillera.resource;

import cl.duoc.cordillera.entity.Rol;
import cl.duoc.cordillera.service.RolService;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.UUID;

@Path("/roles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RolResource {

    @Inject
    RolService service;

    @GET
    public List<Rol> getAll() {
        return service.listarActivos();
    }

    @GET
    @Path("/{id}")
    public Rol getById(@PathParam("id") UUID id) {
        return service.obtenerPorId(id);
    }

    @POST
    public Response create(Rol rol) {
        Rol nuevo = service.crear(rol);
        return Response.status(Response.Status.CREATED).entity(nuevo).build();
    }

    @PUT
    @Path("/{id}")
    public Rol update(@PathParam("id") UUID id, Rol rol) {
        return service.actualizar(id, rol);
    }

    @PUT
    @Path("/{id}/activar")
    public Rol activar(@PathParam("id") UUID id) {
        return service.activar(id);
    }

    @PUT
    @Path("/{id}/desactivar")
    public Rol desactivar(@PathParam("id") UUID id) {
        return service.desactivar(id);
    }
}