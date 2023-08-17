
package com.caso02.caso02.Entities;
        
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Table(name="Cliente")
public class User implements Serializable{ //Creacion de la entidad usuario(Cliente)
    private static final long serial = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  
    @NotEmpty
    private String nombre;    
    private String apellido;
    private String correo;
    private String telefono;
    private String nombre_usuario;
    @NotEmpty
    private String contrasena;    
    private boolean activo;
    
    @OneToMany
    @JoinColumn(name="id_rol")
    private List<Rol> roles;
}
