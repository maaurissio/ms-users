package cl.duoc.cordillera.resource;

import cl.duoc.cordillera.dto.UsuarioSucursalRequestDTO;
import cl.duoc.cordillera.dto.UsuarioSucursalResponseDTO;
import cl.duoc.cordillera.entity.UsuarioSucursal;
import cl.duoc.cordillera.service.UsuarioSucursalService;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.UUID;

@Path("/usuario-sucursales")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioSucursalResource {

    @Inject
    UsuarioSucursalService service;

    @GET
    public List<UsuarioSucursalResponseDTO> getAll() {
        return service.listarActivos()
                .stream()
                .map(service::toDTO)
                .toList();
    }

    @POST
    public Response asignarSucursal(UsuarioSucursalRequestDTO dto) {
        UsuarioSucursal asignacion = service.asignarSucursal(dto);

        return Response.status(Response.Status.CREATED)
                .entity(service.toDTO(asignacion))
                .build();
    }

    @GET
    @Path("/usuario/{usuarioId}")
    public List<UsuarioSucursalResponseDTO> listarSucursalesPorUsuario(@PathParam("usuarioId") UUID usuarioId) {
        return service.listarSucursalesPorUsuario(usuarioId)
                .stream()
                .map(service::toDTO)
                .toList();
    }

    @GET
    @Path("/sucursal/{sucursalId}")
    public List<UsuarioSucursalResponseDTO> listarUsuariosPorSucursal(@PathParam("sucursalId") UUID sucursalId) {
        return service.listarUsuariosPorSucursal(sucursalId)
                .stream()
                .map(service::toDTO)
                .toList();
    }

    @PUT
    @Path("/{id}/desactivar")
    public UsuarioSucursalResponseDTO desactivarAsignacion(@PathParam("id") UUID id) {
        return service.toDTO(service.desactivarAsignacion(id));
    }
}