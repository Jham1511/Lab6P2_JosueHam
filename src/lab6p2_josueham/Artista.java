/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_josueham;

import java.util.ArrayList;

/**
 *
 * @author skxka
 */
public class Artista extends Usuario{
    private String nombre;
    private ArrayList<Cancion> cancionesPubli = new ArrayList();
    private ArrayList<Album> albumesPubli = new ArrayList<>();

    public Artista() {
        super();
    }

    public Artista(String nombre, int edad, String username, String password, String tipo) {
        super(edad, username, password, tipo);
        this.nombre = nombre;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCancionesPubli() {
        return cancionesPubli;
    }

    public void setCancionesPubli(ArrayList<Cancion> cancionesPubli) {
        this.cancionesPubli = cancionesPubli;
    }

    public ArrayList<Album> getAlbumesPubli() {
        return albumesPubli;
    }

    public void setAlbumesPubli(ArrayList<Album> albumesPubli) {
        this.albumesPubli = albumesPubli;
    }

    @Override
    public String toString() {
        return super.toString()+"\nArtista" + "nombre=" + nombre;
    }
    
    
}
