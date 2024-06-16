package AdminstrarVentasMVC;

import Conector_Firebase.conexion;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Precondition;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProductosProvider {

    CollectionReference reference;

    static Firestore db;

    public static boolean guardarProducto(String coleccion, String documento, Map<String, Object> data) {
        db = FirestoreClient.getFirestore();
        try {
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.set(data);
            System.out.println("Guardado Correctamente");
            return true;
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return false;
    }

    public static boolean actualizarProducto(String coleccion, String documento, Map<String, Object> data) {
        db = FirestoreClient.getFirestore();
        try {
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.update(data);
            System.out.println("Actualizado Correctamente");
            return true;
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return false;
    }

    public static boolean eliminarProducto(String coleccion, String documento) {
        db = FirestoreClient.getFirestore();
        try {
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.delete(Precondition.NONE);
            System.out.println("Eliminado Correctamente");
            return true;
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return false;
    }

    public static void cargarTabla(JTable table) {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Producto");
        //model.addColumn("Stock");
        model.addColumn("Unidades vendidas");
        model.addColumn("Precio");
        //model.addColumn("Ingresos Brutos");
        //model.addColumn("Utilidad");

        try {
            CollectionReference productosV = conexion.db.collection("Producto Vendido");
            ApiFuture<QuerySnapshot> querySnap = productosV.get();

            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                model.addRow(new Object[]{
                    document.getId(),
                    document.getString("Nombre"),
                    document.getDouble("Unidades Vendidas"),
                    document.getDouble("Precio"), 
                });

            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }
        table.setModel(model);
    }
    private static DefaultTableModel model;

    public static void buscarProducto(String buscar, JTable table) {
    if (model == null) {
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        //model.addColumn("Stock");
        model.addColumn("Unidades Vendidas");
        model.addColumn("Precio");
        //model.addColumn("Ingresos Brutos");
        //model.addColumn("Utilidad");
    } else {
        model.setRowCount(0); // Limpiar filas existentes
    }

    try {
        CollectionReference productos = conexion.db.collection("Producto Vendido");
        String buscarFin = buscar + '\uf8ff'; // Esto crea un rango de búsqueda para las subcadenas
        ApiFuture<QuerySnapshot> querySnap = productos
                .whereGreaterThanOrEqualTo("Producto", buscar)
                .whereLessThanOrEqualTo("Producto", buscarFin)
                .get();

        for (DocumentSnapshot document : querySnap.get().getDocuments()) {
            model.addRow(new Object[]{
                document.getId(),
                document.getString("Nombre"),
                document.getDouble("Unidades Vendidas"),
                document.getDouble("Precio")
            });
        }
    } catch (InterruptedException | ExecutionException e) {
        System.err.println("Error: " + e.getMessage());
    }
    table.setModel(model);
}
    
}
