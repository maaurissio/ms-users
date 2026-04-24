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

    public List<UsuarioResponseDTO> getAll() {
        return service.listarActivos()
                .stream()
                .map(service::toDTO)
                .toList();
    }

    @POST
    public Response create(UsuarioRequestDTO dto) {

        Usuario usuario = service.fromDTO(dto);
        Usuario creado = service.crear(usuario);

        UsuarioResponseDTO response = service.toDTO(creado);

        return Response.status(Response.Status.CREATED)
                .entity(response)
                .build();
    }

    @GET
    @Path("/{id}")
    public UsuarioResponseDTO getById(UUID id) {
        return service.toDTO(service.obtenerPorId(id));
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