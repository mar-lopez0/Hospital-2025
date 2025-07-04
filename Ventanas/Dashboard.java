package Ventanas;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends JScrollPane {

    public Dashboard() {
        // Definimos las columnas y los datos de ejemplo
        String[] columnas = { "ID", "Nombre", "Edad" };
        Object[][] datos = {
            { 1, "Ana", 20 },
            { 2, "Luis", 22 },
            { 3, "María", 19 }
        };

        // Creamos el modelo y la tabla
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);

        // Insertamos la tabla dentro del JScrollPane (this)
        this.setViewportView(tabla);
    }
}
