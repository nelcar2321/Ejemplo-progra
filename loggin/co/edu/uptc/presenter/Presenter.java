package co.edu.uptc.presenter;
/*
 * autor: Nelson Santiago Carrillo Guerrero
 * Date: 26/08/2025
 * description: presenter que maneja la logica del login
 */
import co.edu.uptc.model.Login;
import co.edu.uptc.view.IOManager;

public class Presenter {
    private final IOManager ioManager;

    public Presenter(IOManager ioManager) {
        this.ioManager = ioManager;
    }

    public void init() {
        String username = ioManager.getUsernameInput();
        String password = ioManager.getPasswordInput();

        Login login = new Login(username, password);
        boolean isValid = validate(login);

        ioManager.showLoginResult(isValid);
    }

    private boolean validate(Login login) {
        String userRegex = "juan";
        String passRegex = "123456789";

        return login.username.matches(userRegex) && login.password.matches(passRegex);
    }
}
