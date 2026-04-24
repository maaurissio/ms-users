package cl.duoc.cordillera.resource;

import cl.duoc.cordillera.dto.UsuarioRolRequestDTO;
import cl.duoc.cordillera.dto.UsuarioRolResponseDTO;
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
    public Response asignarRol(UsuarioRolRequestDTO dto) {

        UsuarioRol ur = service.asignarRol(dto);

        return Response.status(Response.Status.CREATED)
                .entity(service.toDTO(ur))
                .build();
    }

    @GET
    public List<UsuarioRolResponseDTO> getAll() {

        return service.listarActivos()
                .stream()
                .map(service::toDTO)
                .toList();
    }

    @GET
    @Path("/usuario/{usuarioId}")
    public List<UsuarioRolResponseDTO> listarRolesPorUsuario(@PathParam("usuarioId") UUID id) {

        return service.listarRolesPorUsuario(id)
                .stream()
                .map(service::toDTO)
                .toList();
    }

    @GET
    @Path("/rol/{rolId}")
    public List<UsuarioRolResponseDTO> listarUsuariosPorRol(@PathParam("rolId") UUID id) {

        return service.listarUsuariosPorRol(id)
                .stream()
                .map(service::toDTO)
                .toList();
    }

    @PUT
    @Path("/{id}/desactivar")
    public UsuarioRolResponseDTO desactivarAsignacion(@PathParam("id") UUID id) {
        return service.toDTO(service.desactivarAsignacion(id));
    }
}