package cl.duoc.cordillera.entity;

import cl.duoc.cordillera.enums.Rol;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "usuarios")
public class Usuario extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false, unique = true)
    public String rut;

    @Column(nullable = false)
    public String dv;

    @Column(nullable = false)
    public String nombre;

    @Column(nullable = false)
    public String apellido;

    @Column(unique = true, nullable = false)
    public String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    public Rol rol;

    public Boolean activo = true;

    @Column(nullable = true, name = "sucursal_id")
    public Long sucursalId;

    @ManyToOne 
    @JoinColumn(name = "ciudad_id", nullable = false) 
    public Ciudad ciudad;
}
