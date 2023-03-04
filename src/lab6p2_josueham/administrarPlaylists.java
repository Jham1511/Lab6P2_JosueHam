/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_josueham;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author SKX Kafei
 */
public class administrarPlaylists {
    private ArrayList<Playlist> listaPlaylists = new ArrayList<>();
    File archivo = null;

    public administrarPlaylists(String path) {
        archivo=new File(path);
    }

    public administrarPlaylists() {
    }

    public ArrayList<Playlist> getListaPlaylists() {
        return listaPlaylists;
    }

    public void setListaPlaylists(ArrayList<Playlist> listaPlaylists) {
        this.listaPlaylists = listaPlaylists;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Playlist t : listaPlaylists) {
                bw.write(t.getNombre()+ "|");
                bw.write(t.getCreador()+ "|");
                bw.write(t.getConteoLikes()+ "\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo1() throws FileNotFoundException, IOException {

        BufferedReader br
                = new BufferedReader(new FileReader("./canciones.txt"));

        String st;
        while ((st = br.readLine()) != null) {
            String[] tokens = st.split("\\|");
            listaPlaylists.add(new Playlist(tokens[0], tokens[1], Integer.parseInt(tokens[2])));
        }

    }
}
