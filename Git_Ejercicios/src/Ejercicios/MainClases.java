package Ejercicios;

<<<<<<< HEAD
<<<<<<< HEAD
=======
import Servicios.ServiceClassBird;
import Servicios.ServiceClassRabbit;
import Servicios.ServicioClasePato;
>>>>>>> develop
=======
import Servicios.ServiceClassBird;
import Servicios.ServiceClassRabbit;
import Servicios.ServicioClasePato;
=======
import Servicios.ServiciosClases;
>>>>>>> jairo
>>>>>>> develop
import java.util.Scanner;


public class MainClases {
<<<<<<< HEAD

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
=======
           
    
    public static void main(String[] args) {
        Scanner cap=new Scanner(System.in).useDelimiter("\n");
        ServiciosClases sc= new ServiciosClases();
        sc.datosGato();
        sc.mostrarGato();
        sc.datosPerro();
        sc.mostrarPerro();
    }
}
 
>>>>>>> jairo
