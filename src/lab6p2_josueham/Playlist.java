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
public class Playlist {
    private String nombre;
    private int conteoLikes;
    private ArrayList<Cancion> songs = new ArrayList<>();

    public Playlist() {
    }

    public Playlist(String nombre, int conteoLikes) {
        this.nombre = nombre;
        this.conteoLikes = conteoLikes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getConteoLikes() {
        return conteoLikes;
    }

    public void setConteoLikes(int conteoLikes) {
        this.conteoLikes = conteoLikes;
    }

    public ArrayList<Cancion> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Cancion> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Playlist" + "\nNombre: " + nombre 
                + "\nConteo de Likes: " + conteoLikes;
    }
    
    
}
