package ec.edu.ups.est.poo.Rol;
import ec.edu.ups.est.poo.Persona.Persona;
public class Estudiante extends Persona{

    private String carrera;
    private String programa;
    private boolean matricula;

    protected Estudiante(){

    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }
}
