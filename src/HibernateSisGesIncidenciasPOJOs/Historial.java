package HibernateSisGesIncidenciasPOJOs;
// Generated 06-nov-2016 16:12:52 by Hibernate Tools 4.3.1



/**
 * Historial generated by hbm2java
 */
public class Historial  implements java.io.Serializable {


     private Integer idIncidencia;
     private Empleados empleados;
     private String tipoEvento;
     private String fechaHora;

    public Historial() {
    }

    public Historial(Empleados empleados, String tipoEvento, String fechaHora) {
       this.empleados = empleados;
       this.tipoEvento = tipoEvento;
       this.fechaHora = fechaHora;
    }
   
    public Integer getIdIncidencia() {
        return this.idIncidencia;
    }
    
    public void setIdIncidencia(Integer idIncidencia) {
        this.idIncidencia = idIncidencia;
    }
    public Empleados getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Empleados empleados) {
        this.empleados = empleados;
    }
    public String getTipoEvento() {
        return this.tipoEvento;
    }
    
    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
    public String getFechaHora() {
        return this.fechaHora;
    }
    
    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }




}

