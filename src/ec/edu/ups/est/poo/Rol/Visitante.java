package ec.edu.ups.est.poo.Rol;
import ec.edu.ups.est.poo.Persona.Persona;
import java.util.GregorianCalendar;
public class Visitante extends Persona{
    private String motivoVisita;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;

    protected Visitante(){

    }

    public String getMotivoVisita() {
        return motivoVisita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }

    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(GregorianCalendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public GregorianCalendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(GregorianCalendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
