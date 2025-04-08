package ec.edu.ups.est.poo.rol;
import ec.edu.ups.est.poo.Persona;
public class Estudiante extends Persona{

    private String carrera;

    public Estudiante(){

    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCarrera: " + carrera;
    }
}
