package Ventanas;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablaPanel extends JScrollPane {

    public TablaPanel() {
        String[] columnas = { "ID", "Nombre", "Edad" };
        Object[][] datos = {
            { 1, "Ana", 20 },
            { 2, "Luis", 22 },
            { 3, "María", 19 }
        };

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);

        this.setViewportView(tabla);
    }
}
