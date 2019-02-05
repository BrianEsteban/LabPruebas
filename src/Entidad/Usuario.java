
package Entidad;


public class Usuario {
    
    private String nombre;
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
