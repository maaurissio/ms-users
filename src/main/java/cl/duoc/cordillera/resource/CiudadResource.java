package cl.duoc.cordillera.resource;

import java.util.List;

import cl.duoc.cordillera.entity.Ciudad;
import cl.duoc.cordillera.repository.CiudadRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/ciudades")
@Produces(MediaType.APPLICATION_JSON)
public class CiudadResource {
    @Inject
    CiudadRepository repository;

    @GET
    @Path("/region/{regionId}")
    public List<Ciudad> listByRegion(@PathParam("regionId") Long RegionId){
        return repository.list("region.id", RegionId);
    }
}
