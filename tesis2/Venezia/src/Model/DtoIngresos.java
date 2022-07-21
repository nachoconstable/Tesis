/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Fernando M. de Lima
 */
public class DtoIngresos {
    String descripcion;
    int cantidad;
    int prec_unitario;
    String nombre;
    String apellido;
    String fecha;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrec_unitario() {
        return prec_unitario;
    }

    public void setPrec_unitario(int prec_unitario) {
        this.prec_unitario = prec_unitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public DtoIngresos(String descripcion, int cantidad, int prec_unitario, String nombre, String apellido, String fecha) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.prec_unitario = prec_unitario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
    }
    
}
