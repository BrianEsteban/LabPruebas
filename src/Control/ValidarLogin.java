
package Control;

import Entidad.Sistema;
import Entidad.Usuario;
import Frontera.FramePrincipal;

/**
 *
 * @author Enrique
 */
public class ValidarLogin {
    private Sistema sistema=FramePrincipal.sistema;
    
    public ValidarLogin(){
        
    }
    
    public Sistema getSistema(){
        return sistema;
    }
    
    public void setSistema(Sistema val){
        this.sistema=val;
        
    }
    
    public String verificarLogin(Usuario usuario){
        if(!verificarLongitudNombre(usuario.getNombre())){
            return("longitud nombre incorrecta");
        }
        if(!verificarLongitudPassword(usuario.getPassword())){
            return("longitud contraseña incorrecta");
        }
        for(Usuario u: sistema.getUsuarios()){
            if(u.getNombre().equals(usuario.getNombre())&& u.getPassword().equals(usuario.getPassword())){
                return("Bienvenido");
            }
        }
        return ("Datos incorrectos");
    }
    
    public boolean verificarLongitudNombre(String nombre){
        return (nombre.length()>1 && nombre.length()<=6);
        
    }
    
    public boolean verificarLongitudPassword(String password){
        return (password.length()>=3 && password.length()<6);
    }
    
}
