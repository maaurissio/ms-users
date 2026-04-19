package cl.duoc.cordillera.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ciudad extends PanacheEntity{
    public String nombre;

    @ManyToOne
    @JoinColumn(name = "region_id")
    public Region region;
}