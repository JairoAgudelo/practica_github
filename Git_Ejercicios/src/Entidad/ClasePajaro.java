
package Entidad;

public class ClasePajaro {

    private String color;
    private String genero;
    private float peso;
    private int cantiPlumas;
    private float edad;

    public ClasePajaro(String color, String genero, float peso, int cantiPlumas, float edad) {
        this.color = color;
        this.genero = genero;
        this.peso = peso;
        this.cantiPlumas = cantiPlumas;
        this.edad = edad;
    }

    public ClasePajaro() {
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

    public int getCantiPlumas() {
        return cantiPlumas;
    }

    public void setCantiPlumas(int cantiPlumas) {
        this.cantiPlumas = cantiPlumas;
    }

    public float getEdad() {
        return edad;
    }

    public void setEdad(float edad) {
        this.edad = edad;
    }
    

    
}
