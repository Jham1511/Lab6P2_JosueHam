/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_josueham;

/**
 *
 * @author skxka
 */
public class Cancion {
    private String titulo, duracion, referencia;

    public Cancion() {
    }

    public Cancion(String titulo, String duracion, String referencia) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.referencia = referencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return "Cancion" + "\nTitulo: " + titulo 
                + "\nDuracion: " + duracion 
                + "\nReferencia: " + referencia;
    }
    
    
}
