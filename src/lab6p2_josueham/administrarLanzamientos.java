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
import javax.crypto.AEADBadTagException;

/**
 *
 * @author SKX Kafei
 */
public class administrarLanzamientos {

    private ArrayList<Lanzamiento> listaLanzamientos = new ArrayList<>();
    private File archivo = null;

    public administrarLanzamientos(String path) {
        archivo = new File(path);
    }

    public administrarLanzamientos() {
    }

    public ArrayList<Lanzamiento> getListaLanzamientos() {
        return listaLanzamientos;
    }

    public void setListaLanzamientos(ArrayList<Lanzamiento> listaLanzamientos) {
        this.listaLanzamientos = listaLanzamientos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrarLanzamientos{" + "listaLanzamientos=" + listaLanzamientos + ", archivo=" + archivo + '}';
    }
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Lanzamiento t : listaLanzamientos) {
                bw.write(t.getTitulo()+ "|");
                bw.write(t.getFechaLanza().toString()+ "|");
                bw.write(t.getLikes()+ "\n");
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
            listaLanzamientos.add(new Lanzamiento(tokens[0], tokens[1], Integer.parseInt(tokens[2])));
        }

    }
}
