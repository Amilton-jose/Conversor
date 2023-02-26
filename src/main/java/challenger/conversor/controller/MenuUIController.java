package challenger.conversor.controller;

import challenger.conversor.model.Temperatura;
import challenger.conversor.view.ConversorUI;
import challenger.conversor.view.MenuUI;
import challenger.conversor.view.TemperaturaUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUIController implements ActionListener {
    private final MenuUI menuUI;
    private ConversorUIController controllerConversorUI;
    private TemperaturaUIController temperaturaUIController;

    public MenuUIController(MenuUI menuUI) {
        this.menuUI = menuUI;

        this.menuUI.getJcbOption().addActionListener(this);
        this.menuUI.getBtnOk().addActionListener(this);
        this.menuUI.getBtnCancelar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int opcaoSelecionada = this.menuUI.getJcbOption().getSelectedIndex();
        if (e.getSource() == this.menuUI.getBtnOk()) {
            if (opcaoSelecionada == 0) {
                JOptionPane.showMessageDialog(null, "Opção inválida.", "ERRO", JOptionPane.ERROR_MESSAGE);
            } else if (opcaoSelecionada == 1) {
                controllerConversorUI = new ConversorUIController(new ConversorUI());
            } else if (opcaoSelecionada == 2) {
                temperaturaUIController = new TemperaturaUIController(new TemperaturaUI());
            }
        } else if (e.getSource() == this.menuUI.getBtnCancelar()) {
            System.exit(0);
        }
    }


}
