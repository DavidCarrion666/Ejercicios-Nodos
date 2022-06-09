/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author SALA A
 */
public class Persona {

    private String nombre;
    private int edad;
    private int codigo;
    private Persona next;

    public Persona(String n, int e, int c) {
        nombre = n;
        edad = e;
        codigo = c;
    }
    

    public void siguiente(Persona p) {
        next = p;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public Persona establecerSiguiente(){
    return next;
    }
    
    public void cambiarDatos(String nuevonombre, int nuevaedad, int nuevocodigo) {
        nombre = nuevonombre;
        edad = nuevaedad;
        codigo = nuevocodigo;
    }
   

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nCodigo: "
         + codigo);

    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("""
                               %s
                               Nombre de la persona: %s
                               Edad de la persona: %d
                               Codigo de la persona: %d
                               """, 
                cadena, 
                nombre,
                edad,
                codigo);

        return cadena;
    }
}

