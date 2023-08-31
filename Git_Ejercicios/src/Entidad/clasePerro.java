package Entidad;


public class clasePerro {
    private String nombre, raza, colorPelaje, entrenado;
    private int edad, tamaño;

    public clasePerro(String nombre, String raza, String colorPelaje, String entrenado, int edad, int tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.colorPelaje = colorPelaje;
        this.entrenado = entrenado;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public clasePerro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getEntrenado() {
        return entrenado;
    }

    public void setEntrenado(String entrenado) {
        this.entrenado = entrenado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

}
