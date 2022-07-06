/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca_regional;

/**
 *
 * @author Lab10
 */
public class usuario {

    public String getCodigo_usuario() {
        return codigo_usuario;
    }

    public void setCodigo_usuario(String codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero_identificacion() {
        return numero_identificacion;
    }

    public void setNumero_identificacion(String numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    public usuario(String codigo_usuario, String nombre, String numero_identificacion) {
        this.codigo_usuario = codigo_usuario;
        this.nombre = nombre;
        this.numero_identificacion = numero_identificacion;
    }
    private String codigo_usuario;
    private String nombre;
    private String numero_identificacion;
}
