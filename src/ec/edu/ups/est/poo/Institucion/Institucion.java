package ec.edu.ups.est.poo.Institucion;
import  java.util.GregorianCalendar;
public class Institucion {

    private GregorianCalendar fechaInicio;
    private String role;
    private String identificacionSede;
    private String ubicacion;

    private Institucion(){

    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getIdentificacionSede() {
        return identificacionSede;
    }

    public void setIdentificacionSede(String identificacionSede) {
        this.identificacionSede = identificacionSede;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
