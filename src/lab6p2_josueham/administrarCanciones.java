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
 * @author skxka
 */
public class administrarCanciones {
    private ArrayList<Cancion> listaCanciones = new ArrayList<>();
    private File archivo = null;
    
    public administrarCanciones(String path) {
        archivo = new File(path);
    }

    public administrarCanciones() {
    }

    public ArrayList<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrarCanciones{" + "listaCanciones=" + listaCanciones + ", archivo=" + archivo + '}';
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Cancion t : listaCanciones) {
                bw.write(t.getTitulo()+ "|");
                bw.write(t.getDuracion()+ "|");
                bw.write(t.getReferencia()+ "\n");
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
            String[] caca = st.split("\\|");
            listaCanciones.add(new Cancion(caca[0], caca[1], caca[2]));
            System.out.println(st);
        }

    }
}
