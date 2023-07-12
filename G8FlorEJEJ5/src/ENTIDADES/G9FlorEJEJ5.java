/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDADES;

import Servicios.PersonaServis;

/**
 *
 * @author ARG
 */
public class G9FlorEJEJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            PersonaServis personaServis = new PersonaServis();

        Persona persona = personaServis.crearPersona;

        int edad = personaServis.calcularEdad(persona);
        System.out.println("La edad de " + persona.getNombre() + " es: " + edad + " años");

        int edadComparar = 30;
        boolean esMenor = personaServis.menorQue(persona, edadComparar);
        System.out.println(persona.getNombre() + (esMenor ? " es" : " no es") + " menor que " + edadComparar + " años");

        System.out.println("Información de la persona:");
        personaServis.mostrarPersona(persona);
    }
    
}
