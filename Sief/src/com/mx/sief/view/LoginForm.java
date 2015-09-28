/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.sief.view;

import com.mx.sief.controller.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Black_Travel
 */
public class LoginForm extends JFrame implements ActionListener {

    private Login login;
    private JLabel labelTitulo, labelSeleccion, lblUser, lblPass;
    private JButton acces;
    public JTextField txtUser;
    public JPasswordField txtPass;

    /**
     * constructor de la clase donde se inicializan todos los componentes de la
     * ventana principal
     */
    public LoginForm() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        acces = new JButton();
        acces.setBounds(240, 280, 120, 25);
        acces.setText("Accesar");

        labelTitulo = new JLabel();
        labelTitulo.setText("CREDENCIALES");
        labelTitulo.setBounds(60, 40, 380, 30);
        labelTitulo.setFont(new java.awt.Font("Verdana", 1, 15));

        lblUser = new JLabel();
        lblUser.setText("USUARIO");
        lblUser.setBounds(70, 100, 120, 30);
        lblUser.setFont(new java.awt.Font("Verdana", 1, 15));

        lblPass = new JLabel();
        lblPass.setText("CONTRASEÑA");
        lblPass.setBounds(70, 150, 120, 30);
        lblPass.setFont(new java.awt.Font("Verdana", 1, 15));

        txtUser = new JTextField();
        txtPass = new JPasswordField();
        txtUser.setBounds(250, 100, 150, 40);
        txtPass.setBounds(250, 150, 150, 40);

        labelSeleccion = new JLabel();
        labelSeleccion.setText("Hoy es un buen día!");
        labelSeleccion.setBounds(75, 240, 250, 25);
        acces.addActionListener(this);
        add(acces);
        add(labelSeleccion);
        add(labelTitulo);
        add(txtUser);
        add(txtPass);
        add(lblUser);
        add(lblPass);

        setSize(480, 350);
        setTitle("SIEF : Sistema Integral De Enlaces Farmacéuticos");
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == acces) {
           login=new Login();
            login.valUsuarios(txtUser.getText(), txtPass.getText());
            System.out.println("Execute btn");
        }
    }
}
