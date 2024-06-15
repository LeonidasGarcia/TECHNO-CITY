package dA_Repositorio_Firebase;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Precondition;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LEONIDAS GARCIA LESCANO
 */
public class RepositorioFireBase {

    private Firestore db;

    //CONEXION INICIAL CON FIRESTORE DATABASE
    public void conectar() {

        try {
            FileInputStream credenciales = new FileInputStream("credencialesFireBase.json");

            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(credenciales))
                    .build();

            FirebaseApp.initializeApp(options);
            db = FirestoreClient.getFirestore();

            System.out.println("Éxito al conectar");

        } catch (IOException e) {
            System.err.println("No existe el archivo");
        }

    }

    //RELLENA LOS DATOS DE LA TABLA DE EMPLEADOS
    public void cargarEmpleados(DefaultTableModel model) {

        try {

            CollectionReference empleados = db.collection("Empleados");
            ApiFuture<QuerySnapshot> querySnap = empleados.get();

            for (DocumentSnapshot docSnap : querySnap.get().getDocuments()) {
                model.addRow(new Object[]{
                    docSnap.getId(),
                    docSnap.getString("apellidos"),
                    docSnap.getString("nombres"),
                    docSnap.getString("cargo"),
                    docSnap.getString("sueldo"),
                    docSnap.getString("numero_celular"),
                    docSnap.getString("correo_electronico")
                });
            }
            
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("ERROR");
        }
    }

    public boolean guardarEmpleado(String coleccion, String documento, Map<String, Object> data) {

        db = FirestoreClient.getFirestore();

        try {
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.set(data);
            System.out.println("Guardado correctamente");
            return true;

        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarEmpleado(String coleccion, String documento) {

        db = FirestoreClient.getFirestore();

        try {
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.delete(Precondition.NONE);
            System.out.println("Eliminado correctamente");
            return true;

        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarEmpleado(String coleccion, String documento, Map<String, Object> data) {

        db = FirestoreClient.getFirestore();

        try {
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.update(data);
            System.out.println("Guardado correctamente");
            return true;

        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            return false;
        }
    }

}
