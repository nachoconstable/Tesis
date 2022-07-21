/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Fernando M. de Lima
 */
public class Pedidos {
   int codigo_pedido;
   ArrayList<DtoPedidoDetalle> dto;
   String fecha;
   String direccion;
 

    public String getDireccion() {
        return direccion;
    }

    public int getcodigo_pedido() {
        return codigo_pedido;
    }

    public void setfecha(String fecha) {
        this.fecha = fecha;
    }
    public String getFecha() {
        return fecha;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public Pedidos(int codigo_producto, int codigo_pedido,int pre_unitario, String fecha, String direccion) {
        this.codigo_pedido = codigo_pedido;
        this.fecha = fecha;
        this.direccion = direccion;
        this.dto = new ArrayList<>();
    }
     public Pedidos( int codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }
    public Pedidos( String fecha,String direccion ) {
        this.fecha = fecha;
        this.direccion = direccion;
      
    }

}


