package ec.edu.ups.est.poo;
import ec.edu.ups.est.poo.Enums.TipoDireccion;

import  java.util.GregorianCalendar;
import java.util.List;

public class Institucion {

    private int id;
    private String nombre;
    private List<String> sedes;
    private GregorianCalendar fechaInicio;
    private Direccion direccion;

    private Institucion(){
    }

    public Institucion(int id, String nombre, List<String> sedes, GregorianCalendar fechaInicio) {
        this.id = id;
        this.nombre = nombre;
        this.sedes = sedes;
        this.fechaInicio = fechaInicio;
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

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                "\nInstitucion: " + nombre +
                "\nSedes: " + sedes +
                "\nFecha de Inicio" + fechaInicio +
                "\nDireccion: " + direccion;

    }
}
