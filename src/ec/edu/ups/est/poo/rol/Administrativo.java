package ec.edu.ups.est.poo.rol;
import ec.edu.ups.est.poo.Persona;
import java.util.List;
public class Administrativo extends Persona{

    private List<String> cargos;
    private List<String> responsabilidades;

    public Administrativo(){

    }

    public List<String> getCargos() {
        return cargos;
    }

    public void setCargos(List<String> cargos) {
        this.cargos = cargos;
    }

    public List<String> getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(List<String> responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCargos: " + cargos +
                "\nResponsabilidades: " + responsabilidades;
    }
}
