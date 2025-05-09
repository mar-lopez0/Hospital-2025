import javax.swing.JFrame;  //Importar la clase JFrame para crear una ventana.
import javax.swing.JLabel;  //Importar la clase JLabel para mostrar texto en la ventana.

public class Main {         //Define la clase principal llamada Main.

    public static void main(String[] args) {    // Método principal donde inicia la ejecución del programa.
        
        
        //Crear una ventana con JFrame
        JFrame miVentana = new JFrame();        // Crea una objeto JFrame (ventana).
        miVentana.setTitle("Hospital SCL");     // Establece el título de la ventana.
        miVentana.setSize(900, 800);            // Define el tamaño de la ventana: 900px ancho, 800px alto.
        miVentana.setVisible(true);             // Establecer si la ventana es visible en la pantalla.

        //Crear un texto con JLabel
        JLabel texto = new JLabel();            // Crear un JLabel (etiqueta de texto).
        texto.setText("Hola mundo");            // Asigna texto a la etiqueta.
        miVentana.add(texto);                   // Asigna un texto a la etiqueta.

        miVentana.setVisible(true);             //HAce visible la ventana
    }
    
}