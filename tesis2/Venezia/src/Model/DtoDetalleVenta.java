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
public class DtoDetalleVenta {
    int cod_detalle,id_venta,cod_producto,cantidad,precio;

    public int getCod_detalle() {
        return cod_detalle;
    }

    public void setCod_detalle(int cod_detalle) {
        this.cod_detalle = cod_detalle;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(int cod_producto) {
        this.cod_producto = cod_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public DtoDetalleVenta(int cod_detalle, int id_venta, int cod_producto, int cantidad, int precio) {
        this.cod_detalle = cod_detalle;
        this.id_venta = id_venta;
        this.cod_producto = cod_producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public DtoDetalleVenta() {
    }

    public DtoDetalleVenta(int id_venta, int cod_producto, int cantidad, int precio) {
        this.id_venta = id_venta;
        this.cod_producto = cod_producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public DtoDetalleVenta(int cod_producto, int cantidad) {
        this.cod_producto = cod_producto;
        this.cantidad = cantidad;
    }
    
    
}
