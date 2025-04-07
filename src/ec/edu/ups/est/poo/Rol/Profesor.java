package ec.edu.ups.est.poo.Rol;
import ec.edu.ups.est.poo.Persona.Persona;
import java.util.List;
public class Profesor extends Persona{

    private List<String> titulosAcademicos;
    private List<String> areasDeEscpecializacion;

    protected Profesor(){

    }

    public List<String> getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void setTitulosAcademicos(List<String> titulosAcademicos) {
        this.titulosAcademicos = titulosAcademicos;
    }

    public List<String> getAreasDeEscpecializacion() {
        return areasDeEscpecializacion;
    }

    public void setAreasDeEscpecializacion(List<String> areasDeEscpecializacion) {
        this.areasDeEscpecializacion = areasDeEscpecializacion;
    }
}
