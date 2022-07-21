/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Usuario-PC
 */
public class Egresos {
    int cod_egreso,precio;
    String descripcion;
    String fecha;

    public Egresos (String descripcion,int precio , String fecha) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Egresos(int cod_egreso, int precio, String descripcion, String fecha) {
        this.cod_egreso = cod_egreso;
        this.precio = precio;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Egresos() {
    }

    public Egresos(int precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Egresos(int cod_egreso, int precio, String descripcion) {
        this.cod_egreso = cod_egreso;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getCod_egreso() {
        return cod_egreso;
    }

    public void setCod_egreso(int cod_egreso) {
        this.cod_egreso = cod_egreso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
