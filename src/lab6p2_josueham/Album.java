/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_josueham;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author skxka
 */
public class Album extends Lanzamiento{
    private ArrayList<Cancion> canciones = new ArrayList<>();
    private int cantidadCanc;

    public Album() {
        super();
    }

    public Album(String titulo, Date fechaLanza, int likes) {
        super(titulo, fechaLanza, likes);
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getCantidadCanc() {
        return cantidadCanc;
    }

    public void setCantidadCanc(int cantidadCanc) {
        this.cantidadCanc = cantidadCanc;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAlbum" 
                + "\nCanciones: " + canciones 
                + "\nCantidad de Canciones: " + cantidadCanc;
    }
    
    
    
}
