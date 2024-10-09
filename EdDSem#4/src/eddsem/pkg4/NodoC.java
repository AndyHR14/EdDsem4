/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eddsem.pkg4;

/**
 *
 * @author LABORATORIO 04
 */
public class NodoC {
    private String dato; //el dato en crudo
    private NodoC atras; 

    public NodoC(String dato) {
        this.dato = dato;
    }

    //metodos Setter
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    //metodos Getter
    public NodoC getAtras() {
        return atras;
    }

    public void setAtras(NodoC atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return "NodoC{" + "dato=" + dato + '}';
    }
    
    
}
