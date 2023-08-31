package Servicios;

import Entidad.Clases;
import java.util.Scanner;


public class ServiciosClases {
    Scanner cap= new Scanner(System.in).useDelimiter("\n");
    Clases clas= new Clases();
    
    
    public void datosAtributos(){
        System.out.println("Ingrese los atributos del gato");
        clas.setGato(cap.next());
        System.out.println("Ingrese los atributos del perro");
        clas.setPerro(cap.next());
        System.out.println("Ingrese los atributos del caballo");
        clas.setCaballo(cap.next());
        System.out.println("Ingrese los atributos del conejo");
        clas.setConejo(cap.next());
        System.out.println("Ingrese los atributos del pajaro");
        clas.setPajaro(cap.next());
        System.out.println("Ingrese los atributos del pato");
        clas.setPato(cap.next());
        
    }
    
}
