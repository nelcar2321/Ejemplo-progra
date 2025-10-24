package co.edu.uptc.view;
/*
 * autor: Nelson Santiago Carrillo Guerrero
 * Date: 26/08/2025
 * description: view de interaccion con el usuario
 */
import java.util.Scanner;
import java.time.LocalDate;
public class IOManager {
    private Scanner scanner = new Scanner(System.in);

    public String getUsernameInput() {
        System.out.print("Usuario: ");
        return scanner.nextLine();
    }

    public String getPasswordInput() {
        System.out.print("Contraseña: ");
        return scanner.nextLine();
    }

    public void showLoginResult(boolean success) {
        String fechaActual = LocalDate.now().toString(); // Para mostrar la fecha actual con java.time

        if (success) {
            System.out.println(fechaActual + " Acceso concedido.");
        } else {
            System.out.println(fechaActual + " Usuario o contraseña incorrectos.");
        }
    }
}
