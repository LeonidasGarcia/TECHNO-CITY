package AdminstrarVentasMVC;
/**
 *
 * @author LENOVO
 */
public class ProgProductoVendido {
    VentanaVentas objVentanaV;
    public ProgProductoVendido(){
        objVentanaV = new VentanaVentas();
    }
    public static void main(String args[]) {
       ProgProductoVendido objProductoV = new ProgProductoVendido();
       objProductoV.mostrarVentana();
    }
    public void mostrarVentana (){
        objVentanaV.setVisible(true);
    }
}
