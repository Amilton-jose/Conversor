package challenger.conversor.controller;

import challenger.conversor.model.Moeda;
import challenger.conversor.services.ServiceCambio;
import challenger.conversor.view.ConversorUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.math.BigDecimal;


public class ConversorUIController implements ActionListener {
    private final ConversorUI conversorUI;
    private Moeda moeda;

    public ConversorUIController(ConversorUI conversorUI) {
        this.conversorUI = conversorUI;
        ServiceCambio serviceCambio = new ServiceCambio();
        moeda = new Moeda();

        this.conversorUI.getOptionConversion().addActionListener(this);
        this.conversorUI.getBtnOK().addActionListener(this);
        this.conversorUI.getTxtValorConverter().addActionListener(this);
        this.conversorUI.getTxtValorConvertido().addActionListener(this);
        this.conversorUI.getBtnLimpar().addActionListener(this);
        this.conversorUI.getBtnCancelar().addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int opcaoSelecionada = conversorUI.getOptionConversion().getSelectedIndex();
        if (e.getSource() == conversorUI.getBtnOK()) {
            BigDecimal valor;
            String valorConvertido;
            switch (opcaoSelecionada) {
                case 1 -> {
                    if (conversorUI.getTxtValorConverter().getText().matches("^[A-Za-z]*")) {
                        JOptionPane.showMessageDialog(null, "Digite somente números.", "Erro", JOptionPane.ERROR_MESSAGE, null);
                        conversorUI.getTxtValorConverter().setText("");
                        conversorUI.getTxtValorConvertido().setText("");
                    } else {
                        valor = moeda.toBigDecimal(conversorUI.getTxtValorConverter().getText());
                        valorConvertido = String.valueOf(ServiceCambio.converterCambio("BRL", "USD", valor));
                        conversorUI.getTxtValorConvertido().setText("$: " + valorConvertido);
                    }
                }
                case 2 -> {
                    if (conversorUI.getTxtValorConverter().getText().matches("^[A-Za-z]*")) {
                        JOptionPane.showMessageDialog(null, "Digite somente números.", "Erro", JOptionPane.ERROR_MESSAGE, null);
                        conversorUI.getTxtValorConverter().setText("");
                        conversorUI.getTxtValorConvertido().setText("");
                    } else {
                        valor = moeda.toBigDecimal(conversorUI.getTxtValorConverter().getText());
                        valorConvertido = String.valueOf(ServiceCambio.converterCambio("BRL", "EUR", valor));
                        conversorUI.getTxtValorConvertido().setText("€: " + valorConvertido);
                    }
                }
                case 3 -> {
                    if (conversorUI.getTxtValorConverter().getText().matches("^[A-Za-z]*")) {
                        JOptionPane.showMessageDialog(null, "Digite somente números.", "Erro", JOptionPane.ERROR_MESSAGE, null);
                        conversorUI.getTxtValorConverter().setText("");
                        conversorUI.getTxtValorConvertido().setText("");
                    } else {
                        valor = moeda.toBigDecimal(conversorUI.getTxtValorConverter().getText());
                        valorConvertido = String.valueOf(ServiceCambio.converterCambio("BRL", "GBP", valor));
                        conversorUI.getTxtValorConvertido().setText("£: " + valorConvertido);
                    }
                }
                case 4 -> {
                    if (conversorUI.getTxtValorConverter().getText().matches("^[A-Za-z]*")) {
                        JOptionPane.showMessageDialog(null, "Digite somente números.", "Erro", JOptionPane.ERROR_MESSAGE, null);
                        conversorUI.getTxtValorConverter().setText("");
                        conversorUI.getTxtValorConvertido().setText("");
                    } else {
                        valor = moeda.toBigDecimal(conversorUI.getTxtValorConverter().getText());
                        valorConvertido = String.valueOf(ServiceCambio.converterCambio("BRL", "JPY", valor));
                        conversorUI.getTxtValorConvertido().setText("¥: " + valorConvertido);
                    }
                }
                case 5 -> {
                    if (conversorUI.getTxtValorConverter().getText().matches("^[A-Za-z]*")) {
                        JOptionPane.showMessageDialog(null, "Digite somente números.", "Erro", JOptionPane.ERROR_MESSAGE, null);
                        conversorUI.getTxtValorConverter().setText("");
                        conversorUI.getTxtValorConvertido().setText("");
                    } else {
                        valor = moeda.toBigDecimal(conversorUI.getTxtValorConverter().getText());
                        valorConvertido = String.valueOf(ServiceCambio.converterCambio("BRL", "KRW", valor));
                        conversorUI.getTxtValorConvertido().setText("₩: " + valorConvertido);
                    }
                }
                case 6 -> {
                    if (conversorUI.getTxtValorConverter().getText().matches("^[A-Za-z]*")) {
                        JOptionPane.showMessageDialog(null, "Digite somente números.", "Erro", JOptionPane.ERROR_MESSAGE, null);
                        conversorUI.getTxtValorConverter().setText("");
                        conversorUI.getTxtValorConvertido().setText("");
                    } else {
                        valor = moeda.toBigDecimal(conversorUI.getTxtValorConverter().getText());
                        valorConvertido = String.valueOf(ServiceCambio.converterCambio("USD", "BRL", valor));
                        conversorUI.getTxtValorConvertido().setText("R$: " + valorConvertido);
                    }
                }
                case 7 -> {
                    if (conversorUI.getTxtValorConverter().getText().matches("^[A-Za-z]*")) {
                        JOptionPane.showMessageDialog(null, "Digite somente números.", "Erro", JOptionPane.ERROR_MESSAGE, null);
                        conversorUI.getTxtValorConverter().setText("");
                        conversorUI.getTxtValorConvertido().setText("");
                    } else {
                        valor = moeda.toBigDecimal(conversorUI.getTxtValorConverter().getText());
                        valorConvertido = String.valueOf(ServiceCambio.converterCambio("EUR", "BRL", valor));
                        conversorUI.getTxtValorConvertido().setText("R$: " + valorConvertido);
                    }
                }
                case 8 -> {
                    if (conversorUI.getTxtValorConverter().getText().matches("^[A-Za-z]*")) {
                        JOptionPane.showMessageDialog(null, "Digite somente números.", "Erro", JOptionPane.ERROR_MESSAGE, null);
                        conversorUI.getTxtValorConverter().setText("");
                        conversorUI.getTxtValorConvertido().setText("");
                    } else {
                        valor = moeda.toBigDecimal(conversorUI.getTxtValorConverter().getText());
                        valorConvertido = String.valueOf(ServiceCambio.converterCambio("GBP", "BRL", valor));
                        conversorUI.getTxtValorConvertido().setText("R$: " + valorConvertido);
                    }
                }
                case 9 -> {
                    if (conversorUI.getTxtValorConverter().getText().matches("^[A-Za-z]*")) {
                        JOptionPane.showMessageDialog(null, "Digite somente números.", "Erro", JOptionPane.ERROR_MESSAGE, null);
                        conversorUI.getTxtValorConverter().setText("");
                        conversorUI.getTxtValorConvertido().setText("");
                    } else {
                        valor = moeda.toBigDecimal(conversorUI.getTxtValorConverter().getText());
                        valorConvertido = String.valueOf(ServiceCambio.converterCambio("JPY", "BRL", valor));
                        conversorUI.getTxtValorConvertido().setText("R$: " + valorConvertido);
                    }
                }
                case 10 -> {
                    if (conversorUI.getTxtValorConverter().getText().matches("^[A-Za-z]*")) {
                        JOptionPane.showMessageDialog(null, "Digite somente números.", "Erro", JOptionPane.ERROR_MESSAGE, null);
                        conversorUI.getTxtValorConverter().setText("");
                        conversorUI.getTxtValorConvertido().setText("");
                    } else {
                        valor = moeda.toBigDecimal(conversorUI.getTxtValorConverter().getText());
                        valorConvertido = String.valueOf(ServiceCambio.converterCambio("KRW", "BRL", valor));
                        conversorUI.getTxtValorConvertido().setText("R$: " + valorConvertido);
                    }
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Opção inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
                    conversorUI.getTxtValorConverter().setText("");
                    conversorUI.getTxtValorConvertido().setText("");
                }
            }
        } else if (e.getSource() == conversorUI.getBtnCancelar()) {
            conversorUI.getjFrame().setVisible(false);
        } else if (e.getSource() == conversorUI.getBtnLimpar()) {
            conversorUI.getTxtValorConverter().setText("");
            conversorUI.getTxtValorConvertido().setText("");
        }
    }
}
