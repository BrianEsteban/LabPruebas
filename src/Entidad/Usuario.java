
package Entidad;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuarios")
public class Usuario implements Serializable{
    
    private String nombre;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String password;
    
    public Usuario (){
    }
    
    public String getNombre(){
        return nombre;
    
    }

    public void setNombre(String val){
        this.nombre=val;
    }
    
    public String getPassword(){
    return password;
    
    }

    public void setPassword(String val){
        this.password=val;
    }
}
