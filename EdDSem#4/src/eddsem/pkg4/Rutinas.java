/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eddsem.pkg4;

/**
 *
 * @author LABORATORIO 04
 */
public class Rutinas {
    private Cola cola1;

    public Rutinas(Cola cola1) {
        this.cola1 = cola1;
    }
    
    public boolean Encuentra(String criterio){
        //Retorna false si no encuentra el valor, retorna true si si lo encuentra. 
        //La cola original no se debe modificar, por eso utilizamos una variable auxiliar
        Cola aux = this.cola1;
        if(aux.getFrente() == null){
            return false;
        }
        
        //comenzamos por el frente
        NodoC actual = aux.getFrente();
        do{
            if(actual.getDato().equals(criterio)){
            return true;
            }
            actual = actual.getAtras();
            
        } while(actual.getAtras()!= null);
            
       // while (condicionEvaluada){
            
        //}
        
        
        return false; //para que no muestre error por mientras
    }
}
