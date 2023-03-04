/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_josueham;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
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

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Usuario t : listaUsuarios) {
                bw.write(t.getUsername() + "|");
                bw.write(t.getPassword() + "|");
                bw.write(t.getEdad() + "|");
                bw.write(t.getTipo() + "\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() throws FileNotFoundException, IOException {
        try {
            BufferedReader br
                    = new BufferedReader(new FileReader("./usuarios.txt"));

            String st;
            while ((st = br.readLine()) != null) {
                String[] tokens = st.split("\\|");
                int edad = Integer.parseInt(tokens[2]);
                for (int i = 0; i < tokens.length; i++) {
                    System.out.println("[" + tokens[i] + "]");
                }
                listaUsuarios.add(new Usuario(edad, tokens[0], tokens[1], tokens[3]));

                System.out.println(st);
            }
        } catch (Exception e) {
        }
    }

}
