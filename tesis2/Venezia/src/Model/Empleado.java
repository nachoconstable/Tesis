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
public class Empleado {
   int id;
   int Numero_Telefono;
   String Direccion;
   String Nombre;
   String Apellido;
   int cargo;

    public Empleado(int id, int Numero_Telefono, String Direccion, String Nombre, String Apellido, int cargo) {
        this.id = id;
        this.Numero_Telefono = Numero_Telefono;
        this.Direccion = Direccion;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        
        this.cargo = cargo;
    }
     public Empleado(int id,String Nombre) {
        this.id = id;  
        this.Nombre = Nombre;
        
     }

    public Empleado(String Nombre) {
        this.Nombre = Nombre;
    }

    public Empleado(int cargo) {
        
        this.cargo = cargo;
    }
     
    public Empleado(int id,String Nombre,String Apellido,int cargo) {
        this.id = id;  
        this.Nombre = Nombre;
        this.cargo = cargo;
        this.Apellido = Apellido;
    }
     public Empleado( int Numero_Telefono, String Direccion, String Nombre, String Apellido, int cargo) {
        
        this.Numero_Telefono = Numero_Telefono;
        this.Direccion = Direccion;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        
        this.cargo = cargo;
    }

    public Empleado() {
       this.Numero_Telefono = 0;
        this.Direccion = "";
        this.Nombre = "";
        this.Apellido = "";        
        this.cargo = 0;
    }
     

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero_Telefono() {
        return Numero_Telefono;
    }

    public void setNumero_Telefono(int Numero_Telefono) {
        this.Numero_Telefono = Numero_Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

   
    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }
 
  

    public String cargoToString(){
    String cargo="";
   
    switch(this.cargo){
        case 0: cargo="Empleado"; break;
        case 1: cargo="Encargado"; break;
        case 2: cargo="Refuerzo"; break;
    }
            
    return cargo;
   }

    public Empleado(int id, String Nombre, int cargo) {
        this.id = id;
        this.Nombre = Nombre;
        this.cargo = cargo;
    }
 
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", Numero_Telefono=" + Numero_Telefono + ", Direccion=" + Direccion + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", cargo=" + cargo + '}';
    }
   
   

    



   
  
   
   
           
}
