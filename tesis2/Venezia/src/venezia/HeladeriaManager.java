/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venezia;

import Model.DtoDetalleVenta;
import Model.DtoIngresos;
import Model.DtoPedidoDetalle;
import Model.Egresos;
import Model.Empleado;
import Model.Pedidos;
import Model.Producto;
import Model.Sueldo;
import Model.Ventas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario-PC
 */
public class HeladeriaManager {

    //jdbc:sqlserver://USUARIO\SQLEXPRESS:1433;databaseName=HeladeriaVenezia4
    //jdbc:sqlserver://LAPTOP-5AEIROHB\SQLEXPRESS;databaseName=heladeria_venezia fer
    //jdbc:sqlserver://USUARIO\\SQLEXPRESS:1433;databaseName=heladeria_venezia casa
    //jdbc:sqlserver://DESKTOP-M7KPGMV\SQLEXPRESS:1433;databaseName=Heladeria_venezia
    public static final String CONN_STR = "jdbc:sqlserver://localhost:1433;databaseName=heladeria_venezia2";
    private String USER = "madara";
    private String PASS = "1234";
    private Connection conn;
    private String sSQL = "";
    public Integer totalproductos;

    public void AgregarNuevoEmpleado(Empleado empleado) throws SQLException {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);

        PreparedStatement stmt = conn.prepareStatement("INSERT INTO Empleados VALUES (?, ?, ?, ?, ?)");
        stmt.setInt(1, empleado.getNumero_Telefono());
        stmt.setString(2, empleado.getDireccion());
        stmt.setString(3, empleado.getNombre());
        stmt.setString(4, empleado.getApellido());
        stmt.setInt(5, empleado.getCargo());

        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }

    



    public void AgregarNuevoProducto(Producto p) throws SQLException {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);

        PreparedStatement stmt = conn.prepareStatement("INSERT INTO Productos VALUES (?, ?, ?, ?, ?)");

        stmt.setString(1, p.getDescripcion());
        stmt.setInt(2, p.getPre_venta());
        stmt.setInt(3, p.getPre_compra());
        stmt.setInt(4, p.getUnidad_medida());
        stmt.setInt(5, p.getCantidad());
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }

    public void AgregarHoras(Sueldo s) throws SQLException {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);

        PreparedStatement stmt = conn.prepareStatement("INSERT INTO Sueldo VALUES (?, ?, ?, ?, ?)");
        stmt.setInt(1, s.getCuantoxhora());
        stmt.setInt(2, s.getHoras());
        stmt.setInt(3, s.getId_empleado());
        stmt.setString(4,s.getFecha());
        stmt.setInt(5, s.getEstado());
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }

    public ArrayList<Empleado> EmpleadosSueldo() throws SQLException {
        ArrayList<Empleado> listAll = new ArrayList<Empleado>();
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet results = stmt.executeQuery("SELECT id_empleado, nombre ,apellido, cargo FROM Empleados");
        while (results.next()) {
            listAll.add(new Empleado(results.getInt("id_empleado"), results.getString("nombre"), results.getString("apellido"), results.getInt("cargo")));
        }
        results.close();
        stmt.close();
        conn.close();
        return listAll;
    }

    
    
    public ArrayList<Sueldo> Sueldo() throws SQLException {
        ArrayList<Sueldo> listAll = new ArrayList<Sueldo>();
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet results = stmt.executeQuery("select id_sueldo, cuantoxhora, horas, id_empleado,fecha,estado from  Sueldo ");
        
        while (results.next()) {
            listAll.add((new Sueldo(results.getInt("id_sueldo"),results.getInt("cuantoxhora"), results.getInt("horas"),results.getInt("id_empleado"),results.getString("Fecha"),results.getInt("estado"))));
        }
        results.close();
        stmt.close();
        conn.close();
        return listAll;
    }
   public void ModificarSueldo(Sueldo p) throws SQLException {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        PreparedStatement stmt = conn.prepareStatement("UPDATE Productos SET cuantoxhora = ?, horas = ?, id_empleado = ?, fecha = ?, estado = ? WHERE  id_sueldo = ?");
        stmt.setInt(1, p.getCuantoxhora());
        stmt.setInt(2, p.getHoras());
        stmt.setInt(3, p.getId_empleado());
        stmt.setString(4, p.getFecha());
        stmt.setInt(5, p.getEstado());

        stmt.close();
        conn.close();
    }

    // //int id, int Numero_Telefono, String Direccion, String Nombre, String Apellido, int horas_trabajadas, int cargo
    public void ModificarEmpleado(Empleado empleado) throws SQLException {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        PreparedStatement stmt = conn.prepareStatement("UPDATE Empleados SET nro_tel = ?, direccion = ?, nombre = ?, apellido = ?, cargo = ? WHERE  id_empleado = ?");
        stmt.setInt(1, empleado.getNumero_Telefono());
        stmt.setString(2, empleado.getDireccion());
        stmt.setString(3, empleado.getNombre());
        stmt.setString(4, empleado.getApellido());
        stmt.setInt(5, empleado.getCargo());
        stmt.setInt(6, empleado.getId());
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }

    public void ModificarProducto(Producto p) throws SQLException {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        PreparedStatement stmt = conn.prepareStatement("UPDATE Productos SET descripcion = ?, pre_venta = ?, pre_compra = ?, unidad_medida = ?, cantidad = ? WHERE  cod_producto = ?");
        stmt.setString(1, p.getDescripcion());
        stmt.setInt(2, p.getPre_venta());
        stmt.setInt(3, p.getPre_compra());
        stmt.setInt(4, p.getUnidad_medida());
        stmt.setInt(5, p.getCantidad());
        stmt.setInt(6, p.getCod_producto());

        stmt.close();
        conn.close();
    }

    public void borrarEmpleado(int ID) throws SQLException {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        PreparedStatement stmt = conn.prepareStatement("DELETE Empleados WHERE  id_empleado = ?");
        stmt.setInt(1, ID);
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }

    public void borrarProducto(int ID) throws SQLException {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        PreparedStatement stmt = conn.prepareStatement("DELETE Productos WHERE  cod_producto = ?");
        stmt.setInt(1, ID);
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }

    public void borrarPedido(int ID) throws SQLException {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        PreparedStatement stmt = conn.prepareStatement("DELETE Pedidos WHERE  cod_pedido = ?");
        stmt.setInt(1, ID);
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }

    public ArrayList<Empleado> LoadAll() throws SQLException {
        ArrayList<Empleado> listAll = new ArrayList<Empleado>();
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet results = stmt.executeQuery("SELECT * FROM Empleados");
        while (results.next()) {
            listAll.add(new Empleado(results.getInt("id_empleado"), results.getInt("nro_tel"), results.getString("direccion"), results.getString("nombre"), results.getString("apellido"), results.getInt("cargo")));
        }
        results.close();
        stmt.close();
        conn.close();
        return listAll;
    }

    public ArrayList<Producto> CargarProducto() throws SQLException {
        ArrayList<Producto> listAll = new ArrayList<Producto>();
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet results = stmt.executeQuery("SELECT * FROM Productos");
        while (results.next()) {
            ////int cod_producto, String descripcion, int cantidad, int pre_venta, int pre_compra, int guardar_almacen, String unidad_medida
            listAll.add(new Producto(results.getInt("cod_producto"), results.getString("descripcion"), results.getInt("cantidad"), results.getInt("pre_venta"), results.getInt("pre_compra"),results.getInt("unidad_medida")));
        }
        results.close();
        stmt.close();
        conn.close();
        return listAll;
    }

    public ArrayList<Producto> CargarProductoPedido() throws SQLException {
        ArrayList<Producto> listAll = new ArrayList<Producto>();
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet results = stmt.executeQuery("SELECT cod_producto,descripcion,pre_compra FROM Productos");
        while (results.next()) {
            ////int cod_producto, String descripcion, int cantidad, int pre_venta, int pre_compra, int guardar_almacen, String unidad_medida
            listAll.add(new Producto(results.getInt("cod_producto"), results.getString("descripcion"), results.getInt("pre_compra")));
        }
        results.close();
        stmt.close();
        conn.close();
        return listAll;
    }

    public ArrayList<Producto> CargarProducto(String buscar) throws SQLException {
        ArrayList<Producto> listAll = new ArrayList<Producto>();
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet results = stmt.executeQuery("select * from productos where cod_producto like'%" + buscar + "%' or descripcion like '%" + buscar + "%' order by cod_producto");
        while (results.next()) {
            listAll.add(new Producto(results.getInt("cod_producto"), results.getString("descripcion"), results.getInt("cantidad"), results.getInt("pre_venta"), results.getInt("pre_compra"),results.getInt("unidad_medida")));
        }
        results.close();
        stmt.close();
        conn.close();
        return listAll;
    }

   
    public double TotalPagar() throws SQLException {

        double totalPagar = 0;
        try {
            conn = DriverManager.getConnection(CONN_STR, USER, PASS);
            Statement stmt = conn.createStatement();

            ResultSet query = stmt.executeQuery("select (cuantoxhora * horas) as totalPagar from sueldo  order by id_empleado");

            if (query.next()) {
                totalPagar = query.getDouble("totalPagar");
            }

            stmt.close();
            conn.close();
            query.close();
        } catch (Exception e) {
            System.out.println(e);

        }
        return totalPagar;

    }

   public Empleado EmpleadoPorId(int idEmpleado){
       Empleado empleado = new Empleado();
        try {
            conn = DriverManager.getConnection(CONN_STR, USER, PASS);
            Statement stmt = conn.createStatement();

            ResultSet query = stmt.executeQuery("select * from empleados where id_empleado = "+idEmpleado);

            if (query.next()) {
                empleado.setNombre(query.getString("nombre"));
                empleado.setApellido(query.getString("apellido"));

            }

            stmt.close();
            conn.close();
            query.close();
        } catch (Exception e) {
            System.out.println(e);

        }
       return empleado;
   }
  
 // VENTAS
    
       public ArrayList<DtoDetalleVenta> cargarVenta() throws SQLException {
        ArrayList<DtoDetalleVenta> listAll = new ArrayList<DtoDetalleVenta>();
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet results = stmt.executeQuery("SELECT * FROM detalles_venta");
        while (results.next()) {
            //int cod_detalle, int id_venta, int cod_producto, int cantidad, int precio
            listAll.add(new DtoDetalleVenta(results.getInt("cod_detalle"), results.getInt("id_venta"), results.getInt("cod_producto"), results.getInt("cantidad"), results.getInt("precio")));
        }
        results.close();
        stmt.close();
        conn.close();
        return listAll;
    }
         public ArrayList<DtoDetalleVenta> cargarVenta1() throws SQLException {
        ArrayList<DtoDetalleVenta> listAll = new ArrayList<DtoDetalleVenta>();
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet results = stmt.executeQuery("SELECT Cantidad,cod_producto FROM detalles_venta");
        while (results.next()) {
            //int cod_detalle, int id_venta, int cod_producto, int cantidad, int precio
            listAll.add(new DtoDetalleVenta(results.getInt("cod_producto"), results.getInt("cantidad")));
        }
        results.close();
        stmt.close();
        conn.close();
        return listAll;
    }
      public ArrayList<DtoDetalleVenta> loadVenta (){
        ArrayList<DtoDetalleVenta> resultado = new ArrayList<>();
        
        try {
            conn = DriverManager.getConnection(CONN_STR, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet query = stmt.executeQuery("select * from detalles_venta");
                       
            while (query.next()){
                int codDetallePedido = query.getInt("cod_detalle_pedido");
                int codPedido = query.getInt("cod_pedido");
               
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
      public void AgregarVenta(Ventas v) throws SQLException {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);

        PreparedStatement stmt = conn.prepareStatement("INSERT INTO Ventas(id_empleado,fecha_venta,estado) VALUES ( ?, ?,'abierto')");

        stmt.setInt(1, v.getId_empleado());
        stmt.setString(2, v.getFecha());

        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
        public int UltimaVenta() throws SQLException {
        int id = 0;
        {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet query = stmt.executeQuery("select top 1 id_venta as id from ventas order by id_venta desc");
        if (query.next()) {
            id = query.getInt("id");
        }
        query.close();
        stmt.close();
        conn.close();
         }
        return id;
    }
         public void AgregarDetalleVenta(DtoDetalleVenta d) throws SQLException {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);

        PreparedStatement stmt = conn.prepareStatement("INSERT INTO detalles_venta (id_venta,cod_producto,cantidad,prec_unitario) VALUES (? ,?, ?, ?)");
        stmt.setInt(1, d.getId_venta());
        stmt.setInt(2, d.getCod_producto());
        stmt.setInt(3, d.getCantidad());
        stmt.setInt(4, d.getPrecio());
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
    
  
      
    public ArrayList<Ventas> cargarVentas(String buscar) throws SQLException {
        ArrayList<Ventas> listAll = new ArrayList<Ventas>();
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet results = stmt.executeQuery("select * from ventas where fecha_venta like'%" + buscar + "%' order by id_venta");
        while (results.next()) {
            listAll.add(new Ventas(results.getInt("id_venta"), results.getInt("id_empleado"), results.getString("fecha_venta")));
        }
        results.close();
        stmt.close();
        conn.close();
        return listAll;
    }
 public void borrarVenta(int ID) throws SQLException {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        PreparedStatement stmt = conn.prepareStatement("DELETE Ventas WHERE  id_empleado = ?");
        stmt.setInt(1, ID);
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
 //CAJA
 
 
   public void ModificarBanderaEgresos() throws SQLException {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        PreparedStatement stmt = conn.prepareStatement("UPDATE egresos SET estado = 'cerrado' WHERE  estado= 'abierto'");
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
     public void ModificarBanderaIngresos() throws SQLException {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        PreparedStatement stmt = conn.prepareStatement("UPDATE ventas SET estado = 'cerrado' WHERE  estado= 'abierto'");
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
     
     
public int totalIngresos(){
    int ingresos = 0;
    try{
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet query = stmt.executeQuery("select ISNULL(sum(prec_unitario* cantidad), 0) 'ingresos' from detalles_venta dv join ventas v on v.id_venta = dv.id_venta  where v.estado like'abierto'");
        if  (query.next()){
                ingresos = query.getInt("total ingresos");
        
        }
        
        }
        catch(Exception e){
           System.out.println(e);
        }
        return ingresos;
     
    }

public int totalEgresos(){
    int egresos = 0;
    try{
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet query = stmt.executeQuery("select ISNULL(sum(precio), 0)'egresos' from egresos where estado like 'abierto'");
        if  (query.next()){
                egresos = query.getInt("egresos");
        
        }
        
        }
        catch(Exception e){
           System.out.println(e);
        }
        return egresos;
}
    

 public int dineroCaja() throws SQLException{
     
     int ingresos = 0;
    
        
        try{
           conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet query = stmt.executeQuery("SELECT \n" +
"	SUM(dv.prec_unitario * dv.cantidad) - ISNULL((\n" +
"		SELECT SUM(e.precio)\n" +
"		FROM egresos e\n" +
"		WHERE e.estado like 'abierto'\n" +
"	), 0) 'total ingresos'\n" +
"FROM \n" +
"	detalles_venta dv\n" +
"	JOIN\n" +
"		ventas v ON dv.id_venta = v.id_venta\n" +
"WHERE\n" +
"	v.estado like 'abierto'");
        if  (query.next()){
                ingresos = query.getInt("total ingresos");
        
        }
        
        }
        catch(Exception e){
           System.out.println(e);
        }
        return ingresos;
     
 }
 
         public ArrayList<DtoIngresos> cargarIngreso() throws SQLException {
        ArrayList<DtoIngresos> listAll = new ArrayList<DtoIngresos>();
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet results = stmt.executeQuery("SELECT \n" +
"	p.Descripcion,\n" +
"	dv.cantidad,\n" +
"	dv.prec_unitario,\n" +
"	e.nombre,\n" +
"	e.apellido,\n" +
"	v.fecha_venta \n" +
"FROM\n" +
"	Empleados e\n" +
"	JOIN Ventas v\n" +
"		ON e.id_empleado = v.id_empleado\n" +
"	JOIN detalles_venta dv\n" +
"		ON v.id_venta = dv.id_venta\n" +
"	JOIN Productos p\n" +
"		ON dv.cod_producto = p.cod_producto\n" +
"WHERE\n" +
"	v.estado = 'abierto'");
        while (results.next()) {
            listAll.add(new DtoIngresos(results.getString("Descripcion"), results.getInt("cantidad"), results.getInt("prec_unitario"), results.getString("nombre"), results.getString("apellido"), results.getString("fecha_venta")));
        }
        results.close();
        stmt.close();
        conn.close();
        return listAll;
    }
          //s(String descripcion, int cantidad, int prec_unitario, String nombre, String apellido, String fecha) 


//PEDIDOS
    public ArrayList<DtoPedidoDetalle> cargarPedido() throws SQLException {
        ArrayList<DtoPedidoDetalle> listAll = new ArrayList<DtoPedidoDetalle>();
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet results = stmt.executeQuery("SELECT * FROM detalle_pedidos");
        while (results.next()) {
            listAll.add(new DtoPedidoDetalle(results.getInt("cod_detalle_pedido"), results.getInt("cod_pedido"), results.getInt("cod_producto"), results.getInt("cantidad"), results.getInt("pre_unitario")));
        }
        results.close();
        stmt.close();
        conn.close();
        return listAll;
    }
     public ArrayList<DtoPedidoDetalle> loadPedido (){
        ArrayList<DtoPedidoDetalle> resultado = new ArrayList<>();
        
        try {
            conn = DriverManager.getConnection(CONN_STR, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet query = stmt.executeQuery("select * from detalle_pedidos");
                       
            while (query.next()){
                int codDetallePedido = query.getInt("cod_detalle_pedido");
                int codPedido = query.getInt("cod_pedido");
               
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
       public int UltimoPedido() throws SQLException {
        int id = 0;
        {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet query = stmt.executeQuery("select top 1 cod_pedido as id from pedidos order by cod_pedido desc");
        if (query.next()) {
            id = query.getInt("id");
        }
        query.close();
        stmt.close();
        conn.close();
         }
        return id;
    }
        public void AgregarDetallePedido(DtoPedidoDetalle d) throws SQLException {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);

        PreparedStatement stmt = conn.prepareStatement("INSERT INTO detalle_Pedidos (cod_pedido,cod_producto,cantidad,pre_unitario) VALUES (? ,?, ?, ?)");
        stmt.setInt(1, d.getId_pedido());
        stmt.setInt(2, d.getId_producto());
        stmt.setInt(3, d.getCantidad());
        stmt.setInt(4, d.getPrecio_unitario());
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
        public void AgregarPedido(Pedidos p) throws SQLException {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);

        PreparedStatement stmt = conn.prepareStatement("INSERT INTO Pedidos(fecha,direccion) VALUES ( ?, ?)");

        stmt.setString(1, p.getFecha());
        stmt.setString(2, p.getDireccion());

        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
        
        //Egresos
        public void CargarEgreso(Egresos e) throws SQLException {
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);

        PreparedStatement stmt = conn.prepareStatement("INSERT INTO Egresos VALUES ( ?, ?, ?)");
        stmt.setInt(1, e.getPrecio());
        stmt.setString(2, e.getDescripcion());
        stmt.setString(3,e.getFecha());
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
          public ArrayList<Egresos> mostrarEgresos() throws SQLException {
        ArrayList<Egresos> listAll = new ArrayList<Egresos>();
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet results = stmt.executeQuery("SELECT * FROM Egresos where estado like'abierto'");
        while (results.next()) {
            listAll.add(new Egresos(results.getInt("cod_egreso"), results.getInt("precio"), results.getString("fecha"), results.getString("descripcion")));
        }
        results.close();
        stmt.close();
        conn.close();
        return listAll;
    }
          
          //GRAFICOS
          
              public ArrayList<Empleado> CantidadEmpleadosxCargo() throws SQLException {
        ArrayList<Empleado> listAll = new ArrayList<Empleado>();
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet results = stmt.executeQuery("select cargo as'cargo' ,count(cargo)as'Cantidad' from empleados group by cargo");
        while (results.next()) {
            listAll.add(new Empleado(results.getInt("Cargo")));
        }
        results.close();
        stmt.close();
        conn.close();
        return listAll;
    }
             
           
           public ArrayList<Empleado> mostrarEmpleado() throws SQLException {
        ArrayList<Empleado> listAll = new ArrayList<Empleado>();
        conn = DriverManager.getConnection(CONN_STR, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet results = stmt.executeQuery("SELECT id_empleado,nombre FROM Empleados ");
        while (results.next()) {
            listAll.add(new Empleado(results.getInt("id_empleado"),results.getString("nombre")));
        }
        results.close();
        stmt.close();
        conn.close();
        return listAll;
    }

        
}
