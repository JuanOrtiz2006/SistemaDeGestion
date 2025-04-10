package ec.edu.ups.est.poo.rol;
import ec.edu.ups.est.poo.Persona;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
public class Visitante extends Persona{
    private String motivoVisita;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;

    public Visitante(){

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

    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaEntradaFormateada = (fechaEntrada != null) ? formato.format(fechaEntrada.getTime()) : "Sin fecha";
        String fechaSalidaFormateada = (fechaSalida != null) ? formato.format(fechaSalida.getTime()) : "Sin fecha";

        return super.toString() +
                "\nMotivo: " + motivoVisita +
                "\nFecha de entrada: " + fechaEntradaFormateada +
                "\nFecha de salida: " + fechaSalidaFormateada;
    }
}
