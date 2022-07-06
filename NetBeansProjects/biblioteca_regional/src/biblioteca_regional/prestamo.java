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
public class prestamo {

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public String getCodigo_usuario() {
        return codigo_usuario;
    }

    public void setCodigo_usuario(String codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }

    public String getCodigo_libro() {
        return codigo_libro;
    }

    public void setCodigo_libro(String codigo_libro) {
        this.codigo_libro = codigo_libro;
    }

    public prestamo(String fecha_ingreso, String fecha_devolucion, String codigo_usuario, String codigo_libro) {
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_devolucion = fecha_devolucion;
        this.codigo_usuario = codigo_usuario;
        this.codigo_libro = codigo_libro;
    }
    private String fecha_ingreso;
    private String fecha_devolucion;
    private String codigo_usuario;
    private String codigo_libro;
    
}
