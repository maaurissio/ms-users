package cl.duoc.cordillera.resource;

import java.util.List;

import cl.duoc.cordillera.entity.Region;
import cl.duoc.cordillera.repository.RegionRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/regiones")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RegionResource {
    @Inject
    RegionRepository repository;

    @GET
    public List<Region> listAll(){
        return repository.listAll();
    }
}
