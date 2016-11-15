/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Fernando
 */
public class Catalogo {
    
    private String Nombre, Marca, Status, Cantidad, ID;

    public Catalogo() {
        this.Nombre = "";
        this.Marca = "";
        this.Status = "";
        this.Cantidad = "";
        this.ID = "";
    }
    
    public Catalogo(String Nombre, String Marca, String Status, String Cantidad, String ID) {
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Status = Status;
        this.Cantidad = Cantidad;
        this.ID = ID;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    
}
