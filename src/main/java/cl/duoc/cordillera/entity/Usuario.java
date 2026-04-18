package cl.duoc.cordillera.entity;

import cl.duoc.cordillera.enums.Rol;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Usuario extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String nombre;

    @Column(nullable = false)
    public String apellido;

    @Column(unique = true, nullable = false)
    public String email;

    @Enumerated(EnumType.STRING)
    public Rol rol;

    public Boolean activo = true;

    @Column(name = "sucursal_id")
    public Long sucursalId;

}
