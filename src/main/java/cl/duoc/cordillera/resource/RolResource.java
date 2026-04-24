package cl.duoc.cordillera.resource;

import cl.duoc.cordillera.dto.RolRequestDTO;
import cl.duoc.cordillera.dto.RolResponseDTO;
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
    public List<RolResponseDTO> getAll() {
        return service.listarActivos()
                .stream()
                .map(service::toDTO)
                .toList();
    }

    @GET
    @Path("/{id}")
    public RolResponseDTO getById(@PathParam("id") UUID id) {
        return service.toDTO(service.obtenerPorId(id));
    }

    @POST
    public Response create(RolRequestDTO dto) {

        Rol rol = service.fromDTO(dto);
        Rol creado = service.crear(rol);

        return Response.status(Response.Status.CREATED)
                .entity(service.toDTO(creado))
                .build();
    }

    @PUT
    @Path("/{id}")
    public RolResponseDTO update(@PathParam("id") UUID id, RolRequestDTO dto) {

        Rol rol = service.fromDTO(dto);
        Rol actualizado = service.actualizar(id, rol);

        return service.toDTO(actualizado);
    }

    @PUT
    @Path("/{id}/activar")
    public RolResponseDTO activar(@PathParam("id") UUID id) {
        return service.toDTO(service.activar(id));
    }

    @PUT
    @Path("/{id}/desactivar")
    public RolResponseDTO desactivar(@PathParam("id") UUID id) {
        return service.toDTO(service.desactivar(id));
    }
}