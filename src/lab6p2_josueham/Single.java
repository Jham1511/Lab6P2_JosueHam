/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_josueham;

import java.util.Date;

/**
 *
 * @author skxka
 */
public class Single extends Lanzamiento{
    private Cancion cancion;

    public Single() {
        super();
    }

    public Single(Cancion cancion, String titulo, String fechaLanza, int likes) {
        super(titulo, fechaLanza, likes);
        this.cancion = cancion;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSingle" + "\nCancion: " + cancion;
    }
    
    
}