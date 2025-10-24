/*
 * autor: Nelson Santiago Carrillo Guerrero
 * Date: 26/08/2025
 * description: Clase que representa un login de usuario
 */
package co.edu.uptc.model;
public class Login {
    public String username;
    public String password;

    private String userRegex = "pepito perez";
    private String passRegex = "contraseña";

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean esValido() {
        return username.matches(userRegex) && password.matches(passRegex);
    }
}
