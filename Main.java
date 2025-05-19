import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import Vistas.LoginView;

public class Main {         //Define la clase principal llamada Main.

    public static void main(String[] args) {    // Método principal donde inicia la ejecución del programa.
        
        
        //Ventana
        JFrame miVentana = new JFrame();        // Crea una objeto JFrame (ventana).
        miVentana.setTitle("Hospital SCL");     // Establece el título de la ventana.
        miVentana.setSize(1000, 800);            // Define el tamaño de la ventana: 900px ancho, 800px alto.
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout());



        //Panel banner
        JPanel panelBanner = new  JPanel();
        panelBanner.setPreferredSize(new Dimension(500,800));
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.RED);
        miVentana.add(panelBanner, BorderLayout.WEST);


        //Panel login
        LoginView panelLogin = new LoginView();
        miVentana.add(panelLogin.getJPanel(), BorderLayout.CENTER);


    
        miVentana.setVisible(true);             //Hace visible la ventana
    }
    
}