package Ejercicios;

import Servicios.ServiciosClases;
import java.util.Scanner;


public class MainClases {
           
    
    public static void main(String[] args) {
        Scanner cap=new Scanner(System.in).useDelimiter("\n");
        ServiciosClases sc= new ServiciosClases();
        sc.datosGato();
        sc.mostrarGato();
        sc.datosPerro();
        sc.mostrarPerro();
    }
}
 
