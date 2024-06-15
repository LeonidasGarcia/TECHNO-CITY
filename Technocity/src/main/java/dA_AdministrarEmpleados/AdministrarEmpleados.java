package dA_AdministrarEmpleados;

import dA_Repositorio_Firebase.RepositorioFireBase;
import java.util.Map;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.SwingConstants;

// @author Leonidas Garcia Lescano
public class AdministrarEmpleados {

    public RepositorioFireBase cfb;
    
    public AdministrarEmpleados() {
        cfb = new RepositorioFireBase();
        
        cfb.conectar();
    }

    public void cargarTablaEmpleados(JTable table) {

        DefaultTableModel model = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        model.addColumn("ID EMPLEADO");
        model.addColumn("APELLIDOS");
        model.addColumn("NOMBRES");
        model.addColumn("CARGO");
        model.addColumn("SUELDO");
        model.addColumn("TELEFONO");
        model.addColumn("E-MAIL");

        cfb.cargarEmpleados(model);

        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                model.isCellEditable(i, j);
            }
        }

        table.setModel(model);

        table.getTableHeader().setReorderingAllowed(false);
        table.getColumnModel().getColumn(6).setMinWidth(200);

        //Centrar texto en las celdas de la tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

    }

    public void guardarEmpleado(String coleccion, String documento, Map<String, Object> data) {
        cfb.guardarEmpleado(coleccion, documento, data);
    }

    public void eliminarEmpleado(String coleccion, String documento) {
        cfb.eliminarEmpleado(coleccion, documento);
    }

    public void actualizarEmpleado(String coleccion, String documento, Map<String, Object> data) {
        cfb.actualizarEmpleado(coleccion, documento, data);
    }
}
