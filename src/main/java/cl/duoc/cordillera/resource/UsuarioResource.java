package cl.duoc.cordillera.resource;

import cl.duoc.cordillera.dto.UsuarioRequestDTO;
import cl.duoc.cordillera.dto.UsuarioResponseDTO;
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

    /**
     * Lista todos los usuarios activos.
     * Se utiliza UsuarioResponseDTO para evitar exponer datos sensibles como:
     * - passwordHash
     * - estado
     * - fechas internas (creadoEn, actualizadoEn)
     */
    @GET
    public List<UsuarioResponseDTO> getAll() {
        return service.listarActivos()
                .stream()
                .map(service::toDTO)
                .toList();
    }

    /**
     * Crea un nuevo usuario.
     * Se recibe un UsuarioRequestDTO para controlar los datos de entrada.
     * No se expone passwordHash en la respuesta, ya que se devuelve un ResponseDTO.
     */
    @POST
    public Response create(UsuarioRequestDTO dto) {

        Usuario usuario = service.fromDTO(dto);
        Usuario creado = service.crear(usuario);

        return Response.status(Response.Status.CREATED)
                .entity(service.toDTO(creado))
                .build();
    }

    /**
     * Obtiene un usuario por su ID.
     * Se devuelve un DTO que omite datos internos y sensibles.
     */
    @GET
    @Path("/{id}")
    public UsuarioResponseDTO getById(@PathParam("id") UUID id) {
        return service.toDTO(service.obtenerPorId(id));
    }

    /**
     * Busca usuarios por nombre.
     * Se devuelve una lista de DTOs para evitar exponer información sensible.
     */
    @GET
    @Path("/buscar")
    public List<UsuarioResponseDTO> searchByNombre(@QueryParam("nombre") String nombre) {
        return service.buscarPorNombre(nombre)
                .stream()
                .map(service::toDTO)
                .toList();
    }

    /**
     * Desactiva un usuario.
     * Aunque se modifica el estado internamente, no se expone el campo estado en la respuesta.
     */
    @PUT
    @Path("/{id}/desactivar")
    public UsuarioResponseDTO desactivar(@PathParam("id") UUID id) {
        return service.toDTO(service.desactivar(id));
    }

    /**
     * Activa un usuario.
     * Se devuelve un DTO que oculta campos internos del modelo.
     */
    @PUT
    @Path("/{id}/activar")
    public UsuarioResponseDTO activar(@PathParam("id") UUID id) {
        return service.toDTO(service.activar(id));
    }
}