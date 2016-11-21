/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Edgardo Acosta
 */
public class Prestamo {
    private String Id_Prestamo,Solicitante,Matricula,Fecha_Solicitud,Fecha_Entrega,Status,Cantidad,Id_Catalogo;
    
    public Prestamo(String idPrestamo,String solicitante,String matricula,String fechaSol,String fechaEnt,String status,
            String cant,String idCatalog){
        Id_Prestamo = idPrestamo;
        Solicitante = solicitante;
        Matricula = matricula;
        Fecha_Solicitud = fechaSol;
        Fecha_Entrega = fechaEnt;
        Status = status;
        Cantidad = cant;
        Id_Catalogo = idCatalog;
    }

    public String getId_Pretamo() {
        return Id_Prestamo;
    }

    public void setId_Pretamo(String Id_Pretamo) {
        this.Id_Prestamo = Id_Prestamo;
    }

    public String getSolicitante() {
        return Solicitante;
    }

    public void setSolicitante(String Solicitante) {
        this.Solicitante = Solicitante;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getFecha_Solicitud() {
        return Fecha_Solicitud;
    }

    public void setFecha_Solicitud(String Fecha_Solicitud) {
        this.Fecha_Solicitud = Fecha_Solicitud;
    }

    public String getFecha_Entrega() {
        return Fecha_Entrega;
    }

    public void setFecha_Entrega(String Fecha_Entrega) {
        this.Fecha_Entrega = Fecha_Entrega;
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

    public String getId_Catalogo() {
        return Id_Catalogo;
    }

    public void setId_Catalogo(String Id_Catalogo) {
        this.Id_Catalogo = Id_Catalogo;
    }
    
}
