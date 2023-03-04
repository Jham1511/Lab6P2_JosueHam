package lab6p2_josueham;

import javax.swing.JOptionPane;

/**
 *
 * @author skxka
 */
public class Usuario {

    protected int edad;
    protected String username, password,tipo;

    public Usuario() {
    }

    public Usuario(int edad, String username, String password, String tipo) {
        if (edad >= 18 && tipo.equals("Artista")) {
            this.edad = edad;
        } else if (edad >= 12 && tipo.equals("Cliente")){
            this.edad = edad;
        } else {
            String strEdad = JOptionPane.showInputDialog(this, "Ingrese una edad valida");
            this.edad = Integer.parseInt(strEdad);
        }
        this.username = username;
        this.password = password;
        this.tipo = tipo;
    }

    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario" + "\nUsername: " + username;
    }
}
