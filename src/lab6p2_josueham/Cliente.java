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
public class Cliente extends Usuario{
    private ArrayList<Cancion> cancionesFav = new ArrayList<>();
    private ArrayList<Playlist> playlistsCreadas = new ArrayList<>();
    private ArrayList<Playlist> playlistsFav = new ArrayList<>();

    public Cliente() {
        super();
    }

    public Cliente(int edad, String username, String password, String tipo) {
        super(edad, username, password, tipo);
    }

    

    public ArrayList<Cancion> getCancionesFav() {
        return cancionesFav;
    }

    public void setCancionesFav(ArrayList<Cancion> cancionesFav) {
        this.cancionesFav = cancionesFav;
    }

    public ArrayList<Playlist> getPlaylistsCreadas() {
        return playlistsCreadas;
    }

    public void setPlaylistsCreadas(ArrayList<Playlist> playlistsCreadas) {
        this.playlistsCreadas = playlistsCreadas;
    }

    public ArrayList<Playlist> getPlaylistsFav() {
        return playlistsFav;
    }

    public void setPlaylistsFav(ArrayList<Playlist> playlistsFav) {
        this.playlistsFav = playlistsFav;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
    
    
}
