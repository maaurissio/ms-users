package cl.duoc.cordillera.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Region extends PanacheEntity{
    public String nombre;
}
