package Servicios;

<<<<<<< HEAD
import Entidad.Clases;
=======
import Entidad.claseCaballo;
import Entidad.claseGato;
import Entidad.clasePerro;
>>>>>>> jairo
import java.util.Scanner;


public class ServiciosClases {
    Scanner cap= new Scanner(System.in).useDelimiter("\n");
<<<<<<< HEAD
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
    
=======
    claseGato cg=new claseGato();
    clasePerro cp= new clasePerro();
    claseCaballo cc= new claseCaballo();
    
    
    public void datosGato(){
        System.out.println("Ingrese el nombre del gato");
        cg.setNombre(cap.next());
        System.out.println("Ingrese el color del pelaje");
        cg.setColorPelaje(cap.next());
        System.out.println("Ingrese la raza del gato");
        cg.setRaza(cap.next());
        System.out.println("Ingrese la edad del gato");
        cg.setEdad(cap.nextInt());
        System.out.println("¿Es domestio? S/N");
        cg.setDomestico(cap.next());
    }
    public void mostrarGato(){
        System.out.println("El gato se llama "+cg.getNombre());
        System.out.println("El gato es de color "+cg.getColorPelaje());
        System.out.println("El gato es de raza"+cg.getRaza());
        System.out.println("El gato tiene "+cg.getEdad()+" Años");
        if(cg.getDomestico().equalsIgnoreCase("s")||cg.getDomestico().equalsIgnoreCase("SI")){
            System.out.println("El gato es domestico");
        }
        else{
            System.out.println("El gato no es domestico");
        }
        
    }
    public void datosPerro(){
        System.out.println("Ingrese el nombre del perro");
        cp.setNombre(cap.next());
        System.out.println("Ingrese el color del pelaje");
        cp.setColorPelaje(cap.next());
        System.out.println("Ingrese el tamaño del perro en cm");
        cp.setTamaño(cap.nextInt());
        System.out.println("Ingrese la raza del perro");
        cp.setRaza(cap.next());
        System.out.println("Ingrese la edad del perro");
        cp.setEdad(cap.nextInt());
        System.out.println("¿Es Entrenado? S/N");
        cp.setEntrenado(cap.next());
    }
    public void mostrarPerro(){
        System.out.println("El Perro se llama "+cp.getNombre());
        System.out.println("El Perro es de color "+cp.getColorPelaje());
        System.out.println("El perro mide "+cp.getTamaño()+" cm");
        System.out.println("El Perro es de raza "+cp.getRaza());
        System.out.println("El Perro tiene "+cp.getEdad()+" Años");
        if(cp.getEntrenado().equalsIgnoreCase("s")||cp.getEntrenado().equalsIgnoreCase("SI")){
            System.out.println("El perro es entrenado");
        }
        else{
            System.out.println("El perro no es entrenado");
        }
        
    }
    public void datosCaballo(){
        System.out.println("Ingrese el nombre del caballo");
        cc.setNombre(cap.next());
        System.out.println("Ingrese el color del pelaje");
        cc.setColorPelaje(cap.next());
        System.out.println("Ingrese la altura del caballo en cm");
        cc.setAltura(cap.nextInt());
        System.out.println("Ingrese la raza del caballo");
        cc.setRaza(cap.next());
        System.out.println("Ingrese la edad del caballo");
        cc.setEdad(cap.nextInt());
        System.out.println("¿El caballo es de carreras? S/N");
        cc.setTrabajoCarreras(cap.next());
    }
    public void mostrarCaballo(){
        System.out.println("El caballo se llama "+cc.getNombre());
        System.out.println("El caballo es de color "+cc.getColorPelaje());
        System.out.println("El caballo mide "+cc.getAltura()+" cm");
        System.out.println("El caballo es de raza "+cc.getRaza());
        System.out.println("El caballo tiene "+cc.getEdad()+" Años");
        if(cc.getTrabajoCarreras().equalsIgnoreCase("s")||cc.getTrabajoCarreras().equalsIgnoreCase("SI")){
            System.out.println("El caballo es de carreras");
        }
        else{
            System.out.println("El caballo no es de carreras");
        }
    }
>>>>>>> jairo
}
