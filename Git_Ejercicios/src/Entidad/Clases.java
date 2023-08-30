package Entidad;

/*
Gato, Perro, Caballo, Conejo, Pájaro y Pato.
*/
public class Clases {
    private String gato;
    private String perro;
    private String caballo;
    private String conejo;
    private String pajaro;
    private String pato;

    public Clases(String gato, String perro, String caballo, String conejo, String pajaro, String pato) {
        this.gato = gato;
        this.perro = perro;
        this.caballo = caballo;
        this.conejo = conejo;
        this.pajaro = pajaro;
        this.pato = pato;
    }

    public Clases() {
    }
    

    public String getGato() {
        return gato;
    }

    public void setGato(String gato) {
        this.gato = gato;
    }

    public String getPerro() {
        return perro;
    }

    public void setPerro(String perro) {
        this.perro = perro;
    }

    public String getCaballo() {
        return caballo;
    }

    public void setCaballo(String caballo) {
        this.caballo = caballo;
    }

    public String getConejo() {
        return conejo;
    }

    public void setConejo(String conejo) {
        this.conejo = conejo;
    }

    public String getPajaro() {
        return pajaro;
    }

    public void setPajaro(String pajaro) {
        this.pajaro = pajaro;
    }

    public String getPato() {
        return pato;
    }

    public void setPato(String pato) {
        this.pato = pato;
    }
    
}
