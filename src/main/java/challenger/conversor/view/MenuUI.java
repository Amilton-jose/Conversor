package challenger.conversor.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUI {

    JFrame jFrame1;
    JPanel pnlPrincipal;
    JLabel lblComboBox;
    JComboBox<String> jcbOption;
    JPanel pnlRodape;
    JButton btnOk;
    JButton btnCancelar;


    public MenuUI() {
        inicializar();
    }

    private void inicializar() {
        jFrame1 = new JFrame();
        jFrame1.setTitle("Menu");
        jFrame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame1.setSize(300, 150);
        jFrame1.setLocationRelativeTo(null);
        jFrame1.getContentPane().setLayout(new FlowLayout());
        jFrame1.setResizable(false);

        //---------Painel Principal---------//
        pnlPrincipal = new JPanel();
        pnlPrincipal = new JPanel(new GridLayout(2, 2));

        lblComboBox = new JLabel("Escolha uma opção");
        jcbOption = new JComboBox<>(new String[]{"Conversões...",
                "Conversor de Moedas",
                "Conversor de Temperatura"});
        jcbOption.setPreferredSize(new Dimension(185, 25));


        pnlPrincipal.add(lblComboBox);
        pnlPrincipal.add(jcbOption);
        //---------Painel Principal---------//


        //---------Painel Rodapé------------//
        pnlRodape = new JPanel(new FlowLayout());

        btnOk = new JButton("Ok");
        btnOk.setPreferredSize(new Dimension(90, 25));

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setPreferredSize(new Dimension(90, 25));


        pnlRodape.add(btnOk);
        pnlRodape.add(btnCancelar);
        //---------Painel Rodapé------------//

        jFrame1.add(pnlPrincipal);
        jFrame1.add(pnlRodape);
        jFrame1.setVisible(true);
    }

    public JComboBox<String> getJcbOption() {
        return jcbOption;
    }

    public JButton getBtnOk() {
        return btnOk;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }


}

