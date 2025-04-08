package ec.edu.ups.est.poo.rol;
import ec.edu.ups.est.poo.Persona;
public class Estudiante extends Persona{

    private String carrera;

    protected Estudiante(){

    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


}
