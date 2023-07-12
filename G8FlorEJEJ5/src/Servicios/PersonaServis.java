/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import ENTIDADES.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ARG
 */
/*Método crearPersona que pida al usuario Nombre y fecha de nacimiento
de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo
de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true
si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
 */
public class PersonaServis {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona;

    public Date crearPersona() {
        
        System.out.println("ingrese nombre ");
        String nombre = sc.next();
        System.out.println("ingrese dia de nacimiento ");
        int dia = sc.nextInt();
        System.out.println("ingrese mes de nacimiento ");
        int mes = sc.nextInt() - 1;
        System.out.println("ingrese año de nacimiento ");
        int anio = sc.nextInt() - 1900;
        return new Date(anio, mes, dia);

    }
    public  Date fechaActual(){
        System.out.println("ingrese fecha actual");
        System.out.println(" dia");
        int dia = sc.nextInt();
        System.out.println("mes ");
        int mes = sc.nextInt()-1;
        System.out.println("año");
        int anio = sc.nextInt()-1900;
        
            return new Date(anio, mes, dia);
        
    }
       public int calcularDiferencia(Date fechaNacimiento, Date fechaActual) {
        long milisegundosPorAnio = 1000L * 60 * 60 * 24 * 365;
        long diferenciaMilisegundos = fechaActual.getTime() - fechaNacimiento.getTime();
        int edad = (int) (diferenciaMilisegundos / milisegundosPorAnio);

        return edad;
       }
    public int calcularEdad(Persona persona){
        Date fechaActual = new Date();
        return calcularDiferencia(persona.getFechaDeNacimiento(), fechaActual);
        
    }
    public boolean menorQue(Persona persona, int edad){
        int edadPersona = calcularEdad(persona);
        return edadPersona<edad;
        
    }
    public void mostrarPersona(Persona persona ){
        System.out.println("nombre: "+persona.getNombre());
        System.out.println("fecha de nacimiento : "+ persona.getFechaDeNacimiento());
    }

}
