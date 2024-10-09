/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eddsem.pkg4;

/**
 *
 * @author LABORATORIO 04
 */
public class Cola {
    private NodoC frente;
    private NodoC ultimo;

    public NodoC getFrente() {
        return frente;
    }

    public void setFrente(NodoC frente) {
        this.frente = frente;
    }

    public NodoC getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoC ultimo) {
        this.ultimo = ultimo;
    }
    
    public void encolar(String dato){
        //Creamos el nuevo nodo con el dato
        NodoC nuevoNodo = new NodoC(dato);
        
        //En caso de que la cola este vacia:
        if(this.frente == null){
            //definimos el frente y el ultimo de la cola
            this.frente = nuevoNodo;
            this.ultimo = nuevoNodo;
        }else{
        //En caso que la cola tenga elementos:
        //Paso 1: al actual ultimo, le actualizamos el atributo atras a el nuevo nodo qe acabamos de crear
        
        this.ultimo.setAtras(nuevoNodo);
        
        //Paso 2: actualizar el atributo ultimo de la cola, apuntar al nuevo nodo que ahora sera el ultimo
        this.setUltimo(nuevoNodo);
        }
    }
    
    public NodoC atender(){
        //siempre se atiende el primero que se inserta, es decir, el del frente
        
        //Paso 1: Copiamos el frente de una variable auxiliar
        NodoC actual = this.frente;
        
        //Paso 2: Ahora el nuevo frente sera el que estaba atras del frente
        this.frente = actual.getAtras();
        
        //Paso 3: Eliminar la referencia de Atras del nodo extraido
        actual.setAtras(null);
        
        return actual;
        
    }
}
