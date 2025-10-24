/*
 * autor: Nelson Santiago Carrillo Guerrero
 * Date: 26/08/2025
 * description: inicializa el sistema de login
 */
package co.edu.uptc.run;

import co.edu.uptc.presenter.Presenter;
import co.edu.uptc.view.IOManager;

public class Main {
    public static void main(String[] args) {
        IOManager ioManager = new IOManager();
        Presenter presenter = new Presenter(ioManager);
        presenter.init();
    }
}
