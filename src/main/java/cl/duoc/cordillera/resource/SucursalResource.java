package cl.duoc.cordillera.resource;

import cl.duoc.cordillera.dto.SucursalRequestDTO;
import cl.duoc.cordillera.dto.SucursalResponseDTO;
import cl.duoc.cordillera.entity.Sucursal;
import cl.duoc.cordillera.service.SucursalService;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.UUID;

@Path("/sucursales")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SucursalResource {

    @Inject
    SucursalService service;

    /*
     * Lista todas las sucursales activas.
     * Se usa SucursalResponseDTO para no exponer campos internos como:
     * activo, creadoEn y actualizadoEn.
     */
    @GET
    public List<SucursalResponseDTO> getAll() {
        return service.listarActivos()
                .stream()
                .map(service::toDTO)
                .toList();
    }

    /*
     * Obtiene una sucursal por ID.
     * Devuelve solo los datos necesarios para el cliente.
     */
    @GET
    @Path("/{id}")
    public SucursalResponseDTO getById(@PathParam("id") UUID id) {
        return service.toDTO(service.obtenerPorId(id));
    }

    /*
     * Crea una nueva sucursal.
     * Se recibe un RequestDTO y se responde con un ResponseDTO.
     */
    @POST
    public Response create(SucursalRequestDTO dto) {
        Sucursal sucursal = service.fromDTO(dto);
        Sucursal creada = service.crear(sucursal);

        return Response.status(Response.Status.CREATED)
                .entity(service.toDTO(creada))
                .build();
    }

    /*
     * Activa una sucursal.
     * Aunque se modifica el estado internamente, no se expone el campo activo.
     */
    @PUT
    @Path("/{id}/activar")
    public SucursalResponseDTO activar(@PathParam("id") UUID id) {
        return service.toDTO(service.activar(id));
    }

    /*
     * Desactiva una sucursal.
     * Aunque se modifica el estado internamente, no se expone el campo activo.
     */
    @PUT
    @Path("/{id}/desactivar")
    public SucursalResponseDTO desactivar(@PathParam("id") UUID id) {
        return service.toDTO(service.desactivar(id));
    }
}