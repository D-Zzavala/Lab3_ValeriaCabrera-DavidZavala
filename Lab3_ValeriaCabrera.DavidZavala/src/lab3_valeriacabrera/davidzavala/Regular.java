/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_valeriacabrera.davidzavala;

/**
 *
 * @author Usuario
 */
public class Regular extends EstadodeRegistro {
    
    private String usuario;
    private long contrasena;

    public Regular() {
        super();
    }

    public Regular(String usuario, long contrasena, boolean ingreso) {
        super(ingreso);
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public long getContrasena() {
        return contrasena;
    }

    public void setContrasena(long contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Regular{" + "usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }
    
    
    
    
    
}
