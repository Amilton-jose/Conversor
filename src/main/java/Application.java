import challenger.conversor.controller.MenuUIController;
import challenger.conversor.view.MenuUI;

import javax.swing.*;

public class Application {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            MenuUIController controllerMenuUI = new MenuUIController(new MenuUI());
        });
    }
}
