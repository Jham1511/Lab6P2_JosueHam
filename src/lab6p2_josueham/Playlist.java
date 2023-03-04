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
    private String nombre, creador;
    private int conteoLikes;
    private ArrayList<Cancion> songs = new ArrayList<>();

    public Playlist() {
    }

    public Playlist(String nombre, String creador, int conteoLikes) {
        this.nombre = nombre;
        this.creador = creador;
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

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Playlist" 
                + "\nNombre de artista: " + nombre 
                + "\nCreador: " + creador 
                + "\nConteo de Likes: " + conteoLikes 
                + "\nCanciones: " + songs;
    }

   
    
    
}
