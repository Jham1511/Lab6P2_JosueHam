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
public class Lanzamiento {
    private String titulo;
    private String fechaLanza;
    private int likes;

    public Lanzamiento() {
    }

    public Lanzamiento(String titulo, String fechaLanza, int likes) {
        this.titulo = titulo;
        this.fechaLanza = fechaLanza;
        this.likes = likes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaLanza() {
        return fechaLanza;
    }

    public void setFechaLanza(String fechaLanza) {
        this.fechaLanza = fechaLanza;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Lanzamiento" 
                + "\nTitulo: " + titulo 
                + "\nFecha de Lanzamiento: " + fechaLanza 
                + "\nLikes: " + likes;
    }
    
    
}
