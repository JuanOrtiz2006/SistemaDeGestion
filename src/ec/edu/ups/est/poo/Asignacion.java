package ec.edu.ups.est.poo;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import ec.edu.ups.est.poo.enums.TipoRol;

public class Asignacion {
    private Persona persona;
    private GregorianCalendar fechaInicio;
    private TipoRol rol;

    public Asignacion() {}

    public Asignacion(Persona persona, GregorianCalendar fechaInicio, TipoRol rol) {
        this.persona = persona;
        this.fechaInicio = fechaInicio;
        this.rol = rol;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public TipoRol getRol() {
        return rol;
    }

    public void setRol(TipoRol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = (fechaInicio != null) ? formato.format(fechaInicio.getTime()) : "Sin fecha";
        return  "\nFecha de inicio: " + fechaFormateada +
                "\nRol: " + rol +
                "\nPersona: {" + persona +
                "\n}";
    }
}
