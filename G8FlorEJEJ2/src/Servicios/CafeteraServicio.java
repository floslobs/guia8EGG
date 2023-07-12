/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Cafetera;

/**
 *
 * @author ARG
 */
/*Programa Nespresso. Desarrolle una clase Cafetera en el paquete
Entidades con los atributos capacidadMáxima (la cantidad máxima de
café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Agregar constructor vacío y con
parámetros así como setters y getters. Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada.
*/
public class CafeteraServicio {
    
    public void llenarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        
    }
    public void servirTaza(Cafetera cafetera, int taza) {
          if (cafetera.getCantidadActual() >= taza) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
            System.out.println("La taza se llenó completamente.");
        } else {
            System.out.printf("La taza no se pudo llenar completamente. Quedó con %d ml de café.\n", cafetera.getCantidadActual());
            cafetera.setCantidadActual(0);
            
          }
    }
    
    
    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
    }
      public void agregarCafe(Cafetera cafetera, int cantidadCafe) {
        int nuevaCantidad = cafetera.getCantidadActual() + cantidadCafe;
        if (nuevaCantidad > cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        } else {
            cafetera.setCantidadActual(nuevaCantidad);
        }
        
      }    
}
