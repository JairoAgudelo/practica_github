package Ejercicios;

<<<<<<< HEAD
=======
import Servicios.ServiceClassBird;
import Servicios.ServiceClassRabbit;
import Servicios.ServicioClasePato;
>>>>>>> develop
import java.util.Scanner;


public class MainClases {

    int clases;
    Scanner cap;
    
    MainClases(){
        cap= new Scanner(System.in);
    }
            
    
    public static void main(String[] args) {
<<<<<<< HEAD
=======
        ServicioClasePato  serviceduck = new ServicioClasePato();
        serviceduck.cargarInfoDuck();
        serviceduck.mostrarInformacion();
        
        ServiceClassBird  servicebird = new ServiceClassBird();
        servicebird.cargarInfoDuck();
        servicebird.mostrarInformacion();
        
        ServiceClassRabbit  servicerabbit = new ServiceClassRabbit();
        servicerabbit.cargarInfoDuck();
        servicerabbit.mostrarInformacion();
>>>>>>> develop
        
    }
    
}
