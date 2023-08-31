package Entidad;


public class claseCaballo {
    private String nombre, colorPelaje, raza, trabajoCarreras;
    private int edad, altura;

    public claseCaballo(String nombre, String colorPelaje, String raza, String trabajoCarreras, int edad, int altura) {
        this.nombre = nombre;
        this.colorPelaje = colorPelaje;
        this.raza = raza;
        this.trabajoCarreras = trabajoCarreras;
        this.edad = edad;
        this.altura = altura;
    }

    public claseCaballo() {
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

    public String getTrabajoCarreras() {
        return trabajoCarreras;
    }

    public void setTrabajoCarreras(String trabajoCarreras) {
        this.trabajoCarreras = trabajoCarreras;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
}
