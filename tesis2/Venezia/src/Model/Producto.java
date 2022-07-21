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
public class Producto {
    int cod_producto;
    String descripcion;
    int cantidad;
    int pre_venta;
    int pre_compra;
    int unidad_medida;

   

    public int getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(int cod_producto) {
        this.cod_producto = cod_producto;
    }

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

    public int getPre_venta() {
        return pre_venta;
    }

    public void setPre_venta(int pre_venta) {
        this.pre_venta = pre_venta;
    }

    public int getPre_compra() {
        return pre_compra;
    }

    public void setPre_compra(int pre_compra) {
        this.pre_compra = pre_compra;
    }

  

    public int getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(int unidad_medida) {
        this.unidad_medida = unidad_medida;
    }
 public String unidadToString(){
    String unidad_medida="";
   //"Kg", "Ltrs", "Grms", "Unidad"
    switch(this.unidad_medida){
        case 0: unidad_medida="Kg"; break;
        case 1: unidad_medida="Ltrs"; break;
        case 2: unidad_medida="Grms"; break;
        case 3: unidad_medida="Unidad"; break;
    }
            
    return unidad_medida;
   }
    public Producto(int cod_producto, String descripcion, int cantidad, int pre_venta, int pre_compra, int unidad_medida) {
        this.cod_producto = cod_producto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.pre_venta = pre_venta;
        this.pre_compra = pre_compra;
        this.unidad_medida = unidad_medida;
    }
     public Producto(int cod_producto, String descripcion ,int pre_compra ) {
        this.cod_producto = cod_producto;
        this.descripcion = descripcion;
        this.pre_compra = pre_compra;
    }
    public Producto( String descripcion, int cantidad, int pre_venta, int pre_compra,int unidad_medida) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.pre_venta = pre_venta;
        this.pre_compra = pre_compra;
        this.unidad_medida = unidad_medida;
    }
    
}
