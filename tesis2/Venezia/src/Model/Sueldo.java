/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.DriverManager;
import java.util.ArrayList;
import venezia.HeladeriaManager;
import static venezia.HeladeriaManager.CONN_STR;

/**
 *
 * @author Usuario-PC
 */
public class Sueldo {
    int id_sueldo;
    int cuantoxhora;
    int horas;
    int id_empleado;
    double totalPagar;    
    Empleado e;
    String fecha;
    int estado;
    //ArrayList<Empleado> dto;
    
 private HeladeriaManager g;

    
    


    public double getTotalPagar() {
        return totalPagar;
    }
    

    public Sueldo() {
         this.id_empleado = 0;
        this.cuantoxhora = 0;
        this.horas = 0;
         this.totalPagar=cuantoxhora*horas;
    }

    public Sueldo(int id_sueldo, int cuantoxhora, int horas, int id_empleado,String fecha,int estado) {
        this.id_sueldo = id_sueldo;
        this.cuantoxhora = cuantoxhora;
        this.horas = horas;
        this.id_empleado = id_empleado;
        this.totalPagar=cuantoxhora*horas;
        this.fecha=fecha;
        this.estado=estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Sueldo( int cuantoxhora, int horas, int id_empleado, double totalPagar, String fecha, int estado) {
        
        this.cuantoxhora = cuantoxhora;
        this.horas = horas;
        this.id_empleado = id_empleado;
        this.totalPagar = totalPagar;
        this.fecha = fecha;
        this.estado = estado;
        
    }
    //id_sueldo, cuantoxhora, horas, id_empleado, fecha , estado
 public Sueldo(int cuantoxhora, int horas,int id_empleado,String fecha,int estado) {
        this.cuantoxhora = cuantoxhora;
        this.horas = horas;
        this.id_empleado = id_empleado;
        this.totalPagar=cuantoxhora*horas;
        this.fecha=fecha;
        this.estado=estado;
    }
  public Sueldo(String fecha,int estado) {
        this.cuantoxhora = cuantoxhora;
        this.horas = horas;
        this.totalPagar=cuantoxhora*horas;
         //this.dto = new ArrayList<>();
    }
  public Sueldo(int cuantoxhora, int horas) {
        this.cuantoxhora = cuantoxhora;
        this.horas = horas;
        this.totalPagar=cuantoxhora*horas;
         //this.dto = new ArrayList<>();
    }
  public Sueldo(int id_empleado) {
       
        this.id_empleado = id_empleado;
        this.cuantoxhora = 0;
        this.horas = 0;
         this.totalPagar=cuantoxhora*horas;
        
    }
  


    public int getId_sueldo() {
        return id_sueldo;
    }

    public void setId_sueldo(int id_sueldo) {
        this.id_sueldo = id_sueldo;
    }

    public int getCuantoxhora() {
        return cuantoxhora;
    }

    public void setCuantoxhora(int cuantoxhora) {
        this.cuantoxhora = cuantoxhora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    
    public String estadoToString(){
    String estado="";
    switch(this.estado){
        case 0: estado="Pagado"; break;
        case 1: estado="Sin Pagar"; break;
        
    }
        return estado;
    }
    

    public Object getNombre() {
       return e.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getApellido() {
       return e.getApellido();
    }
    
    
    
}
