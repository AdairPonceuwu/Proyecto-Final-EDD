/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Spotify;

/**
 *
 * @author Usuario
 */
public class NodoArbol {
    Pista pista;
    NodoArbol hIzquierdo, hDerecho;
    public NodoArbol(Pista pista){
        this.pista=pista;
        this.hIzquierdo=null;
        this.hDerecho=null;
    }
}
