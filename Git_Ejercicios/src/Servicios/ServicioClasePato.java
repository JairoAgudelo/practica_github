
package Servicios;

import Entidad.ClasePato;
import java.util.Scanner;

public class ServicioClasePato {
    Scanner read = new Scanner(System.in);
    ClasePato duck = new ClasePato();
    //metodo cargar informacion
    public ClasePato cargarInfoDuck(){
        System.out.println("Acontinuacion ingresaras informacion importante del Pato ");
        System.out.println("");
        
        System.out.println("Dgite el color del pato ");
        duck.setColor(read.next());
        System.out.println("Digite el genero del pato ");
        duck.setGenero(read.next());
        System.out.println("Digite el peso del pato ");
        duck.setPeso(read.nextFloat());
        System.out.println("Digite la cantidad de plumas del pato ");
        duck.setCantiPlumas(read.nextInt());
        System.out.println("Digite la edad del pato");
        duck.setEdad(read.nextFloat());
        return null;
    }
    //metodo mostrar informacion
    public ClasePato mostrarInformacion(){
        System.out.println("El color del pato es :" + duck.getColor());
        System.out.println("El genero del pato : " + duck.getGenero());
        System.out.println("El peso es :" + duck.getPeso());
        System.out.println("La cantidad de plumas es :" + duck.getCantiPlumas());
        System.out.println("La edad es : " + duck.getEdad());
        return null;
    }
    
}
