package ec.edu.ups.est.poo;
import ec.edu.ups.est.poo.enums.TipoDireccion;
public class Direccion {
    private TipoDireccion tipoDireccion;
    private String pais;
    private String provinicia;
    private String ciudad;
    private String callePrincipal;
    private String calleSecundaria;
    private String numeracion;

    public Direccion(){

    }

    public Direccion(TipoDireccion tipoDireccion, String ciudad, String callePrincipal, String calleSecundaria, String provinicia, String pais, String numeracion) {
        this.tipoDireccion = tipoDireccion;
        this.ciudad = ciudad;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.provinicia = provinicia;
        this.pais = pais;
        this.numeracion = numeracion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getProvinicia() {
        return provinicia;
    }

    public void setProvinicia(String provinicia) {
        this.provinicia = provinicia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    public TipoDireccion getTipoDireccion() {
        return tipoDireccion;
    }

    public void setTipoDireccion(TipoDireccion tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "\nTipo de direccion: " + tipoDireccion+
                "\nPais: "+ pais +
                "\nProvincia: " + provinicia +
                "\nCiudad: " + ciudad +
                "\nCalle Principal: "+ callePrincipal +
                "\nCalle Secundaria: " + calleSecundaria +
                "\nNumeracion: " + numeracion;
    }
}

