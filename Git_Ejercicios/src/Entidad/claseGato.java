package Entidad;


public class claseGato {

    private String nombre, colorPelaje, raza, domestico;
    private int edad;

    public claseGato(String nombre, String colorPelaje, String raza, String domestico, int edad) {
        this.nombre = nombre;
        this.colorPelaje = colorPelaje;
        this.raza = raza;
        this.domestico = domestico;
        this.edad = edad;
    }

    public claseGato() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDomestico() {
        return domestico;
    }

    public void setDomestico(String domestico) {
        this.domestico = domestico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
