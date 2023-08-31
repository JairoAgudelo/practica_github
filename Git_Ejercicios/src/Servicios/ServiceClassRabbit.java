
package Servicios;

import Entidad.ClaseConejo;
import java.util.Scanner;

public class ServiceClassRabbit {
    Scanner read = new Scanner(System.in);
    ClaseConejo rabbit = new ClaseConejo();
    //metodo cargar informacion
    public ClaseConejo cargarInfoDuck(){
        System.out.println("Acontinuacion ingresaras informacion importante del Conejo ");
        System.out.println("");
        
        System.out.println("Dgite el color del Conejo ");
        rabbit.setColor(read.next());
        System.out.println("Digite el genero del Conejo ");
        rabbit.setGenero(read.next());
        System.out.println("Digite el peso del Conejo ");
        rabbit.setPeso(read.nextFloat());
        System.out.println("Digite la cantidad de plumas del Conejo ");
        rabbit.setCantiCrias(read.nextInt());
        System.out.println("Digite la edad del Conejo");
        rabbit.setEdad(read.nextFloat());
        return null;
    }
    //metodo mostrar informacion
    public ClaseConejo mostrarInformacion(){
        System.out.println("El color del Conejo es :" + rabbit.getColor());
        System.out.println("El genero del Conejo : " + rabbit.getGenero());
        System.out.println("El peso es :" + rabbit.getPeso());
        System.out.println("La cantidad de crias es :" + rabbit.getCantiCrias());
        System.out.println("La edad es : " + rabbit.getEdad());
        return null;
    }
    
}
