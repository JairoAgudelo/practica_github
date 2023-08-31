
package Servicios;

import Entidad.ClasePajaro;
import java.util.Scanner;

public class ServiceClassBird {
    Scanner read = new Scanner(System.in);
    ClasePajaro bird = new ClasePajaro();
    //metodo cargar informacion
    public ClasePajaro cargarInfoDuck(){
        System.out.println("Acontinuacion ingresaras informacion importante del Pajaro ");
        System.out.println("");
        
        System.out.println("Dgite el color del Pajaro ");
        bird.setColor(read.next());
        System.out.println("Digite el genero del Pajaro ");
        bird.setGenero(read.next());
        System.out.println("Digite el peso del Pajaro ");
        bird.setPeso(read.nextFloat());
        System.out.println("Digite la cantidad de plumas del Pajaro ");
        bird.setCantiPlumas(read.nextInt());
        System.out.println("Digite la edad del Pajaro");
        bird.setEdad(read.nextFloat());
        return null;
    }
    //metodo mostrar informacion
    public ClasePajaro mostrarInformacion(){
        System.out.println("El color del Pajaro es :" + bird.getColor());
        System.out.println("El genero del Pajaro : " + bird.getGenero());
        System.out.println("El peso es :" + bird.getPeso());
        System.out.println("La cantidad de plumas es :" + bird.getCantiPlumas());
        System.out.println("La edad es : " + bird.getEdad());
        return null;
    }
    
}
