/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eddsem.pkg4;

/**
 *
 * @author LABORATORIO 04
 */
public class EdDSem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.encolar("prueba1");
        
        String datoCola = cola.getFrente().toString();
        System.out.println(datoCola);
        
        System.out.println(cola.getUltimo().toString());
        
        //Agregamos un segundo nodo a la cola
        cola.encolar("Prueba2");
        System.out.println(cola.getFrente().toString());
        System.out.println(cola.getUltimo().toString());
        
        cola.encolar("Prueba3");
        cola.encolar("Prueba4");
        cola.encolar("Prueba5");
        cola.encolar("Prueba6");
        cola.encolar("Prueba7");
        
        System.out.println("Ejecutando metodo Atender");
        NodoC nodoAtendido = cola.atender();
        System.out.println(nodoAtendido.toString());
        //Verificamos el ultimo
        System.out.println("Nodo ultimo:");
        System.out.println(cola.getUltimo().toString());
        //Verificamos el frente
        System.out.println("Nodo frente:");
        System.out.println(cola.getFrente().toString());
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        
        Rutinas rutinas = new Rutinas(cola);
        Boolean resultadoBusqueda1 = rutinas.Encuentra("Prueba1");
        System.out.println("El resultado de busqueda 'Prueba6' es: " + resultadoBusqueda1);
        
        Boolean resultadoBusqueda2 = rutinas.Encuentra("tareaPrueba6");
        System.out.println("El resultado de busqueda 'tareaPrueba6' es: " + resultadoBusqueda2);
    }
    
}
