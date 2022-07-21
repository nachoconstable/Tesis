/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Usuario-PC
 */
public class Ventas {
    
    int id_venta,id_empleado;
    String fecha;  
ArrayList<DtoDetalleVenta> dtoV;
    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Ventas() {
    }

    public Ventas(int id_venta, int id_empleado, String fecha) {
        this.id_venta = id_venta;
        this.id_empleado = id_empleado;
        this.fecha = fecha;
    }

    public Ventas(int id_empleado, String fecha) {
        this.id_empleado = id_empleado;
        this.fecha = fecha;
        this.dtoV = new ArrayList<>();
    }
    
    
}
