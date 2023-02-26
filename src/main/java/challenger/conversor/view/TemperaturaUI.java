package challenger.conversor.view;

import javax.swing.*;
import java.awt.*;




public class TemperaturaUI {

    JFrame jFrame;
    JPanel pnlPrincipal;
    JPanel pnlRodape;
    JLabel lblOptionConversion;
    JComboBox optionConversion;
    JLabel lblValorConverter;
    JTextField txtValorConverter;
    JLabel lblValorConvertido;
    JTextField txtValorConvertido;
    JButton btnOK;
    JButton btnCancelar;
    JButton btnLimpar;


    public TemperaturaUI() {
        inicializar();
    }

    private void inicializar() {
        jFrame = new JFrame();
        jFrame.setTitle("Temperatura");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(410, 250);
        jFrame.setLayout(null);
        jFrame.setResizable(false);


        //-----------Painel Principal-----------//
        pnlPrincipal = new JPanel(new GridLayout(6, 2));
        pnlPrincipal.setBounds(6, 25, 380, 150);


        lblOptionConversion = new JLabel("Escolha o tipo de conversão.");
        optionConversion = new JComboBox<>(new String[]{"Opções..","De Celsius para Fahrenheit",
                "De Fahrenheit para Celsius",
                "De Celsius para Kelvin",
                "De Kelvin para Celsius",
                "De Fahrenheit para Kelvin",
                "De Kelvin para Fahrenheit"});

        lblValorConverter = new JLabel("Insira o valor");
        int TAMANHO_TXT = 10;
        txtValorConverter = new JTextField(TAMANHO_TXT);

        lblValorConvertido = new JLabel("Valor convertido");
        txtValorConvertido = new JTextField(TAMANHO_TXT);
        txtValorConvertido.setEditable(false);


        pnlPrincipal.add(lblOptionConversion);
        pnlPrincipal.add(optionConversion);
        pnlPrincipal.add(lblValorConverter);
        pnlPrincipal.add(txtValorConverter);
        pnlPrincipal.add(lblValorConvertido);
        pnlPrincipal.add(txtValorConvertido);
        //-----------Painel Principal-----------//



        //----------Painel Rodapé---------------//
        pnlRodape = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlRodape.setBounds(75, 175, 250, 50);


        btnOK = new JButton("Ok");

        btnCancelar = new JButton("Cancelar");


        btnLimpar = new JButton("Limpar");


        pnlRodape.add(btnOK);
        pnlRodape.add(btnCancelar);
        pnlRodape.add(btnLimpar);
        pnlRodape.setVisible(true);


        //----------Painel Rodapé---------------//


        jFrame.add(pnlPrincipal);
        jFrame.add(pnlRodape);
        jFrame.setVisible(true);
    }

    public JComboBox getOptionConversion() {
        return optionConversion;
    }

    public JTextField getTxtValorConverter() {
        return txtValorConverter;
    }

    public JTextField getTxtValorConvertido() {
        return txtValorConvertido;
    }

    public JButton getBtnOK() {
        return btnOK;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public JButton getBtnLimpar() {
        return btnLimpar;
    }

    public JFrame getjFrame() {
        return jFrame;
    }
}



