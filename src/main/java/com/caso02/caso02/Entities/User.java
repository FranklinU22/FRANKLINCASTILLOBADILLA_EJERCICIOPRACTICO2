
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
import lombok.Data;

@Entity
@Data
@Table(name="Cliente")
public class User implements Serializable{
    private static final long serial = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    private String nombre;    
    private String apellido;
    private String correo;
    private String telefono;
    private String nombre_usuario;
    private String contrasena;    
    private int id_rol;
    
    @OneToMany
    @JoinColumn(name="id_rol")
    private List<Rol> roles;
}
