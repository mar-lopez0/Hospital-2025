package Vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;

public class LoginPanel {

    
    private JPanel panelLogin;


    public LoginPanel() {

        
        panelLogin = new JPanel();
        panelLogin.setPreferredSize(new Dimension(500, 800)); 
        panelLogin.setOpaque(true);                         
        panelLogin.setBackground(Color.WHITE);               
        panelLogin.setLayout(new GridBagLayout());          

        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 80, 10, 20);               
        gbc.fill = GridBagConstraints.HORIZONTAL;             
        gbc.weightx = 1.0;                                     

        

        
        JLabel titulo = new JLabel("Login", SwingConstants.CENTER);
        gbc.anchor = GridBagConstraints.CENTER;               
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;                                    
        panelLogin.add(titulo, gbc);                          

        
        JLabel labelUsuario = new JLabel("Usuario:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;                                    
        panelLogin.add(labelUsuario, gbc);

        
        JTextField entradaCorreo = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 1;
        panelLogin.add(entradaCorreo, gbc);

        
        JLabel labelContra = new JLabel("Contraseña:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panelLogin.add(labelContra, gbc);

        
        JPasswordField entradaContra = new JPasswordField();
        entradaContra.setPreferredSize(new Dimension(100, 30)); 
        gbc.gridx = 1;
        gbc.gridy = 2;
        panelLogin.add(entradaContra, gbc);

        
        JButton entradaBoton = new JButton("Iniciar");
        entradaBoton.setPreferredSize(new Dimension(100, 30));
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;               
        gbc.fill = GridBagConstraints.NONE;                  
        panelLogin.add(entradaBoton, gbc);
    }


    public JPanel getPanel() {
        return panelLogin;
    }
}