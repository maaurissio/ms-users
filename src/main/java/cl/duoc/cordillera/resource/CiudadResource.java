package cl.duoc.cordillera.resource;

import java.util.List;
import java.util.Locale;

import cl.duoc.cordillera.entity.Ciudad;
import cl.duoc.cordillera.repository.CiudadRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/ciudades")
@Produces(MediaType.APPLICATION_JSON)
public class CiudadResource {
    @Inject
    CiudadRepository repository;

    @GET
    @Path("/buscar")
    public List<Ciudad> searchByNombre(@QueryParam("nombre") String nombre) {
        if (nombre == null || nombre.isBlank()) {
            return repository.listAll();
        }

        String nombreNormalizado = "%" + nombre.toLowerCase(Locale.ROOT) + "%";
        return repository.list("lower(nombre) like ?1", nombreNormalizado);
    }

    @GET
    @Path("/region/{regionId}")
    public List<Ciudad> listByRegion(@PathParam("regionId") Long RegionId){
        return repository.list("region.id", RegionId);
    }

    @GET
    @Path("/region/nombre/{nombreRegion}")
    public List<Ciudad> listByRegionName(@PathParam("nombreRegion") String nombreRegion) {
        if (nombreRegion == null || nombreRegion.isBlank()) {
            return repository.listAll();
        }

        String regionNormalizada = "%" + nombreRegion.toLowerCase(Locale.ROOT) + "%";
        return repository.list("lower(region.nombre) like ?1", regionNormalizada);
    }
}
