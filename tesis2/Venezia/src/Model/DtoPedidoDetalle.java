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
public class DtoPedidoDetalle {
    int id_pedido, id_producto, id_detalle, cantidad;
    int precio_unitario;

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(int precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public DtoPedidoDetalle() {
    }

    public DtoPedidoDetalle(int id_pedido, int id_producto, int id_detalle, int cantidad, int precio_unitario) {
        this.id_pedido = id_pedido;
        this.id_producto = id_producto;
        this.id_detalle = id_detalle;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
    }
     public DtoPedidoDetalle(int id_pedido, int id_producto, int cantidad, int precio_unitario) {
        this.id_pedido = id_pedido;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
    }
      public DtoPedidoDetalle(int id_producto, int cantidad, int precio_unitario) {
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
    }

    
    
    
}
