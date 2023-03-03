/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_josueham;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author skxka
 */
public class administrarUsuarios {

    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private File archivo = null;

    public administrarUsuarios() {
    }

    public administrarUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrarUsuarios{" + "listaUsuarios=" + listaUsuarios + '}';
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaUsuarios = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/|");
                while (sc.hasNext()) {
                    listaUsuarios.add(new Usuario(sc.nextInt(),
                            sc.next(),
                            sc.next(),
                            sc.next()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuario t : listaUsuarios) {
                bw.write(t.getUsername()+ "|");
                bw.write(t.getPassword()+ "|");
                bw.write(t.getEdad()+ "|");
                bw.write(t.getTipo()+ "|");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
}
