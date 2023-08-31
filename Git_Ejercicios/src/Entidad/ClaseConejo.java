
package Entidad;

public class ClaseConejo {
    private String color;
    private String genero;
    private float peso;
    private int cantiCrias;
    private float edad;

    public ClaseConejo(String color, String genero, float peso, int cantiCrias, float edad) {
        this.color = color;
        this.genero = genero;
        this.peso = peso;
        this.cantiCrias = cantiCrias;
        this.edad = edad;
    }

    public ClaseConejo() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getCantiCrias() {
        return cantiCrias;
    }

    public void setCantiCrias(int cantiCrias) {
        this.cantiCrias = cantiCrias;
    }

    public float getEdad() {
        return edad;
    }

    public void setEdad(float edad) {
        this.edad = edad;
    }
    
    
    
}
