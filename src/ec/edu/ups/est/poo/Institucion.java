package ec.edu.ups.est.poo;

import ec.edu.ups.est.poo.enums.TipoDireccion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import  java.util.GregorianCalendar;
import java.util.List;

public class Institucion {

    private int id;
    private String nombre;
    private List<String> sedes;
    private GregorianCalendar fechaInicio;
    private Direccion direccion;
    private List<Asignacion> asignaciones;

    public Institucion(){
        this.asignaciones = new ArrayList<>();
    }

    public Institucion(int id, String nombre, GregorianCalendar fechaInicio, List<String> sedes, List<Asignacion> asignaciones) {
        this.id = id;
        this.nombre = nombre;
        this.sedes = sedes;
        this.fechaInicio = fechaInicio;
        this.asignaciones = asignaciones;
    }

    public void addDireccion( TipoDireccion tipoDireccion, String pais, String provinicia, String ciudad, String callePrincipal, String calleSecundaria, String numeracion) {
        this.direccion = new Direccion(tipoDireccion, pais,provinicia,ciudad,callePrincipal,calleSecundaria,numeracion);
    }


    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getSedes() {
        return sedes;
    }

    public void setSedes(List<String> sedes) {
        this.sedes = sedes;
    }

    public Direccion getDireccion() {
        return  direccion;
    }

    public void addAsignacion(Asignacion asignacion){
        asignaciones.add(asignacion);
    }

    public List<Asignacion> getAsignacion(){
        return asignaciones;
    }

    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = (fechaInicio != null) ? formato.format(fechaInicio.getTime()) : "Sin fecha";

        return "Id: " + id +
                "\nInstitucion: " + nombre +
                "\nSedes: " + sedes +
                "\nFecha de Inicio: " + fechaFormateada +
                "\n" + direccion +
                "\nAsignaciones: " + asignaciones;

    }
}
