/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio;

import java.util.Scanner;

/**
 *
 * @author SALA A
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p;
        Persona p2;
        Persona p3;
        p = ingresoInformacion();
        
        p2 = ingresoInformacion();
        p.siguiente(p2);
        
        p3 = ingresoInformacion();
        p2.siguiente(p3);
        
        System.out.println("**********************************************");
        System.out.print(p);
        System.out.println(p.establecerSiguiente());
        System.out.println(p2.establecerSiguiente());
        
        if(p.obtenerNombre().equals(p2.obtenerNombre()) ||
                (p.obtenerNombre().equals(p3.obtenerNombre())) || 
                (p2.obtenerNombre().equals(p3.obtenerNombre()))){
            System.out.println("Existen nombres iguales");
        }
        

        

    }

    public static Persona ingresoInformacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la edad del usuario");
        int edad = sc.nextInt();
        System.out.println("Ingrese el codigo del usuario");
        int codigo = sc.nextInt();
        Persona p = new Persona(nombre, edad, codigo);
        return p;

    }

}
