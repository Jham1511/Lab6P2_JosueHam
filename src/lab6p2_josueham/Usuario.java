package lab6p2_josueham;

/**
 *
 * @author skxka
 */
public class Usuario {

    protected int edad;
    protected String username, password;

    public Usuario() {
    }

    public Usuario(String username, String password, int edad) {
        this.username = username;
        this.password = password;
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

    @Override
    public String toString() {
        return "Usuario" + "\nUsername: " + username;
    }
}
