package challenger.conversor.controller;

import challenger.conversor.services.ServiceConvertTemperature;
import challenger.conversor.view.TemperaturaUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperaturaUIController implements ActionListener {
    private TemperaturaUI temperaturaUI;
    private ServiceConvertTemperature convertTemperature;

    public TemperaturaUIController(TemperaturaUI temperaturaUI) {
        this.temperaturaUI = temperaturaUI;
        this.convertTemperature = new ServiceConvertTemperature();

        this.temperaturaUI.getOptionConversion().addActionListener(this);
        this.temperaturaUI.getBtnOK().addActionListener(this);
        this.temperaturaUI.getTxtValorConverter().addActionListener(this);
        this.temperaturaUI.getTxtValorConvertido().addActionListener(this);
        this.temperaturaUI.getBtnLimpar().addActionListener(this);
        this.temperaturaUI.getBtnCancelar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == temperaturaUI.getBtnOK()) {
            int opcao = temperaturaUI.getOptionConversion().getSelectedIndex();
            switch (opcao) {
                case 1 -> {
                    if (temperaturaUI.getTxtValorConverter().getText().matches("^[A-Za-z]*")) {
                        JOptionPane.showMessageDialog(null, "Digite somente números.", "Erro", JOptionPane.ERROR_MESSAGE, null);
                        temperaturaUI.getTxtValorConverter().setText("");
                        temperaturaUI.getTxtValorConvertido().setText("");
                    } else {
                        double valor = Double.parseDouble(temperaturaUI.getTxtValorConverter().getText());
                        double result = convertTemperature.ConvertCelsiusToFahrenheit(valor);
                        temperaturaUI.getTxtValorConvertido().setText(String.valueOf(result));
                    }
                }
                case 2 -> {
                    if (temperaturaUI.getTxtValorConverter().getText().matches("^[A-Za-z]*")) {
                        JOptionPane.showMessageDialog(null, "Digite somente números.", "Erro", JOptionPane.ERROR_MESSAGE, null);
                        temperaturaUI.getTxtValorConverter().setText("");
                        temperaturaUI.getTxtValorConvertido().setText("");
                    } else {
                        double valor1 = Double.parseDouble(temperaturaUI.getTxtValorConverter().getText());
                        double result1 = convertTemperature.ConvertFahrenheitToCelsius(valor1);
                        temperaturaUI.getTxtValorConvertido().setText(String.valueOf(result1));
                    }
                }
                case 3 -> {
                    if (temperaturaUI.getTxtValorConverter().getText().matches("^[A-Za-z]*")) {
                        JOptionPane.showMessageDialog(null, "Digite somente números.", "Erro", JOptionPane.ERROR_MESSAGE, null);
                        temperaturaUI.getTxtValorConverter().setText("");
                        temperaturaUI.getTxtValorConvertido().setText("");
                    } else {
                        double valor2 = Double.parseDouble(temperaturaUI.getTxtValorConverter().getText());
                        double result2 = convertTemperature.ConvertCelsiusToKelvin(valor2);
                        temperaturaUI.getTxtValorConvertido().setText(String.valueOf(result2));
                    }
                }
                case 4 -> {
                    if (temperaturaUI.getTxtValorConverter().getText().matches("^[A-Za-z]*")) {
                        JOptionPane.showMessageDialog(null, "Digite somente números.", "Erro", JOptionPane.ERROR_MESSAGE, null);
                        temperaturaUI.getTxtValorConverter().setText("");
                        temperaturaUI.getTxtValorConvertido().setText("");
                    } else {
                        double valor3 = Double.parseDouble(temperaturaUI.getTxtValorConverter().getText());
                        double result3 = convertTemperature.ConvertKelvinToCelsius(valor3);
                        temperaturaUI.getTxtValorConvertido().setText(String.valueOf(result3));
                    }
                }
                case 5 -> {
                    if (temperaturaUI.getTxtValorConverter().getText().matches("^[A-Za-z]*")) {
                        JOptionPane.showMessageDialog(null, "Digite somente números.", "Erro", JOptionPane.ERROR_MESSAGE, null);
                        temperaturaUI.getTxtValorConverter().setText("");
                        temperaturaUI.getTxtValorConvertido().setText("");
                    } else {
                        double valor4 = Double.parseDouble(temperaturaUI.getTxtValorConverter().getText());
                        double result4 = convertTemperature.ConvertFahrenheitTokelvin(valor4);
                        temperaturaUI.getTxtValorConvertido().setText(String.valueOf(result4));
                    }
                }
                case 6 -> {
                    double valor5 = 0;
                    if (temperaturaUI.getTxtValorConverter().getText().matches("^[A-Za-z]*")) {
                        JOptionPane.showMessageDialog(null, "Digite somente números.", "Erro", JOptionPane.ERROR_MESSAGE, null);
                        temperaturaUI.getTxtValorConverter().setText("");
                        temperaturaUI.getTxtValorConvertido().setText("");
                    }else {
                        valor5 = Double.parseDouble(temperaturaUI.getTxtValorConverter().getText());
                        double result5 = convertTemperature.ConvertKelvinToFahrenheit(valor5);
                        temperaturaUI.getTxtValorConvertido().setText(String.valueOf(result5));
                    }

                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Opção inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
                    temperaturaUI.getTxtValorConverter().setText("");
                    temperaturaUI.getTxtValorConvertido().setText("");
                }
            }
        } else if (e.getSource() == temperaturaUI.getBtnCancelar()) {
            temperaturaUI.getjFrame().setVisible(false);
        } else if (e.getSource() == temperaturaUI.getBtnLimpar()) {
            temperaturaUI.getTxtValorConverter().setText("");
            temperaturaUI.getTxtValorConvertido().setText("");
        }
    }
}
